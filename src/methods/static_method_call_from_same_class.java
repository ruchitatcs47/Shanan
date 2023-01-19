package methods;

public class static_method_call_from_same_class {
public static void main (String[]args) {
	electricity();
	moneyTransfer ();
	recharge();
}
public static void moneyTransfer() {
System.out.println("Hi");
System.out.println("Hey");
System.out.println("hello");
}
public static void electricity() {
System.out.println("good morning");
System.out.println("Good evening");
	
}
public static void recharge() {
	System.out.println("phone bill");
	System.out.println("cooler bill");
	
}
}