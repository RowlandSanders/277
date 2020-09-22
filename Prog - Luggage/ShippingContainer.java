import java.util.ArrayList;
import java.util.Scanner;

public class ShippingContainer {
    private ArrayList<Luggage> container = new ArrayList<>();

    public ShippingContainer(){
        
        container.add(new box(7,3,8));
        container.add(new sphere(8));
        container.add(new cube(4));
        container.add(new pyramid(8,3));
        container.add(new cylinder(8,4));

        container.add(new box(2,3,5));
        container.add(new cone(5, 7));
        container.add(new cone(6,5));
        container.add(new octagonalPrism(8,2));
        container.add(new tetrahedron(4));
        sort();
        
    }
    
    public void sort() {
        
        for (int i = 0; i < container.size(); i++) {
            
            for (int j = container.size() - 1; j > i; j--) {
                
                if (container.get(i).compareTo(container.get(j)) == 1) {
                    Luggage temp = container.get(i);
                    container.set(i,container.get(j));
                    container.set(j, temp);
                }
                
            }
        }
        
    }
    
    public void add(int x){
        Scanner scan = new Scanner(System.in);
        if(x == 1){
            System.out.println("Box height?");
            int h = scan.nextInt();
            System.out.println("Box length?");
            int l = scan.nextInt();
            System.out.println("Box width?");
            int w = scan.nextInt();

            
            container.add(new box(l,w,h));
            sort();
        }
        
        else if(x == 2){
            System.out.println("Sphere radius?");
            int r = scan.nextInt();
            
            container.add(new sphere(r));
            sort();
        }
        
        else if(x == 3){
            System.out.println("Cube side length?");
            int l = scan.nextInt();
            
            container.add(new cube(l));
            sort();
        }
        
        else if(x == 4){
            System.out.println("Pyramid base side length?");
            int b = scan.nextInt();
            System.out.println("Pyramid height?");
            int h = scan.nextInt();
            
            container.add(new pyramid(b, h));
            sort();
        }
        
        else if(x == 5){

            System.out.println("Cylinder length?");
            int l = scan.nextInt();
            System.out.println("Cylinder radius?");
            int r = scan.nextInt();
            
            container.add(new cylinder(r,l));
            sort();
        }
        
        else if(x == 6){
             System.out.println("Octagonal prism side length?");
            int s = scan.nextInt();
            System.out.println("Octagonal prism height?");
            int h = scan.nextInt();
            
            container.add(new octagonalPrism(s,h));
            sort();
            
        }
        
        else if(x == 7){
            System.out.println("Tetrahedron side length?");
            int s = scan.nextInt();
            
            container.add(new tetrahedron(s));
            sort();
        }
        
        else if(x == 8){
            System.out.println("Cone base radius?");
            int r = scan.nextInt();
            System.out.println("Cone height?");
            int h = scan.nextInt();
            
            container.add(new cone(r, h));
            sort();

        }
        
        else{
            System.out.println("Invalid Option");
        }
    }
    
    public void remove(int x){
        
        x -= 1;
        
        if(container.size() == 0){
            System.out.println("The Storage container is empty");
            
        }
        else if(container.size() > 0 && x < container.size() && x > 0){
            container.remove(x);
        }
        
        else if(x > container.size() || x <= 0){
            
            System.out.println("Invalid Selection.");
        }
    }
    
    public void display(){
        
        int curr = 1;
        float cVol = 0;
        
        System.out.println();
        System.out.println("  --- Current Storage Container Selection --- ");
        
        for(int i = 0; i < container.size(); i++){
            
            System.out.print("Luggage " + curr++ + " - ");
            System.out.println(container.get(i).toString());
            cVol = cVol + container.get(i).getCurrentVolume();
        }
        System.out.println("\n  --- Current Storage Container Statistics --- ");
        System.out.println("Current luggage count: "+ container.size() + " - Total volume of current luggage: "+ cVol);
        System.out.println("\n*All information is displayed in units, volume being units cubed");
    }
}
