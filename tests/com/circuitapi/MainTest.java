package com.circuitapi;

import junit.framework.TestCase;

import java.util.ArrayList;

public class MainTest extends TestCase {
    public void testX1andX2() {
        ArrayList<Formula> formula = new ArrayList<>();
        FormulaBuilder formulaBuilder = new FormulaBuilder();
        Formula x1=formulaBuilder.getNewOperand();
        Formula x2=formulaBuilder.getNewOperand();
        formula.add(formulaBuilder.getNewExpression(Operator.AND));
        formula.add(x1);
        formula.add(x2);
        Circuit c = new Circuit(formula);
        x1.setValue(false);
        x2.setValue(true);
        assertEquals(false,c.getValue());
        x1.setValue(true);
        x2.setValue(true);
        assertEquals(true,c.getValue());

    }
    public void testX1andX2orX3() {
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
        assertEquals(false,c.getValue());
        x1.setValue(true);
        x2.setValue(false);
        x2.setValue(true);
        assertEquals(true,c.getValue());

    }
    public void testAlwaysTrue(){
        ArrayList<Formula> formula = new ArrayList<>();
        FormulaBuilder formulaBuilder = new FormulaBuilder();
        Formula x1=formulaBuilder.getNewOperand();
        formula.add(formulaBuilder.getNewExpression(Operator.OR));
        formula.add(x1);
        formula.add(formulaBuilder.getNewExpression(Operator.NOT));
        formula.add(x1);
        Circuit c = new Circuit(formula);
        x1.setValue(false);
        assertEquals(true,c.getValue());
        x1.setValue(true);
        assertEquals(true,c.getValue());
    }
}