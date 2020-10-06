abstract class Luggage implements Comparable{
    
    float v;
    String t;

    public Luggage(float v, String t){
        
        this.v = v;
        this.t = t;
    }
    
    public float getCurrentVolume(){ //for total volume in display
        return v;
    }    
    
    public int compareTo(Object lug){
        
        Luggage type = (Luggage)lug;

        if(this.v > type.v){
            return 1;
        }
        
        else if(this.v < type.v){
            return -1;
        }
        
        else{
            return 0;
        }
    }
    

    
}
