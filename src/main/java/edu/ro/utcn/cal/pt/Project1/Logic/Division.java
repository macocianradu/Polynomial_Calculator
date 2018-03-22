package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monom;
import edu.ro.utcn.cal.pt.Project1.Noms.Polinom;

import java.util.ArrayList;

public class Division {
    public Polinom[] operation (Polinom p1, Polinom p2){
        if(p2.terms.isEmpty()){
            System.out.println("Don't divide by zero. Just don't");
            return new Polinom[2];
        }
        else {
            Polinom[] res = new Polinom[2];
            ArrayList<Monom> addList = new ArrayList<Monom>();
            res[0] = new Polinom();
            res[1] = Polinom.copy(p1);
            while(!res[1].terms.isEmpty() && res[1].getDegree() >= p2.getDegree()){
                Monom m = new Monom(0,0);
                m.grade = res[1].terms.get(0).grade-p2.terms.get(0).grade;
                m.coef  = res[1].terms.get(0).coef /p2.terms.get(0).grade;
                res[0].addMonom(m);
                Polinom temp = new Polinom();
                temp.terms.add(m);
                temp = new Multiplication().operation(temp, p2);
                res[1] = new Subtraction().operation(res[1], temp);
            }
            return res;
        }
    }
}
