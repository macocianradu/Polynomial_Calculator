package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monom;
import edu.ro.utcn.cal.pt.Project1.Noms.Polinom;

public class Subtraction implements BinaryOperation {
    public Polinom operation(Polinom p1, Polinom p2) {
        Polinom res = new Polinom();
        Polinom remove = new Polinom();
        for(Monom m1: p1.terms){
            res.addMonom(m1);
        }
        for(Monom m1: p2.terms){
            m1.coef *= -1;
            res.addMonom(m1);
        }
        for(Monom m1: res.terms){
            if(m1.coef == 0){
                remove.addMonom(m1);
            }
        }
        for(Monom m1: remove.terms){
            res.terms.remove(m1);
        }
        return res;
    }
}
