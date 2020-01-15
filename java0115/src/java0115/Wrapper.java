package java0115;

import java.math.BigDecimal;

public class Wrapper {

	public static void main(String[] args) {
		//기본형 정수 데이터를 참조형 Integer로 생성
		Integer i = new Integer(100);
		i = 300; //Auto Boxing(기본형 데이터를 참조형으로 자동 변환해주는 문법)
		
		//기본형을 참조형으로 표현할 수 있기 때문에 Object 클래스의 변수에는 모든 데이터를 대입가능
		Object obj = 300;
		//obj 는 Integer를 저장하기는 했지만 변수의 자료형이 Object라서
		//Object 것만 사용이 가능합니다.
		//원래 자료형에 있던 intValue()를 사용 못함
		//원래 자료형에 있던 것들을 사용할려면 강제로 원래 자료형으로 변환시켜야 합니다.
		System.out.println(((Integer)obj).intValue());
		
		//실수 연산에 문제점 발생
		double d1 = 1.60000000000000000000000000000;
		double d2 = 0.10000000000000000000000000000;
		System.out.println(d1 + d2);
		
		//실수 연산 문제 해결하기
		BigDecimal b1 = new BigDecimal("1.60000000000000000000000000000");
		BigDecimal b2 = new BigDecimal("0.10000000000000000000000000000");
		System.out.println(b1.add(b2));
		//프로그래밍 언어와 데이터베이스를 연동하는 경우
		//대부분의 경우 데이터베이스가 더 정밀한 숫자를 저장하는 경우가 많습니다.
		//데이터베이스에 실수를 저장했을 때는 float 이나 double로 받는 것 보다는 BigDecimal
		//같은 클래스를 이용해서 저장하고 연산한 후 결과를 float 이나 double로 표현하는 것이 좋습니다.
		
		//운영체제 버전과 자바 버전을 확인
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("java.version"));

	}
}








