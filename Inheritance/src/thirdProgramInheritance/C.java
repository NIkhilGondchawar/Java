package thirdProgramInheritance;

public class C extends B {
	
	int x = 40;
	public void m2() {
		System.out.println("m2 method of C class");
		int x = 50;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		super.m1();
		A a = new A();
		System.out.println("\n"+a.x);
	}
public static void main(String[] args) {
		
		C c = new C();
		c.m1();
		c.m2();
	}

}
