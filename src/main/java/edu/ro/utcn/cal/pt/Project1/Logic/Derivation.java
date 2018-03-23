package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monomial;
import edu.ro.utcn.cal.pt.Project1.Noms.Polynomial;

public class Derivation implements MonoOperation {
    public Polynomial operation(Polynomial p1) {
        Polynomial res = new Polynomial();
        for (Monomial m1 : p1.terms){
            m1.coef *= m1.grade;
            m1.grade --;
            res.addMonom(m1);
        }
        return res;
    }
}
