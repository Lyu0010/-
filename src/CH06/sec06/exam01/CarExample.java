package CH06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		//Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start); // 이미지에 '시동여부'가 없지만, start 필드에 맞춰 수정
		System.out.println("현재속도: " + myCar.speed); // 이미지에 '현재속도'가 없지만, speed 필드에 맞춰 수정
	}
}