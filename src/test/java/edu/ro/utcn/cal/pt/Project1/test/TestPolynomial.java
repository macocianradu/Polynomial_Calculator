package edu.ro.utcn.cal.pt.Project1.test;

import edu.ro.utcn.cal.pt.Project1.Logic.*;
import edu.ro.utcn.cal.pt.Project1.Noms.Monomial;
import edu.ro.utcn.cal.pt.Project1.Noms.Polynomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPolynomial {
    @Test
    public void test1(){
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        p1.addMonom(new Monomial(3, 10));
        p1.addMonom(new Monomial(5,2));
        p2.addMonom(new Monomial(3, 5));
        p2.addMonom(new Monomial(3,5));
        p2.addMonom(new Monomial(5,2));
        assertEquals("test Polynomial", p1, p2);
    }
    /*@Test
    public void test2(){
        assertEquals("iara test monom", new Monomial(3, 5), new Monomial(2, 6));
    }*/
}
