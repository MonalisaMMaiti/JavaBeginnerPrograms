import java.util.Scanner;
public class SwitchCondition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a command : ");
		String text = input.nextLine();
		 
		switch(text)
		{
		case "Start" : System.out.println("Machine started.");
		break;
		case "Pause" : System.out.println("Machine Resume.");
		break;
		case "End" : System.out.println("Machine Stopped.");
		break;
		default : System.out.println("Command not recognized.");
		}
	}

}
