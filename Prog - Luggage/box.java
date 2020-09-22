public class box extends Luggage{
    
    private int l,w,h;

    public box(int l, int w, int h){
        
        super((float)((l * w * h)),"Box"); 
        
        this.l = l;
        this.w = w;
        this.h = h;
    }
    
    public String toString(){
        
        return "Box - Volume: " + getCurrentVolume() + "   Length: " + l + "   Width: " + w + "   Height: " + h +"";
    }
}