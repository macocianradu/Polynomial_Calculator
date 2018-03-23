package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monomial;
import edu.ro.utcn.cal.pt.Project1.Noms.Polynomial;

public class Subtraction implements BinaryOperation {
    public Polynomial operation(Polynomial p1, Polynomial p2) {
        Polynomial res = new Polynomial();
        Polynomial remove = new Polynomial();
        for(Monomial m1: p1.terms){
            res.addMonom(m1);
        }
        for(Monomial m1: p2.terms){
            m1.coef *= -1;
            res.addMonom(m1);
        }
        for(Monomial m1: res.terms){
            if(m1.coef == 0){
                remove.addMonom(m1);
            }
        }
        for(Monomial m1: remove.terms){
            res.terms.remove(m1);
        }
        return res;
    }
}
