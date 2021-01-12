package com.circuitapi;

public class DoubleUnaryExpression extends Expression {
    private Operator operator;

    protected DoubleUnaryExpression(Operator operator) {
        this.operator = operator;
    }

    @Override
    public boolean getValue() {
        return getDValue() > 0.0 ? true : false;
    }

    @Override
    double getDValue() {
        return 1 - lhs.getDValue();
    }

    @Override
    public void setValue(boolean value) {}

    @Override
    void setValue(double value) {

    }
}
