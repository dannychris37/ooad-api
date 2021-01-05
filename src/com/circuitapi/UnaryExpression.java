package com.circuitapi;

public class UnaryExpression extends Expression{

    Operator operator;

    UnaryExpression(Operator operator) {
        this.operator = operator;
    }

    @Override
    boolean getValue() {
        return !lhs.getValue();
    }

    @Override
    void setValue(boolean value) {}
}
