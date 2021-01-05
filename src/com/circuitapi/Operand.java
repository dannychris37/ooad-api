package com.circuitapi;

public class Operand extends Formula {

    boolean value;

    Operand(boolean value) {
        this.value = value;
    }

    boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

}
