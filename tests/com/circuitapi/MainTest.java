package com.circuitapi;

import junit.framework.TestCase;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainTest extends TestCase {

    public void testX1andX2() {
        ArrayList<Formula> formula = new ArrayList<>();
        FormulaBuilder formulaBuilder = new FormulaBuilder();
        Formula x1=formulaBuilder.getFormula(Operator.OPERAND);
        Formula x2=formulaBuilder.getFormula(Operator.OPERAND);
        formula.add(formulaBuilder.getFormula(Operator.AND));
        formula.add(x1);
        formula.add(x2);
        Circuit c = new Circuit(formula);
        x1.setValue(false);
        x2.setValue(true);
        assertFalse(c.getValue());
        x1.setValue(true);
        x2.setValue(true);
        assertTrue(c.getValue());
    }

    public void testX1andX2orX3() {
        ArrayList<Formula> formula = new ArrayList<>();
        FormulaBuilder formulaBuilder = new FormulaBuilder();
        Formula x1=formulaBuilder.getFormula(Operator.OPERAND);
        Formula x2=formulaBuilder.getFormula(Operator.OPERAND);
        Formula x3=formulaBuilder.getFormula(Operator.OPERAND);
        formula.add(formulaBuilder.getFormula(Operator.AND));
        formula.add(x1);
        formula.add(formulaBuilder.getFormula(Operator.OR));
        formula.add(x2);
        formula.add(x3);
        Circuit c = new Circuit(formula);
        x1.setValue(false);
        x2.setValue(true);
        x3.setValue(false);
        assertFalse(c.getValue());
        x1.setValue(true);
        x2.setValue(false);
        x2.setValue(true);
        assertTrue(c.getValue());
    }

    public void testAlwaysTrue(){
        ArrayList<Formula> formula = new ArrayList<>();
        FormulaBuilder formulaBuilder = new FormulaBuilder();
        Formula x1=formulaBuilder.getFormula(Operator.OPERAND);
        formula.add(formulaBuilder.getFormula(Operator.OR));
        formula.add(x1);
        formula.add(formulaBuilder.getFormula(Operator.NOT));
        formula.add(x1);
        Circuit c = new Circuit(formula);
        x1.setValue(false);
        assertTrue(c.getValue());
        x1.setValue(true);
        assertTrue(c.getValue());
    }

    public void testX1andNotPX2orX3P() {
        ArrayList<Formula> formula = new ArrayList<>();
        FormulaBuilder formulaBuilder = new FormulaBuilder();
        Formula x1=formulaBuilder.getFormula(Operator.OPERAND);
        Formula x2=formulaBuilder.getFormula(Operator.OPERAND);
        Formula x3=formulaBuilder.getFormula(Operator.OPERAND);
        formula.add(formulaBuilder.getFormula(Operator.AND));
        formula.add(x1);
        formula.add(formulaBuilder.getFormula(Operator.NOT));
        formula.add(formulaBuilder.getFormula(Operator.OR));
        formula.add(x2);
        formula.add(x3);
        Circuit c = new Circuit(formula);
        x1.setValue(false);
        x2.setValue(false);
        x3.setValue(false);
        assertFalse(c.getValue());
        x1.setValue(false);
        x2.setValue(true);
        x3.setValue(true);
        assertFalse(c.getValue());
        x1.setValue(true);
        x2.setValue(false);
        x3.setValue(false);
        assertTrue(c.getValue());
    }

    public void testNotX1andNotX2() {
        ArrayList<Formula> formula = new ArrayList<>();
        FormulaBuilder formulaBuilder = new FormulaBuilder();
        Formula x1=formulaBuilder.getFormula(Operator.OPERAND);
        Formula x2=formulaBuilder.getFormula(Operator.OPERAND);
        formula.add(formulaBuilder.getFormula(Operator.AND));
        formula.add(formulaBuilder.getFormula(Operator.NOT));
        formula.add(x1);
        formula.add(formulaBuilder.getFormula(Operator.NOT));
        formula.add(x2);
        Circuit c = new Circuit(formula);
        x1.setValue(true);
        x2.setValue(true);
        assertFalse(c.getValue());
        x1.setValue(false);
        x2.setValue(true);
        assertFalse(c.getValue());
        x1.setValue(false);
        x2.setValue(false);
        assertTrue(c.getValue());
    }

}