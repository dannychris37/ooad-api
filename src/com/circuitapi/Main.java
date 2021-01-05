package com.circuitapi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Formula> formula = new ArrayList<>();
        FormulaBuilder formulaBuilder = new FormulaBuilder();
        Formula x1=formulaBuilder.getNewOperand();
        Formula x2=formulaBuilder.getNewOperand();
        Formula x3=formulaBuilder.getNewOperand();
        formula.add(formulaBuilder.getNewExpression(Operator.AND));
        formula.add(x1);
        formula.add(formulaBuilder.getNewExpression(Operator.OR));
        formula.add(x2);
        formula.add(x3);
        Circuit c = new Circuit(formula);
        x1.setValue(false);
        x2.setValue(true);
        x3.setValue(false);
        System.out.println(c.getValue());
    }
}
