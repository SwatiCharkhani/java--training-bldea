package training_codes;

class Animal extends Object{
	Animal(){
		super();
		System.out.println("inside zero parameterized constructor");
	}
	Animal(int a){
		super();
		System.out.println("inside parameterized constructor");
	}
}
class cow extends Animal{
	cow(){
		super();
	}
}

public class Code21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     cow d1=new cow();
	}

}
