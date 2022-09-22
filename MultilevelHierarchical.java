//multilevel inheritanace and hierarchical inheritac
class A{
	void funA(){
		System.out.println("This is a class A");
	}
}
class B extends A {
	void funB(){
		System.out.println("This is a class B");
		
	}
}
class c extends B {
	void funC(){
		System.out.println("This is a class C");
	}
}
public class Demo {
	public static void main(String args[]){
		C obj = new C();
		obj.funA();
		obj.funB();
		Obj.funC();
	}
}




