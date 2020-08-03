package loopsInJava;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int totalRow=7;
		for (int row = 1; row <=totalRow; row++) {
			for (int sp = 1; sp <=totalRow-row; sp++) {
				System.out.print(" ");
			}
			
			for (int st = 1; st <=row; st++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}




