package edu.ro.utcn.cal.pt.Project1.test;

import edu.ro.utcn.cal.pt.Project1.Logic.*;
import edu.ro.utcn.cal.pt.Project1.Noms.Monomial;
import edu.ro.utcn.cal.pt.Project1.Noms.Polynomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOperations {

    @Test
    public void test1(){
        Addition add = new Addition();
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial p3 = new Polynomial();
        p1.addMonom(new Monomial(3, 5));
        p2.addMonom(new Monomial(3, 10));
        p3.addMonom(new Monomial(3, 15));
        assertEquals("test add", add.operation(p1, p2), p3);
    }
    @Test
    public void test2(){
        Subtraction sub = new Subtraction();
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial p3 = new Polynomial();
        p1.addMonom(new Monomial(3, 5));
        p2.addMonom(new Monomial(3, 10));
        p3.addMonom(new Monomial(3, 5));
        assertEquals("test sub", sub.operation(p2, p1), p3);
    }
    @Test
    public void test3(){
        Multiplication mul = new Multiplication();
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial p3 = new Polynomial();
        p1.addMonom(new Monomial(3, 5));
        p2.addMonom(new Monomial(3, 10));
        p3.addMonom(new Monomial(6, 50));
        assertEquals("test mul", mul.operation(p2, p1), p3);
    }
    @Test
    public void test4(){
        Division div = new Division();
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial p3 = new Polynomial();
        Polynomial[] p4 = new Polynomial[2];
        p1.addMonom(new Monomial(5, 5));
        p2.addMonom(new Monomial(5, 5));
        p3.addMonom(new Monomial(0, 1));
        p4 = div.operation(p1, p2);
        assertEquals("test div", p4[0], p3);
    }
    @Test
    public void test5(){
        Derivation div = new Derivation();
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        p1.addMonom(new Monomial(3, 5));
        p2.addMonom(new Monomial(2, 15));
        assertEquals("test add", div.operation(p1), p2);
    }
    @Test
    public void test6(){
        Integration intgr = new Integration();
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        p1.addMonom(new Monomial(2, 3));
        p2.addMonom(new Monomial(3, 1));
        assertEquals("test add", intgr.operation(p1), p2);
    }
}
