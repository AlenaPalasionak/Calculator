public interface Calculator {
    int add(int value1, int value2);

    int subtract(int value1, int value2);

    int divide(int value1, int value2) throws DivisionException;

    int multiply(int value1, int value2);
}