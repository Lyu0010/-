package CH06.sec07.exam05;

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 2. model만 받는 생성자
	Car(String model) {
		// 3. (model, color, maxSpeed) 생성자 호출
		this(model, "은색", 250); 
	}
	
	// 3. model, color를 받는 생성자
	Car(String model, String color) {
		// 4. (model, color, maxSpeed) 생성자 호출
		this(model, color, 250); 
	}
	
	// 4. model, color, maxSpeed를 모두 받는 생성자 (최종 목적지)
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}