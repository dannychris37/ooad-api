package com.circuitapi;

public class BinaryExpression extends Expression{
    Formula rhs;
    Operator operator;

    BinaryExpression(Operator operator ) {
        this.operator = operator;
    }

    @Override
    boolean getValue() {
        switch (operator) {
            case AND:
                return Boolean.logicalAnd(lhs.getValue(), rhs.getValue());
            case OR:
                return Boolean.logicalOr(lhs.getValue(), rhs.getValue());
        }
        return false;
    }

    @Override
    void setValue(boolean value) {}
}
