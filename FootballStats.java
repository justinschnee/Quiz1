import java.util.Scanner; // imports Scanner method

public class FootballStats {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner object created

		double Tds;
		double Yards;
		double Ints;
		double Completions;
		double PassAtt;
		double A;
		double B;
		double C;
		double D;
		double PassRat; // define variables as doubles
		
		System.out.println("QB Passer Rating Calculator. Enter the QB's stats to determine their QB rating."); 

		System.out.println("How many touchdown passes has the QB thrown? "); 
		// asks users for number of touchdown passes
		Tds = input.nextDouble(); // user input set to variable

		System.out.println("How many total passing yards has the QB achieved? ");
		// asks users for number of total passing yards
		Yards = input.nextDouble();
		
		System.out.println("How many interceptions has the QB thrown? ");
		// asks users for number of interceptions.
		Ints = input.nextDouble();

		System.out.println("How many completions has the QB made? ");
		// asks users for number of completions.
		Completions = input.nextDouble();

		System.out.println("How many passes has the QB attempted? ");
		// asks users for number of passes attmepted.
		PassAtt = input.nextDouble();

		A = (((Completions / PassAtt) - 0.3) * 5);
		B = (((Yards / PassAtt) - 3) * 0.25);
		C = ((Tds / PassAtt) * 20);
		D = (2.375 - ((Ints / PassAtt) * 25));

		if (A < 0) {
			A = 0;
		} else if (A > 2.375) {
			A = 2.375;
		}
		if (B < 0) {
			B = 0;
		} else if (B > 2.375) {
			B = 2.375;
		}
		if (C < 0) {
			C = 0;
		} else if (C > 2.375) {
			C = 2.375;
		}
		if (D < 0) {
			D = 0;
		} else if (D > 2.375) {
			D = 2.375;
		} 

		PassRat = (A + B + C + D) * 100 / 6;

		System.out.printf("The Quarterbacks rating is %3.1f ", + PassRat);																	
		

	}
}
