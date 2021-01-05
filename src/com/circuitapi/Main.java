package com.circuitapi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Formula> formula = new ArrayList<>();
        FormulaBuilder formulaBuilder = new FormulaBuilder();
        formula.add(formulaBuilder.getNewExpression(Operator.AND));
        formula.add(formulaBuilder.getNewOperand(true));
        formula.add(formulaBuilder.getNewExpression(Operator.NOT));
        formula.add(formulaBuilder.getNewExpression(Operator.OR));
        formula.add(formulaBuilder.getNewOperand(false));
        formula.add(formulaBuilder.getNewOperand(true));
        Circuit c = new Circuit(formula);
        System.out.println(c.getValue());
    }
}
