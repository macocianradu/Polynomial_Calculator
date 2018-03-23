package edu.ro.utcn.cal.pt.Project1.Logic;

import edu.ro.utcn.cal.pt.Project1.Noms.Monomial;
import edu.ro.utcn.cal.pt.Project1.Noms.Polynomial;

import java.util.ArrayList;

public class Division {
    public Polynomial[] operation (Polynomial p1, Polynomial p2){
        if(p2.terms.isEmpty()){
            System.out.println("Don't divide by zero. Just don't");
            return new Polynomial[2];
        }
        else {
            Polynomial[] res = new Polynomial[2];
            ArrayList<Monomial> addList = new ArrayList<Monomial>();
            res[0] = new Polynomial();
            res[1] = Polynomial.copy(p1);
            while(!res[1].terms.isEmpty() && res[1].getDegree() >= p2.getDegree()){
                Monomial m = new Monomial(0,0);
                m.grade = res[1].terms.get(0).grade-p2.terms.get(0).grade;
                m.coef  = res[1].terms.get(0).coef /p2.terms.get(0).grade;
                res[0].addMonom(m);
                Polynomial temp = new Polynomial();
                temp.terms.add(m);
                temp = new Multiplication().operation(temp, p2);
                res[1] = new Subtraction().operation(res[1], temp);
            }
            return res;
        }
    }
}
