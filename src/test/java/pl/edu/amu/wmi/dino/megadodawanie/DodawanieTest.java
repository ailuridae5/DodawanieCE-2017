/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.megadodawanie;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bikol
 */
public class DodawanieTest {
    
    public DodawanieTest() {
    }

    /**
     * Patryk Żywica
     */
    
    @Test
    public void testAdd() {
        assertEquals("0", Dodawanie.add("0", "0"));
    }
    @Test
    public void testAdd1() {
        assertEquals("5", Dodawanie.add("2", "3"));
    }
    @Test
    public void testAdd2() {
        Random rand = new Random();
        int a = rand.nextInt();
        int b = rand.nextInt();
        for(int i=0;i<1000; i++){
            assertEquals(Integer.toString(a+b), Dodawanie.add(Integer.toString(a), Integer.toString(b)));
        }
    }
    
        /**
         * Szymon Bladoszewski
         */
    @Test
    public void testAdd3() {
        assertEquals("5.01", Dodawanie.add("2.01", "3"));
    }
    
    @Test
    public void testAdd4() {
        assertEquals("1", Dodawanie.add("0,5", "0,5"));
    }
    
    @Test
    public void testAdd5() {
        assertEquals("2,147,483,650", Dodawanie.add("2,147,483,647", "3")); ///int size
    }
    /////////
}
