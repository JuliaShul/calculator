package guru.qa.service.mock;

import guru.qa.Operation;
import guru.qa.Reader;
import guru.qa.Writer;

public class MockMultWriter implements Writer {

    @Override
    public String handleString( String inputString ) {
        return inputString;
    }
}