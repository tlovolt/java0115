package java0115;

import java.io.IOException;

public class ProcessExecute {

	public static void main(String[] args) {
		//Runtime 클래스의 인스턴스 2개 생성
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		
		//해시코드 출력
		//해시코드가 동일하게 출력
		//Runtime은 인스턴스를 1개만 만들 수 있는 클래스
		//생성하는 메소드를 여러 번 호출해도 하나만 가지고 작업 - Singleton 패턴
		System.out.println("r1:" + System.identityHashCode(r1));
		System.out.println("r1:" + System.identityHashCode(r2));
		
		//메모장 실행
		try {
			r1.exec("notepad.exe "
					+ "C:\\Users\\admin\\Desktop\\401호공유폴더\\java\\javaapplication\\0114.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
}










