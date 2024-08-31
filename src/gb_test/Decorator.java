package gb_test;

/**
 * класс для декорирования результата
 */
public class Decorator {
    public static String decorate(int a) {
        return String.format("Here is your number: %d.", a);
    }
}