
import gb_test.Decorator;
import gb_test.OtherClass;

/**
 * Основной класс
 */
public class Main {
    /**
     * точка входа в приложение
     * @param args параметры для расчетов
     */
    public static void main(String[] args) {
        int result = OtherClass.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(result));
    }
}