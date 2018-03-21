package edu.ro.utcn.cal.pt.Project1.test;

import edu.ro.utcn.cal.pt.Project1.Noms.Monom;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMonom {
    @Test
    public void test1(){
        Monom m1 = new Monom(3, 5);
        m1.add(new Monom(3,10));
        assertEquals("test monom", m1, new Monom(3, 15));
    }
    /*@Test
    public void test2(){
        assertEquals("iara test monom", new Monom(3, 5), new Monom(2, 6));
    }*/
}
