package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monom;
import edu.ro.utcn.cal.pt.Project1.Noms.Polinom;

public class Integration implements MonoOperation {
    public Polinom operation(Polinom p) {
        Polinom res = new Polinom();
        Polinom remove = new Polinom();
        for (Monom m1 : p.terms){
            Monom aux = m1;
            aux.coef *= (double)1/aux.grade;
            aux.grade ++;
            res.addMonom(aux);
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
