package guru.qa;

import guru.qa.impl.*;

public enum Operation {
    SUM('+', new SumOperationHandler()),
    MULT('*', new MultOperationHandler()),
    MINUS('-', new MinusOperationHandler()),
    DELETE('/', new DelOperationHandler()),
    EXPONENTA('^', new ExponentaOperationHandler());

    private final char symbol;
    private final OperationHandler operation;

    Operation(char symbol, OperationHandler operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public char getSymbol() {
        return symbol;
    }

    public OperationHandler getOperation() {
        return operation;
    }

    public static Operation lookup(char symbol) {
        for (Operation operation : values()) {
            if (operation.getSymbol() == symbol)
                return operation;
        }
        throw new IllegalArgumentException("Cant find operation by given argument: " + symbol);
    }
}