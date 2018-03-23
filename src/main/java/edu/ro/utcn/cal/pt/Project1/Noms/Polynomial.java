package edu.ro.utcn.cal.pt.Project1.Noms;

import java.util.ArrayList;

public class Polynomial {
    public ArrayList<Monomial> terms;
    private int degree;

    public Polynomial(){
        terms = new ArrayList<Monomial>();
    }

    public int getDegree(){
        for(Monomial m: this.terms){
            if(m.grade > this.degree){
                this.degree = m.grade;
            }
        }
        return this.degree;
    }

    public void addMonom(Monomial m){
        if(!this.terms.isEmpty())
            for(Monomial x : this.terms){
                if(x.add(m))
                    return;
            }
        terms.add(m);
    }

    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if(obj instanceof Polynomial) {
            Polynomial pol = (Polynomial) obj;
            return this.terms.equals(pol.terms);
        }
        return false;
    }

    public static Polynomial copy(Polynomial p){
        Polynomial res = new Polynomial();
        for(Monomial m: p.terms){
            res.addMonom(new Monomial(m.grade, m.coef));
        }
        return res;
    }

    @Override
    public String toString() {
        String str = "";
        for(Monomial m : this.terms){
            if(m.coef > 0)
                str += "+";
            double roundOff = Math.round(m.coef * 100.0) / 100.0;
            str += String.valueOf(roundOff) + "x^" + String.valueOf(m.grade);
        }
        if(str.length()>0)
            str = str.substring(1);
        else
            str = "0";
        return str;
    }
}
