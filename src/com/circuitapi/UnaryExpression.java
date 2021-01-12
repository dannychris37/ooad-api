package com.circuitapi;

public class UnaryExpression extends Expression{

    private Operator operator;

    protected UnaryExpression(Operator operator) {
        this.operator = operator;
    }

    @Override
    public boolean getValue() {
        return !lhs.getValue();
    }

    @Override
    double getDValue() {
        return getValue() ? 1.0 : 0.0;
    }

    @Override
    public void setValue(boolean value) {}

    @Override
    void setValue(double value) {}
}
