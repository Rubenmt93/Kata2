
package kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

 
public class Histogram<T> {
    private T[] data;
    Map<Integer, Integer> histogram= new HashMap<>();   
    
    public Histogram(){
        this.data= (T[]) new Object [] {};
    }
    
    public void fillData(){
        System.out.println("Tamaño del vector:");
        Scanner input = new Scanner(System.in);
        Object [] aux;
        aux = new Object[input.nextInt()];
        for(int i=0; i<aux.length; i++){
            System.out.println("Introduzca elemento número:" + (i+1));
            aux[i] = input.nextInt();
        }
        data= (T[]) aux;
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