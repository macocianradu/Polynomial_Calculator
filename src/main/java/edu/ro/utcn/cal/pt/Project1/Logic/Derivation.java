package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monom;
import edu.ro.utcn.cal.pt.Project1.Noms.Polinom;

public class Derivation implements MonoOperation {
    public Polinom operation(Polinom p1) {
        Polinom res = new Polinom();
        for (Monom m1 : p1.terms){
            m1.coef *= m1.grade;
            m1.grade --;
            res.addMonom(m1);
        }
        return res;
    }
}
