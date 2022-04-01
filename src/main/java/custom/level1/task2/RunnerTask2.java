package custom.level1.task2;

public class RunnerTask2 {
    //todo. Add implementation for method isEvenNumber. Method should return true if number is even and false if isn't.
    // * Implement method isOddNumber. Method should return true if number is odd and false if isn't.
    // Test it like it was tested in isEvenNumber case.
    // ** Define is number odd using method isEvenNumber.

    //todo Додати реалізацію для методу isEvenNumber. Метод повинен повертати true якщо число є парне та false, якщо ні.
    // * Написати новий метод, який матеме назву isOddNumber. Метод повинен повертати true, якщо число є непарне та false, якщо парне.
    // Додати перевірку нового метода(isOddNumber) аналогічну перевірці методу isEvenNumber.
    // ** Використай метод isEvenNumber в методі isOddNumber для визначення парності числа.

    public static void main(String[] args) {
        System.out.println("One is even and it is a " + isEvenNumber(1));
        System.out.println("Two is even and it is a " + isEvenNumber(2));
        System.out.println("Three is even and it is a " + isEvenNumber(3));
        System.out.println("Four is even and it is a " + isEvenNumber(4));

        System.out.println();

        System.out.println("One is odd and it is a " + isOddNumber(1));
        System.out.println("Two is odd and it is a " + isOddNumber(2));
        System.out.println("Three is odd and it is a " + isOddNumber(3));
        System.out.println("Four is odd and it is a " + isOddNumber(4));

    }

    private static boolean isEvenNumber(int number) {
		return number % 2 == 0;

    }


    private static boolean isOddNumber(int number) {
		return !isEvenNumber(number);

    }
}