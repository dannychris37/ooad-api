package com.circuitapi;

import java.util.ArrayList;

public class Circuit {
    Formula root;

    Circuit(ArrayList<Formula> formulas) {
        root = formulas.get(0);
        formCircuit(formulas);
    }

    Formula formCircuit(ArrayList<Formula> formulas) {
        if (formulas.isEmpty()) {
            return null;
        }
        Formula firstElement = formulas.remove(0);
        if(firstElement instanceof Operand) {
            return firstElement;
        } else {
            if(firstElement instanceof UnaryExpression) {
                ((UnaryExpression) firstElement).lhs = formCircuit(formulas);
                return firstElement;
            } else if(firstElement instanceof BinaryExpression) {
                ((BinaryExpression) firstElement).lhs = formCircuit(formulas);
                ((BinaryExpression) firstElement).rhs = formCircuit(formulas);
                return firstElement;
            }
        }
        return null;
    }

    boolean getValue() {
        return root.getValue();
    }

}
