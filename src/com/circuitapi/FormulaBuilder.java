package com.circuitapi;

public class FormulaBuilder {
    Formula getNewExpression(Operator operator) {
        switch (operator) {
            case AND:
                return new BinaryExpression(Operator.AND);
            case OR:
                return new BinaryExpression(Operator.OR);
            case NOT:
                return new UnaryExpression();
            default: return  null;
        }
    }
}
