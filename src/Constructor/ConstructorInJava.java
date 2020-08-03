package Constructor;

public class ConstructorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd2=new ConstructorDemo(10,"Ajay");
		ConstructorDemo cd3=new ConstructorDemo(10,"abc");
		cd2.printValues();
		
		newclass nc=new newclass();

	}

}

class ConstructorDemo{
	
	   int a1;
	   String name1;
	   {
		   System.out.println("this is instance block");
	   }
	   static {
		   System.out.println("this is static block");
	   }
	   
	   ConstructorDemo(int a, String name){
		   a1=a;
		   name1=name;
		   System.out.println("this is constructor");
		   
	   }
	   
	   void printValues() {
		   System.out.println("a1="+a1+" "+"name1="+name1);
	   }
	   
	
}



class newclass{
	
	newclass(){
		
	}
	
}