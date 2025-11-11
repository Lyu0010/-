package CH06.sec08.exam04;

public class CalculatorExample {
	public static void main(String[] args) {
		
		// 객체 생성
		Calculator myCalcu = new Calculator();
		
		// 정사각형의 넓이 구하기 (매개변수 1개 호출)
		double result1 = myCalcu.areaRectangle(10.0);
		
		// 직사각형의 넓이 구하기 (매개변수 2개 호출)
		double result2 = myCalcu.areaRectangle(10.0, 20.0);
		
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
	}
}