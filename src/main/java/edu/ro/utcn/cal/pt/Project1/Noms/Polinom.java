package edu.ro.utcn.cal.pt.Project1.Noms;

import java.util.ArrayList;

public class Polinom {
    public ArrayList<Monom> terms;
    private int degree;

    public Polinom(){
        terms = new ArrayList<Monom>();
    }

    public int getDegree(){
        for(Monom m: this.terms){
            if(m.grade > this.degree){
                this.degree = m.grade;
            }
        }
        return this.degree;
    }

    public void addMonom(Monom m){
        if(!this.terms.isEmpty())
            for(Monom x : this.terms){
                if(x.add(m))
                    return;
            }
        terms.add(m);
    }

    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if(obj instanceof Polinom) {
            Polinom pol = (Polinom) obj;
            return this.terms.equals(pol.terms);
        }
        return false;
    }

    public static Polinom copy(Polinom p){
        Polinom res = new Polinom();
        for(Monom m: p.terms){
            res.addMonom(new Monom(m.grade, m.coef));
        }
        return res;
    }

    @Override
    public String toString() {
        String str = "";
        for(Monom m : this.terms){
            if(m.coef > 0)
                str += "+";
            str += String.valueOf(m.coef) + "x^" + String.valueOf(m.grade);
            System.out.println("coeficient: "+ m.coef + "grad: " + m.grade);
        }
        if(str.length()>0)
            str = str.substring(1);
        else
            str = "0";
        return str;
    }
}
