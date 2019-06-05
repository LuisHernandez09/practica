/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.repasoarreglos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luis
 */
public class RepasoArreglosTest {
    

    @Test
    public void testRetornoSuma() {
        System.out.println("envio de un null se obtiene null");
        long[] input = null;
        long[] expResult = null;
        long[] result = RepasoArreglos.retornoSuma(input);
        assertArrayEquals(expResult, result);
        
    }
    
    @Test
    public void testRetornoSuma2() {
        System.out.println("envio un cero recibo un 1");
        long[] input = {0};
        long[] expResult = {1};
        long[] result = RepasoArreglos.retornoSuma(input);
        assertArrayEquals(expResult, result);
        
    }
    @Test
    public void testRetornoSuma3() {
        System.out.println("envio un 1 recibo un 1");
        long[] input = {1};
        long[] expResult = {1};
        long[] result = RepasoArreglos.retornoSuma(input);
        assertArrayEquals(expResult, result);
        
    }
    @Test
    public void testRetornoSuma4() {
        System.out.println("envio 1,2 y recibo2,1");
        long[] input = {1,2};
        long[] expResult = {2,1};
        long[] result = RepasoArreglos.retornoSuma(input);
        assertArrayEquals(expResult, result);
        
    }
    @Test
    public void testRetornoSuma5() {
        System.out.println("envio 1,2,3 y suma sin el mismo");
        long[] input = {1,2,3};
        long[] expResult = {5,4,3};
        long[] result = RepasoArreglos.retornoSuma(input);
        assertArrayEquals(expResult, result);
        
    }
}
