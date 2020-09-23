public class tetrahedron extends Luggage {
    
    private int s;
    
    public tetrahedron(int s){
        
        super((float)((Math.pow(s, 3) / (6 * Math.sqrt(2)))),"Tetrahedron");
        this.s = s;
    }
    
    public float getVolume(){
        return (float)(Math.pow(s, 3) / (6 * Math.sqrt(2)));
    }
    
    public String toString(){
        return "Tetrahedron - Volume: " + getVolume() + " Sides: " + s;
    }
}
