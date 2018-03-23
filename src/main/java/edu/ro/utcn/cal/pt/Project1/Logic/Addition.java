package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monomial;
import edu.ro.utcn.cal.pt.Project1.Noms.Polynomial;

public class Addition implements BinaryOperation {
    public Polynomial operation(Polynomial p1, Polynomial p2) {
        Polynomial res = new Polynomial();
        for(Monomial m1: p1.terms)
            res.addMonom(m1);
        for(Monomial m2: p2.terms)
            res.addMonom(m2);
        return res;
    }
}
