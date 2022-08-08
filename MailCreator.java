import java.util.Scanner;

public class MailCreator {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		String name, surname;
		
		System.out.println("Enter the name:");
		name = key.nextLine();
		System.out.println("Enter the surname");
		surname = key.nextLine();
		
		int n = name.length(),a=0;
		int s = surname.length(),b=0;
		
		while (a<=n) {
			
			b=0;
			
			while (b<=s) {
				
				String email = name.substring(0,a)+surname.substring(0,b);
				
				if (email.length()>5) {
					System.out.println("Possible email address: " +email+"@tedu.edu.tr");	
				}
				
				b++;
			}
			a++;
		}
			
		
	}

}
