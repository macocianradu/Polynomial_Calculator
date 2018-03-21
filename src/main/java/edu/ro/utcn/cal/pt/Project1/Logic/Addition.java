package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monom;
import edu.ro.utcn.cal.pt.Project1.Noms.Polinom;

public class Addition implements BinaryOperation {
    public Polinom operation(Polinom p1, Polinom p2) {
        Polinom res = new Polinom();
        for(Monom m1: p1.terms)
            res.addMonom(m1);
        for(Monom m2: p2.terms)
            res.addMonom(m2);
        return res;
    }
}
