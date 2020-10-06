public class cone extends Luggage {
    
    private int r,h;
    
    public cone(int r, int h){
        
        super((float)((Math.PI * (r * r) * h) / 3),"Cone");
        
        this.r = r;
        this.h = h;
    }
    
    public String toString() {
        return "Cone - Volume: " + getCurrentVolume() + "   Radius: " + r + "   Height: " + h;
    }
}
