package loopsInJava;

public class ArrayPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int emp[]=new int[15];

		emp[0]=20;
		emp[1]=30;
		emp[2]=10;
		emp[3]=4;
		emp[4]=5;


		int bigNumberInArray=0;
		for(int i=0;i<emp.length;i++) {
			//System.out.println(emp[i]);
			if(emp[i]>bigNumberInArray) {
				bigNumberInArray=emp[i];
			}


		}
         System.out.println("bigNumberInarray="+bigNumberInArray);

	}

}
