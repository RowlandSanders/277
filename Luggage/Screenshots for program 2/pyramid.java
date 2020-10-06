public class pyramid extends Luggage {
    
    private int BS,h;

    public pyramid(int BS, int h){
        
        super((float)((BS * BS * h) / 3), "Pyramid");
        
        this.BS = BS;
        this.h = h;
    }

    public String toString(){
        return "Pyramid - Volume: " + getCurrentVolume() + "   Base Side: " + BS + "   Height: " + h ;
        
    }
}
