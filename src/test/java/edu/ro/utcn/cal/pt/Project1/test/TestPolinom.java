package edu.ro.utcn.cal.pt.Project1.test;

import edu.ro.utcn.cal.pt.Project1.Logic.*;
import edu.ro.utcn.cal.pt.Project1.Noms.Monom;
import edu.ro.utcn.cal.pt.Project1.Noms.Polinom;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPolinom {
    @Test
    public void test1(){
        Polinom p1 = new Polinom();
        Polinom p2 = new Polinom();
        Polinom p3;
        Subtraction sub = new Subtraction();
        p1.addMonom(new Monom(3, 10));
        p1.addMonom(new Monom(5,2));
        p2.addMonom(new Monom(3, 5));
        p2.addMonom(new Monom(3,5));
        p2.addMonom(new Monom(5,2));
        p1.terms.clear();
        assertEquals("test Polinom", p1);
    }
    /*@Test
    public void test2(){
        assertEquals("iara test monom", new Monom(3, 5), new Monom(2, 6));
    }*/
}
