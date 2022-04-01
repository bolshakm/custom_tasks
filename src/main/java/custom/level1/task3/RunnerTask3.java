package custom.level1.task3;

public class RunnerTask3 {
	//todo. Add implementation for method defineStringType if string length less then 5 characters(char) method should return "small",
	// if string length more then 5 char but less then 10 char "medium", if string length more then 10 char "big".
	// Define size for a, b, c, d vars and print result to console ex:"test is a small string!"
	// ** Implement method compareStrings method should get two strings in parameters and print result of comparing
	// ex: "String test less then string test2"

	//todo. Додати реалізацію для метода defineStringType метод повинен повертатти String в якому буде записано розмір стрінги.
	// Якщо розмір стрінги менше 5 символів метод повинен повертнути "small", якщо від 5 до 10 символів то "medium", а якщо більше 10 символів то "big".
	// Визнач розміри для змінних a, b, c, d, та виведи результат в консль у вигляді:"lol is a small string!"
	// ** Створи нивий метод compareStrings, метод повинен отримувати 2 стрінги в якості аргументів методу і надрукувати результат порівняння
	// наприклад: "String test less then string test2"
	public static void main(String[] args) {
		String a = "testing";
		String b = "hard test1";
		String c = "lol";
		String d = "fuck)";
		RunnerTask3.defineStringType(a);
		RunnerTask3.defineStringType(b);
		RunnerTask3.defineStringType(c);
		RunnerTask3.defineStringType(d);
		System.out.println();

		System.out.println(a + " is the " +  "string!");
		System.out.println();
		System.out.println();
		System.out.println();

		compare("Toha","Antoha");






	}

	private static String defineStringType(String string){
		System.out.println("Длина строки "+string +": " + string.length());
		if(string.length()<5){
			System.out.println("small");
		}else if (string.length()>=5 & string.length()<=10) {
			System.out.println("medium");
		}else if(string.length()>10){
			System.out.println("big");
			};
		return string;

	}
	static void compare(String s,String s2){
		if(s.compareTo(s2)>0){
			System.out.println("s<s2");
		}else System.out.println("s>s2");
	}
}

