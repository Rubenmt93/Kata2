
package kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

 
public class Histogram<T> {
    private final T[] data;
    Map<Integer, Integer> histogram= new HashMap<>();   
    
    public Histogram(T[] a){
        this.data=a;
    }

    public void fill(){
        for(int i=0; i<data.length; i++){
           
            if(histogram.containsKey(data[i])){
                histogram.put((Integer) data[i], histogram.get(data[i])+1);
            }else{
                histogram.put((Integer) data[i], 1);
            }
         
        
        }      
        
    }
    public void print(){    
        histogram.keySet().forEach((val) -> {
            System.out.println(" Valor: " + val +" Veces repetidos: " + histogram.get(val));
        });
    }
}