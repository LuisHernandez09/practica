package gt.umg.repasoarreglos;

import java.util.Arrays;

public class RepasoArreglos {

    public static void main(String[] args) {
        long[] input;
        long[] result;
        input = new long[] {3,9};
        result = retornoSuma(input);
        System.out.println("Probando: " + Arrays.toString(input) + " - Resultado: " + Arrays.toString(result));

        //llamada uno envio null
        input=null;
        result= retornoSuma(input);
        System.out.println("Probando:"+Arrays.toString(input)+" - Resultado: " + Arrays.toString(result));
              
        //input 0 result 1
        input= new long[]{0};
        result= retornoSuma(input);
        System.out.println("Probando:"+Arrays.toString(input)+" - Resultado: " + Arrays.toString(result));
           
        //input vacio result vacio
        input= new long[]{};
        result= retornoSuma(input);
        System.out.println("Probando:"+Arrays.toString(input)+" - Resultado: " + Arrays.toString(result));
    
        //input 1,2 result 2,1
        input= new long[]{1,2};
        result= retornoSuma(input);
        System.out.println("Probando:"+Arrays.toString(input)+" - Resultado: " + Arrays.toString(result));
        
        // input 1 result 1
        input= new long[]{1};
        result= retornoSuma(input);
        System.out.println("Probando:"+Arrays.toString(input)+" - Resultado: " + Arrays.toString(result));
        
    }
    
    public static long[] retornoSuma(long[] input)
    {
        if(input==null)
         {
             return null;
         }   
        long[] temporal = new long[input.length];
        long[] inicio;
        long[] fin;
        long[] result = new long[input.length];
        for(int i = 0; i<input.length; i++)
        {
            inicio = Arrays.copyOfRange(input, 0, i);
            fin = Arrays.copyOfRange(input, i+1, input.length);
            temporal = new long[inicio.length+fin.length];
            System.arraycopy(inicio, 0, temporal, 0, inicio.length);
            System.arraycopy(fin, 0, temporal, inicio.length, fin.length);
            result[i]=Arrays.stream(temporal).reduce((a,b) -> a+b).orElse(1);
        }
        return result;
    }
    
}
