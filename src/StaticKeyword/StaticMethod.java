package StaticKeyword;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod.m();
		StaticMethod sm=new StaticMethod();
		sm.m2();
		demoStatic1 dm1=new demoStatic1();
		dm1.m4();
		demoStatic1.m3();

	}
	
	static void m() {
		System.out.println("This is static method m");
	}
	
	void m2() {
		System.out.println("this is inatance method m2");
	}

}


class demoStatic1{
	static void m3() {
		System.out.println("This is static method m3");
	}
	
	void m4() {
		System.out.println("this is inatance method m4");
	}
}



