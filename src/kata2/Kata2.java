
package kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kata2 {

    public static void main(String[] args) {
        int[] data= {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Map<Integer, Integer> histogram= new HashMap<>();   
   
       
        for(int i=0; i<data.length; i++){
           
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
         
        
        }      
        histogram.keySet().forEach((val) -> {
            System.out.println(" Valor: " + val +" Veces repetidos: " + histogram.get(val));
        });
    } 
}   
    

