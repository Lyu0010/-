package CH07.sec06.package2;

import CH07.sec06.package1.A;

public class C {
	//메소드 선언
	public void method() {
		A a = new A(); // x 
		a.field = "value"; // x
		a.method(); // x
	}
}