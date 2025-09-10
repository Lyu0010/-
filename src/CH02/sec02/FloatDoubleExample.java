package CH02.sec02;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정밀도 확인
		float val1 = 0.1234567890123456789f;
		double val2 = 0.1234567890123456789;
		System.out.println("val1 : " + val1);
		System.out.println("val2 : " + val2);
		
		double val3 = 3e6;
		float val4 = 3e6F;
		double val5 = 2e-3;
		System.out.println("val3 : " + val3);
		System.out.println("val4 : " + val4);
		System.out.println("val5 : " + val5);
	}

}
