public class cylinder extends Luggage {
    
    private int r,l;
    
    public cylinder(int r, int l){
        
        super((float)(Math.PI * (r * r) * l),"Cylinder");
        
        this.r = r;
        this.l = l;
        
    }
    
    public String toString(){
        return "Cylinder - Volume: " + getCurrentVolume() + "   Radius: " + r + "   Length: " + l;
    }
    
}
