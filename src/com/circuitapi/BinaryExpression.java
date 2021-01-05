package com.circuitapi;

public class BinaryExpression extends Expression{
    Formula rhs;

    BinaryExpression(Operator operator ) {}

    @Override
    boolean getValue() {
        return false;
    }
}
