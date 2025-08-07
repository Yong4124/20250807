package nested;

public class A {
	static B field = new B();
	static void method() {
		B v1 = new B();
	}
	static class B{}
}
