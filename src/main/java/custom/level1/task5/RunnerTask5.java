package custom.level1.task5;

public class RunnerTask5 {
	//todo. Using "for" loop print each word from string in new line
	// Method wordCount(String string) return word count in string ex: "Custom text" return 2;
	// Method getWord(int wordNumber, String string) return word by number. Pay attention,word numbers start from 0
	// ex: getWord(0, "Custom text") -> Custom, getWord(1, "Custom text") -> text
	// *** Create method printInNewLine(int count, String string).
	// Using "for" loop print each word from string in new line the specified number of times.
	// ex:printInNewLine(3, "Strongest of avengers") ->
	// Strongest
	// Strongest
	// Strongest
	// of
	// of
	// of
	// avengers
	// avengers
	// avengers

	public static void main(String[] args) {

	}

	private static void printInNewLine(String string){

	}

	private static int wordsCount(String string){
		String[] strings = string.split(" ");
		return strings.length;
	}

	private static String getWord(int index, String string){
		String[] strings = string.split(" ");
		return strings[index];
	}


}
