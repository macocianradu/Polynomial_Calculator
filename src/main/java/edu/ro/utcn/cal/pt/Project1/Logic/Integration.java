package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monomial;
import edu.ro.utcn.cal.pt.Project1.Noms.Polynomial;

public class Integration implements MonoOperation {
    public Polynomial operation(Polynomial p) {
        Polynomial res = new Polynomial();
        Polynomial remove = new Polynomial();
        for (Monomial m1 : p.terms){
            Monomial aux = m1;
            aux.coef *= (double)1/aux.grade;
            aux.grade ++;
            res.addMonom(aux);
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
