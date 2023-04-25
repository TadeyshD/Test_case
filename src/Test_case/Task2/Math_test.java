package Test_case.Task2;
/**
 * Напишите три тестовых случая для проверки корректности работы
 */
public class Math_test {
    public static void main(String[] args) {
        System.out.println(add(15, 4)); //тест основного функцинала. Сложение простых чисел
        System.out.println(add(-5,4)); //тест где a отрицательное число
        System.out.println(add(4, -5)); //тест где b отрицательное число
    }
    public static int add(int a, int b) {
        return a + b;
    }
}
