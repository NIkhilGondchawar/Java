package secondprogramInheritance;

public class Test {

	public static void main(String[] args) {
		
		C c = new C();
		B b = new B();
		b.m1();
		c.m3();
		c.m2();

		System.out.println(b.a);
		System.out.println(b.c);
		System.out.println(b.b);
	}

}
