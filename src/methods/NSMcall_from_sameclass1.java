package methods;

public class NSMcall_from_sameclass1 {

	public static void main(String[] args) {
	System.out.println("main method is started");
	NSMcall_from_sameclass1 s =new NSMcall_from_sameclass1 ();
	s.m1();
	s.m2();
	System.out.println("main method ends");

	}
public static void m1() {
	System.out.println("Hello");
	System.out.println("hi");
	
}
public static void m2() {
System.out.println("Bye");
System.out.println("Seeyou");
}
}
