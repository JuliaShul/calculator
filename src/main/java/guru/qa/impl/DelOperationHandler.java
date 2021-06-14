package guru.qa.impl;

import guru.qa.OperationHandler;

public class DelOperationHandler implements OperationHandler {
    @Override
    public int invoke(int first, int second) {
        return first / second;
    }
}