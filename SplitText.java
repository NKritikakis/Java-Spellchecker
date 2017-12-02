import java.util.Scanner;
public class SplitText {
	Scanner input = new Scanner (System.in);
	String text = input.next();
	String inputText[] = text.split(" ");
	public String[] getTextArray() {
		return inputText;
	}
}


