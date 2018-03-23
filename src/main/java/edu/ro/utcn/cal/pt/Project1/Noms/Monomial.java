package edu.ro.utcn.cal.pt.Project1.Noms;

public class Monomial {
    public double coef;
    public int grade;

    public Monomial(int grade, double coef){
        this.grade = grade;
        this.coef = coef;
    }

    private double getCoef(){
        return this.coef;
    }

    private int getGrade(){
        return this.grade;
    }

    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if(obj instanceof Monomial) {
            Monomial mon = (Monomial) obj;
            if(mon.coef == this.coef && mon.grade == this.grade){
                return true;
            }
        }
        return false;
    }

    public boolean add(Monomial m){
        if(this.grade == m.grade){
            this.coef += m.coef;
            return true;
        }
        return false;
    }

    public static Monomial multiply(Monomial m1, Monomial m2){
        Monomial res = new Monomial(0,1);
        res.grade = m1.grade + m2.grade;
        res.coef  = m1.coef * m2.coef;
        return res;
    }
}
