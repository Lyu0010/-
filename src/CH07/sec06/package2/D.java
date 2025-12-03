package CH07.sec06.package2;

import CH07.sec06.package1.A;

public class D extends A {
	//생성자 선언
	public D() {
		// A() 생성자 호출
		super(); // o
	}
	
	//메소드 선언
	public void method() {
		// A 필드값 변경
		this.field = "value"; // o
		// A 메소드 호출
		this.method(); // o
		
		// 아래 코드는 객체를 직접 생성하여 사용하는 것이므로 불가
		A a = new A(); // x
		a.field = "value"; // x
		a.method(); // x
	}
	
	//메소드 선언
	public void method2() {
		A a = new A(); // x (protected는 직접 객체 생성해서 사용하는 것은 안됨)
		a.field = "value"; // x (protected는 직접 객체 생성해서 사용하는 것은 안됨)
		a.method(); // x (protected는 직접 객체 생성해서 사용하는 것은 안됨)
	}
}