package CH06.sec11.exam02;

public class Earth {
	
	// 상수 선언 및 초기값 할당
	static final double EARTH_RADIUS = 6400; // 지구 반지름 (km)
	
	// 상수 선언
	static final double EARTH_SURFACE_AREA; // 지구 표면적 (km²)
	
	// 정적 블록에서 상수 초기화 (복잡한 계산이 필요할 때 사용)
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}