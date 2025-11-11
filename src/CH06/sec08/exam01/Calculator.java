package CH06.sec08.exam01;

public class Calculator {
	
	//리턴값이 없는 powerOn() 메소드 선언
	void powerOn() {
		System.out.println("전원을 웁니다.");
	}
	
	//리턴값이 없는 powerOff() 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 두 정수를 전달받고,
	// 호출한 곳으로 결과(int)를 리턴하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result; // 리턴값 지정
	}
	
	// 두 정수를 전달받고,
	// 호출한 곳으로 결과(double)를 리턴하는 메소드 선언
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
}