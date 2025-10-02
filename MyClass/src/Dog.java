
public class Dog extends Animals implements MyInterface {

	String breeds;

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String breeds) {
		super(name, age);
	}

//	추상클래스 메소드 sound구현
	@Override
	public void sound() {
		System.out.println("멍멍멍~~~");
	}

//	인터페이스 메소드 jumpable구현
	@Override
	public void jumpable() {
		System.out.println("점~~~프");
	}

//	인터페이스 메소드 waitable구현
	@Override
	public void waitable() {
		System.out.println("기다려~~~....... 먹어!");
	}
}
