package StaticKeyword;

public class StaticBlock {
	
	int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("this is main method");
		//StaticBlock sb=new StaticBlock();
		//System.out.println("end of main");
		
		//demoStaticBlock sb=new demoStaticBlock();
		//demoStaticBlock sb1=new demoStaticBlock();
		//demoStaticBlock.m();
		
		//System.out.println("a="+demoStaticBlock.a);
		
		demoStaticBlock sb=new demoStaticBlock();
		demoStaticBlock sb1=new demoStaticBlock();
		demoStaticBlock sb2=new demoStaticBlock();

	}

}


class demoStaticBlock{
	static int a;
	int b;
	{
		a=10;
		
		System.out.println("Instance block of demoStaticBlock ");
	}
	
	static {
		//demoStaticBlock sb=new demoStaticBlock();
		//sb.b=20;
		System.out.println("this is static block of demoStaticBlock");
	}
	
	static void m() {
		
	}
	
}
