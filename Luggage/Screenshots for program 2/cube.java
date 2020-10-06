public class cube extends Luggage {
    
    private int l;
    
    public cube(int l){
        
        super((float)(l * l * l),"Cube");
        this.l = l;
    }
    
    public String toString(){
        return "Cube - Volume: " + getCurrentVolume() + "   Side: " + l;
    }
}
