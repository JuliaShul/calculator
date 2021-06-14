package guru.qa.service.mock;

import guru.qa.Operation;
import guru.qa.Reader;

public class MockReader implements Reader {

    int first;
    int second;
    Operation operation;

    public MockReader( int first, int second, Operation operation ) {
        this.first = first;
        this.second = second;
        this.operation = operation;
    }

    @Override
    public int readFirstArg() {
        return first;
    }

    @Override
    public int readSecondArg() {
        return second;
    }

    @Override
    public Operation readMathOperation() {
        return operation;
    }
}