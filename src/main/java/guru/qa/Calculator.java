package guru.qa;

public class Calculator {

    private final Reader reader;
    private final Writer writer;
    public Calculator( Reader reader, Writer writer ) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.handleString(OperationMessage.FIRST_ARG.getOperationMessage());
        System.out.println("lease provide first argument");
        writer.handleString(OperationMessage.ENTER_NUMBERS.getOperationMessage());
        System.out.print("ведите два числа: ");
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        writer.handleString(OperationMessage.ENTER_OPERATOR.getOperationMessage());
        System.out.print("ведите оператор (+, *): ");
        Operation po = reader.readMathOperation();
        int sum = po.getOperation().invoke(first, second);
        writer.handleString(OperationMessage.RESULT.getOperationMessage());
        System.out.print("\nезультат:\n");
        return first + " " + po.getSymbol() + " " + second + " = " + sum;
    }
}