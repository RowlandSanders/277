public class octagonalPrism extends Luggage{
    
    private int s,h;
    
    public octagonalPrism(int s, int h){
        
        super((float)(((2 * (1 + Math.sqrt(2)) * (s * s) * h))),"Octagonal Prism");
        
        this.s = s;
        this.h = h;
        
    }
    
    public String toString(){
        return "Octagonal Prism - Volume: " + getCurrentVolume() + "   Side: " + s + "   Height: " + h ;
    }
    
}
