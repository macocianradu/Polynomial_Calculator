package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monomial;
import edu.ro.utcn.cal.pt.Project1.Noms.Polynomial;

import java.util.ArrayList;

public class Multiplication implements BinaryOperation {
    public Polynomial operation(Polynomial p1, Polynomial p2) {
        Polynomial res = new Polynomial();
        ArrayList<Monomial> addList = new ArrayList<Monomial>();
        for(Monomial m1: p1.terms){
            for(Monomial m2: p2.terms){
                addList.add(Monomial.multiply(m1, m2));
            }
        }
        for(Monomial m: addList){
            res.addMonom(m);
        }
        return res;
    }
}
