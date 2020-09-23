/*

Rowland Sanders
Prog2 - CECS 277-01
Inheritance
09/22/2020
 I certify that this program is my own original work. I did not copy any part of this program from
any other source. I further certify that I typed each and every line of code in this program

 */


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ShippingContainer storage = new ShippingContainer();
        
        int choice;
        Scanner input = new Scanner(System.in);
        
        do{
            choice = menu();
            
            if(choice == 1){ //make
                storage = new ShippingContainer();
                
            }
            
            else if(choice == 2){ //add
                System.out.println("\n  --- Luggage Type Options --- \n1 - Box\n2 - Sphere\n3 - Cube\n4 - Pyramid\n5 - Cylinder\n" + "6 - Octagonal Prism\n7 - Tetrahedron\n8 - Cone\n");
                System.out.println("What luggage type would you like to add? ");
                
                int x = input.nextInt();
                storage.add(x);
            }
            
            else if(choice == 3){ //remove
                storage.display();
                System.out.print("Which luggage would you like to remove? ");
                
                int x = input.nextInt();
                storage.remove(x);
            }
            
            else if(choice == 4){ //show current
                storage.display();
            }
            
            else if(choice == 5){ //quit program
                System.out.println("Quiting program...");
            }
            
            else{ //invalid selection
                System.out.println("Please select an option from the menu \n"); 
            }
            
        }
        while(choice != 5); //end
        
    }

    public static int menu(){
        Scanner input = new Scanner(System.in);

        System.out.print("\n1) Create new Shipping Container\n2) Add luggage to Shipping Container\n" + "3) Remove luggage from Shipping Container\n4) Show luggage in the Shipping Container\n5) Quit\n");
        int s = input.nextInt();
        
        return s;
    }
}
