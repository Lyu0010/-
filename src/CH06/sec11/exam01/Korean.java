package CH06.sec11.exam01;

public class Korean {
	
	// 인스턴스 final 필드 선언 및 초기값 할당
	final String nation = "대한민국";
	final String ssn;
	
	// 인스턴스 필드 선언
	String name;
	
	// 생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn; // final 필드는 생성자에서 단 한번 초기화 가능
		this.name = name;
	}
}