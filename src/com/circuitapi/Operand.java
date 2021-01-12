package com.circuitapi;

public class Operand extends Formula {

    private boolean value;

    public boolean getValue() {
        return value;
    }

    @Override
    double getDValue() {
        return value ? 1.0 : 0.0;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    void setValue(double value) {
        try {
            throw new Exception("Operation not supported");
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
