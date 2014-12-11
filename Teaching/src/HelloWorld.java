import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello, World");
		String butts = "butts go here. Boobs go here as well";
		System.out.println(butts);
		int bootays = 4;
		System.out.println("Number of bootays: " + bootays + " bootays");
		bootays = bootays + 3;
		System.out.println("Number of bootays: " + bootays + " bootays");
		
		// prints out bootays 
		while(bootays > 0){
			System.out.println("Bootays left: " + bootays);
			bootays--;
		}
		while(bootays < 10){
			System.out.println("Bootays left: " + bootays);
			bootays++;
		}
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a number: ");
		String hiney="";
		try {
			hiney = input.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hiney: " + hiney);
		int hiney2 = Integer.parseInt(hiney);

		System.out.println("Github Test");
		System.out.println("IntelliJ Test");
		System.out.println("IntelliJ Test 2");
		System.out.println("Pull Test");
		System.out.println("Pull Test confirmed");
		System.out.println("Cody sucks balls");
		System.out.println("Showing Morgan the goods");
		System.out.println("Morgan edited this");
		System.out.println("Morgan github");
		
	}

	
}
