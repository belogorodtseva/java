import java.util.Scanner;

public class InteractRunner {
	
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			calculator calc = new calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				System.out.println("What o you want to do 1 - add/ 2 - minus/ 3 - multiply/ 4 - devide : ");
				String keys = reader.next();
				if ( Integer.valueOf(keys) == 1 )
					calc.add(Integer.valueOf(first), Integer.valueOf(second));
				if ( Integer.valueOf(keys) == 2 )
					calc.minus(Integer.valueOf(first), Integer.valueOf(second));
				if ( Integer.valueOf(keys) == 3 )
					calc.multiply(Integer.valueOf(first), Integer.valueOf(second));
				else
					calc.devide(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result :" + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit yes/no ");
				exit = reader.next();				
			}
		} 
		finally {
			reader.close();
		}		
	}	
}