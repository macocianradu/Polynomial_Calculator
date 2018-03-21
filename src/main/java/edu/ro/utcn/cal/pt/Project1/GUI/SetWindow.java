package edu.ro.utcn.cal.pt.Project1.GUI;

import javax.swing.*;
import java.awt.*;

public class SetWindow {
    public SetWindow(GridBagConstraints c, JButton add, JButton sub, JButton div, JButton mul, JButton der, JButton integr, JButton exit, JTextField polinom1, JTextField polinom2, JLabel res, JPanel panel1) {
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.gridwidth = 3;
        c.insets = new Insets(10, 10, 25, 25);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        panel1.add(polinom1, c);

        c.gridx = 4;
        c.gridy = 0;
        c.weightx = 0;
        c.insets = new Insets(10, 25, 25, 10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        panel1.add(polinom2, c);

        c.gridx = 3;
        c.gridy = 1;
        c.weightx = 1;
        c.gridwidth = 2;
        c.insets = new Insets(25, 0, 25, 0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        panel1.add(res, c);

        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0.5;
        c.insets = new Insets(25, 10, 25, 10);
        c.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(add, c);

        c.gridx = 2;
        c.gridy = 2;
        c.weightx = 0.5;
        c.insets = new Insets(25, 10, 25, 10);
        c.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(der, c);

        c.gridx = 4;
        c.gridy = 2;
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(div, c);

        c.gridx = 0;
        c.gridy = 3;
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(integr, c);

        c.gridx = 2;
        c.gridy = 3;
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(mul, c);

        c.gridx = 4;
        c.gridy = 3;
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(sub, c);

        c.gridx = 2;
        c.gridy = 4;
        c.weightx = 0.5;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.PAGE_END;
        panel1.add(exit, c);
    }
}
