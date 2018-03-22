package edu.ro.utcn.cal.pt.Project1.GUI;

import edu.ro.utcn.cal.pt.Project1.Logic.*;
import edu.ro.utcn.cal.pt.Project1.Noms.Monom;
import edu.ro.utcn.cal.pt.Project1.Noms.Polinom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Window {
    private JTextField polinom1, polinom2;
    private JLabel res;
    private Addition addition;
    private Subtraction subtraction;
    private Derivation derivation;
    private Integration integration;
    private Multiplication multiplication;
    private Division division;
    private Polinom p1, p2;

    private Window(){
        JFrame window   = new JFrame("Calculator");
        JPanel panel1   = new JPanel(new GridBagLayout());
        polinom1        = new JTextField("Polinom 1");
        polinom2        = new JTextField("Polinom 2");
        JButton add     = new JButton("Addition");
        JButton der     = new JButton("Derivation");
        JButton div     = new JButton("Division");
        JButton integr  = new JButton("Integration");
        JButton mul     = new JButton("Multiplication");
        JButton sub     = new JButton("Substraction");
        JButton exit    = new JButton("Exit");
        res             = new JLabel("Result");
        addition        = new Addition();
        subtraction     = new Subtraction();
        derivation      = new Derivation();
        integration     = new Integration();
        multiplication  = new Multiplication();
        division        = new Division();

        window.setVisible(true);
        window.setSize(640, 480);
        window.setLocationRelativeTo(null);
        window.setContentPane(panel1);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagConstraints c = new GridBagConstraints();

        new SetWindow(c, add, sub, div, mul, der, integr, exit, polinom1, polinom2, res, panel1);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p1 = getPolinom(polinom1.getText());
                p2 = getPolinom(polinom2.getText());
                res.setText(addition.operation(p1, p2).toString());
            }
        });

        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p1 = getPolinom(polinom1.getText());
                p2 = getPolinom(polinom2.getText());
                res.setText(subtraction.operation(p1, p2).toString());
            }
        });

        der.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p1 = getPolinom(polinom1.getText());
                res.setText(derivation.operation(p1).toString());
            }
        });

        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p1 = getPolinom(polinom1.getText());
                p2 = getPolinom(polinom2.getText());
                res.setText(multiplication.operation(p1, p2).toString());
            }
        });

        integr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p1 = getPolinom(polinom1.getText());
                res.setText(integration.operation(p1).toString());
            }
        });

        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p1 = getPolinom(polinom1.getText());
                p2 = getPolinom(polinom2.getText());
                Polinom[] result = division.operation(p1, p2);
                res.setText(result[0].toString() + " rest: " + result[1].toString());
            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    private Polinom getPolinom(String Polinom){
        Pattern p = Pattern.compile("(-?\\b\\d+)[xX]\\^(-?\\d+\\b)");
        Matcher m = p.matcher(Polinom);
        Polinom p1 = new Polinom();
        while (m.find()){
            p1.terms.add(new Monom(Integer.parseInt(m.group(2)), Double.parseDouble(m.group(1))));
            System.out.println("Coef: " + m.group(1));
            System.out.println("Degree: " + m.group(2));
        }
        return p1;
    }

    public static void main(String[] args) {
        new Window();
    }
}
