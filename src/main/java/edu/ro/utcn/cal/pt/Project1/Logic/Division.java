package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monom;
import edu.ro.utcn.cal.pt.Project1.Noms.Polinom;

public class Division {
    public Polinom[] operation (Polinom p1, Polinom p2){
        Polinom[] res = new Polinom[2];
        res[0] = new Polinom();
        res[1] = new Polinom();
        Polinom remove = new Polinom();
        for(Monom m1: p2.terms){
            for(Monom m2: res[0].terms){
                Monom aux = m1;
                aux.grade *= -1;
                m2 = Monom.multiply(aux, m2);
                aux.grade *= -1;
            }
        }
        for(Monom m1: res[0].terms){
            if(m1.coef == 0){
                remove.addMonom(m1);
            }
        }
        for(Monom m1: remove.terms){
            res[0].terms.remove(m1);
        }
        return res;
    }
}
