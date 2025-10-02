
// 하나이상의 추상메소드를 가지면, 추상클래스 된다.
public abstract class Animals {

	String name;
	int age;

	public Animals(String name, int age) {

	}

//	구현되지 않은 추상메소드
	public abstract void sound();
}
