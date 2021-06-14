package guru.qa;

import guru.qa.impl.ConsoleReader;

public class Application {

    private static Writer writer;

    public static void main( String[] args) {
        String result = new Calculator(new ConsoleReader(), writer).start();
        System.out.println(result);
    }
}