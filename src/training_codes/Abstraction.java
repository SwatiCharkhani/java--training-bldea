package training_codes;


abstract class calcy{
	abstract void add();
	abstract void sub();
	void div(){
		System.out.println("Division");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calcy c= new calcy() {
	@Override
	void add() {
		System.out.println("Addition");
	}
	@Override
	void sub() {
		System.out.println("Subtraction");
	}
};
System.out.println(c);
	}

}
