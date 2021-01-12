package com.circuitapi;

public class DoubleFormulaBuilder extends AbstractFormulaBuilder {
    @Override
    public Formula getFormula(Operator operator) {
        switch (operator) {
            case AND:
                return new DoubleBinaryExpression(Operator.AND);
            case OR:
                return new DoubleBinaryExpression(Operator.OR);
            case NOT:
                return new DoubleUnaryExpression(Operator.NOT);
            case OPERAND:
                return new DoubleOperand();
            default: return  null;
        }
    }
}
