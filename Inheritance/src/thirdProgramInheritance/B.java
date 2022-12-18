package thirdProgramInheritance;

public class B extends A{
	int x = 20;
	public void m1() {
		System.out.println("m1 method of B class");
		int x = 30;
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(this.x);
	}

}
