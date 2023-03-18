package Basic;

public class Method {

	public void m1() {
		System.out.println("Non static method");
	}
    
	public static void main(String[] args) {
		Method kk= new Method();
		kk.m1();
	}
}

