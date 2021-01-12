package com.circuitapi;

public class DoubleBinaryExpression extends Expression {
    protected Formula rhs;
    private Operator operator;

    protected DoubleBinaryExpression(Operator operator ) {
        this.operator = operator;
    }

    @Override
    public boolean getValue() {
        return getDValue() > 0 ? true : false;
    }

    @Override
    double getDValue() {
        switch (operator) {
            case AND:
                return lhs.getDValue() * rhs.getDValue();
            case OR:
                return 1 - (1 - lhs.getDValue()) * (1 - rhs.getDValue());
            case GTE:
                return (lhs.getDValue() >= rhs.getDValue()) ? 1.0 : 0.0;
        }
        return 0.0;
    }

    @Override
    public void setValue(boolean value) {}

    @Override
    void setValue(double value) {

    }
}
