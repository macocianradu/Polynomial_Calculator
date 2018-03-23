package edu.ro.utcn.cal.pt.Project1.test;

import edu.ro.utcn.cal.pt.Project1.Noms.Monomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMonomial {
    @Test
    public void test1(){
        Monomial m1 = new Monomial(3, 5);
        m1.add(new Monomial(3,10));
        assertEquals("test monom", m1, new Monomial(3, 15));
    }
    @Test
    public void test2(){
        Monomial m1 = new Monomial(2, 2);
        Monomial m2 = new Monomial(3, 6);
        assertEquals("iara test monom", new Monomial(5, 12), Monomial.multiply(m1, m2));
    }
}
