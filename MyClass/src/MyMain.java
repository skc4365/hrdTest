
public class MyMain {

	public static void main(String[] args) {

//		1. Dog 클래스 생성.
//		Dog dog;

//		2. 생성자
//		Dog dog1 = new Dog("뭉뭉이", 2);
//		Dog dog2 = new Dog("뭉치", 1, "레브라도리트리버");

//		3. 강아지 3마리 분양
//		Dog dog1 = new Dog("뭉뭉이", 2);
//		Dog dog2 = new Dog("뭉치", 1, "레브라도리트리버");
//		Dog dog3 = new Dog("삐삐", 1, "치와와");

//		4. Dog클래스와 Animal클래스의 상속관계
		Dog dog1 = new Dog("뭉뭉이", 2);
		
//		5.super클래스를 추상클래스로 변경
//		super클래스 Animals에 구현되지 않은 메소드를 갖는것.
		
//		6. jumpable과 waitabler 기능정의 인터페이스
		dog1.jumpable();
		dog1.waitable();

	}

}
