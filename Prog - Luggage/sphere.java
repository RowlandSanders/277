public class sphere extends Luggage {
    
    private int r;
    
    public sphere(int r){
        
        super((float)((4/3) * Math.PI * (r * r * r)), "Sphere");
        this.r = r;
    }
    
    public String toString(){
        return "Sphere - Volume: " + getCurrentVolume() + "   Radius: " + r ;
    }
}
