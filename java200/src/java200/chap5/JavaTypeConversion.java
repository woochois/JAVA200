package java200.chap5;

// 타입 변환의 필요성
public class JavaTypeConversion {
	public static void main(String[] args) {
		String slat = "37.52127220511242    ";

		// String slat = "hello";
		// 공백 제거 후 double로 타입 변환 - Double Wrapper(랩퍼) 클래스를 이용하여 타입 변환한다.
		double latitude = Double.parseDouble(slat.trim()); // trim()은 양쪽 공백을 제거한다.
		System.out.println(latitude);
	}
}
