package java200.chap14;

// 연산 %, *, /
public class BioCalendar {
	public static final int PHYSICAL = 23; // 상수(개발자 정의), 상수값은 변경 불가

	public static void main(String[] args) {
		int index = PHYSICAL; // 상수값을 변수에 대입
		int days = 1200;
		double vals = (days % index) * 2 * Math.PI / index;
		System.out.println(Math.toDegrees(vals) + "도");
	}
}
