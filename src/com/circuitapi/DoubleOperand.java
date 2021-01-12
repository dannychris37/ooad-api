package com.circuitapi;

public class DoubleOperand extends Formula {
    private double value;

    public boolean getValue() {
        return value > 0 ? true : false;
    }

    @Override
    double getDValue() {
        return value;
    }

    public void setValue(boolean value) {
        try {
            throw new Exception("Operation not suppported");
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    void setValue(double value) {
        this.value = value;
    }
}
