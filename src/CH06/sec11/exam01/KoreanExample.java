package CH06.sec11.exam01;

public class KoreanExample {
	public static void main(String[] args) {
		
		// 객체 생성 시 주민번호와 이름을 필수값으로 전달
		Korean k1 = new Korean("123456-1234567", "김자바");
		
		// 필드 값 읽기
		System.out.println("k1.nation: " + k1.nation);
		System.out.println("k1.ssn: " + k1.ssn);
		System.out.println("k1.name: " + k1.name);
		
		// final 필드는 값을 변경할 수 없음 (컴파일 에러 발생)
		// k1.nation = "USA";
		// k1.ssn = "123-12-1234";
		
		// 일반 필드는 값 변경 가능
		k1.name = "감자바";
		System.out.println("k1.name: " + k1.name);
	}
}