package guru.qa.impl;

import guru.qa.OperationHandler;

public class ExponentaOperationHandler implements OperationHandler {
    @Override
    public int invoke(int first, int second) {
        int result = (int) Math.pow(first, second);
        return result ;
    }
}