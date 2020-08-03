package StaticKeyword;

public class StaticVariable {
	
	int a=10;
	static int b=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sv=new StaticVariable();

	}
	
	void m3() {
		System.out.println(this.a);
	}
	
}

class demoStaticVariable{
	
	static void m() {
		StaticVariable sv=new StaticVariable();
		System.out.println("a="+sv.a+"b="+StaticVariable.b);
	}
	
	 void m1() {
		StaticVariable sv=new StaticVariable();
		System.out.println("a="+sv.a+"b="+StaticVariable.b);
	}
	
	
}
