package custom.level1.task4;

public class RunnerTask4 {

	//todo. Add implementation for method print. Method should print to console string value the specified number of times.
	// Use while loop
	// ex: print(3,"custom text") ->
	// custom text
	// custom text
	// custom text
	// ** extract boolean condition from loop to separate method (the name of new method should be shouldPrint)

	//todo. Додати реалізацію для методу print. Метод повинен виводити на консоль значення стрінги яку передають в якості аргументів(string)
	// таку кількість раз яка зазначена в аргументі count. Викорстай цикл while.
	// приклад: print(3,"custom text") ->
	// custom text
	// custom text
	// custom text
	// ** винеси логіку визначення(умову з циклу while) чи повинен друкуватись метод в окремий метод (новий метод повинен мати назву shouldPrint)
	public static void main(String[] args) {
		print(10,"Anton");




	}

	private static void print(int count, String string){
		System.out.print(count + " ");
		System.out.println(string);
		int x=0;
		while(x<count){
		System.out.println(string);
		x++;}

		}




	}

