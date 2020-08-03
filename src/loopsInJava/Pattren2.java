package loopsInJava;

public class Pattren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int toatlRow=5;
		
		
		Object []obh;
		
		for (int Row = 1; Row <=toatlRow; Row++) {
			
			for (int st = 1; st <=toatlRow-Row+1; st++) {
				
				System.out.print("*");
				
			}
			System.out.println();
			
		}

	}

}
