package guru.qa.impl;

import guru.qa.OperationHandler;

public class MinusOperationHandler implements OperationHandler {

    @Override
    public int invoke(int first, int second) {
        return first - second;
    }
}