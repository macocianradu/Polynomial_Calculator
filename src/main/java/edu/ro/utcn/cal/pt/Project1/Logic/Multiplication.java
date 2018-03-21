package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monom;
import edu.ro.utcn.cal.pt.Project1.Noms.Polinom;

import java.util.ArrayList;

public class Multiplication implements BinaryOperation {
    public Polinom operation(Polinom p1, Polinom p2) {
        Polinom res = new Polinom();
        ArrayList<Monom> addList = new ArrayList<Monom>();
        for(Monom m1: p1.terms){
            for(Monom m2: p2.terms){
                addList.add(Monom.multiply(m1, m2));
            }
        }
        for(Monom m: addList){
            res.addMonom(m);
        }
        return res;
    }
}
