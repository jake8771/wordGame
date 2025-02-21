package main;

public class Main {

	public static void main(String[] args) {
		// 의존한다는 것은 객체각 필요하다
		//1.객체를 만든다. 2. 객체의 주소값을 갖는다.
		
		Useradmin useradmin = null; //객체를 알아야 한다.(의존) useradmin은 참조변수를 의미한다.
        useradmin = new Useradmin(); // 객체를 직접 생성해서 알게 됨. useradmin은 Useradmin 객체의 주소값을 가지고 있다.
        useradmin.mainStart();
	}

}
