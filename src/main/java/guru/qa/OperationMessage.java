package guru.qa;

public enum OperationMessage {
    FIRST_ARG("Please provide first argument"),
    ENTER_NUMBERS("Введите два числа: "),
    ENTER_OPERATOR("Введите оператор (+, *): "),
    RESULT("\nРезультат:\n");

    private final String message;

    public String getOperationMessage() {
        return message;
    }
    OperationMessage( String message ) {
        this.message = message;
    }
}