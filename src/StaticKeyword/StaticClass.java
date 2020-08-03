package StaticKeyword;

public class StaticClass {
	
	int a=30;

	public static void main(String[] args) {
		
		
		//this.a=30;
		// TODO Auto-generated method stub
		OuterClass.innerClass.printMsg();
		OuterClass.innerClass in=new OuterClass.innerClass();
		in.printMsg2();

	}
	void m2() {
		this.a=30;
		
	}

}
class OuterClass{
	static class innerClass{

		static void printMsg() {
			System.out.println("this is inner class method");
		}
		 void printMsg2() {
			System.out.println("this is inner class method 2");
		}
		
	}

}
