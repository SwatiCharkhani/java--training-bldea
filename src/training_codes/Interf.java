package training_codes;

interface Calculator{
	void add();
	void sub();
}
abstract class calci implements Calculator{
	@Override
	public void add() {
		System.out.println("Add-1");
	}
}
class calcy1 implements Calculator{
	@Override
	public void add() {
		System.out.println("Add-2");
	}
	@Override
	public void sub() {
		System.out.println("sub-2");
	}
}
public class Interf {
public static void main(String[] args) {
	Calculator c=new Calculator() {
		@Override
		public void add() {
			
		}
		@Override
		public void sub() {
			
		}
	};
	System.out.println(c);
}
}

