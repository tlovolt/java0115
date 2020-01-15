package java0115;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysTest {

	public static void main(String[] args) {
		//int -> Integer 와 String 은 크기 비교가 가능해서 바로 정렬 가능
		//Comparable 인터페이스가 구현되어 있는지 확인
		
		//정수 배열 생성
		int [] ar = {30, 40, 20, 50, 10};
		
		//문자열 배열 생성
		String [] br = {"해글러","듀란", "헌즈", "레너드", "박종팔"}; 
		
		//ar 배열을 정렬
		Arrays.sort(ar);
		for(int temp : ar) {
			System.out.print(temp + "\t");
		}
		System.out.print("\n");
		
		//br 배열을 정렬
		Arrays.sort(br);
		for(String temp : br) {
			System.out.print(temp + "\t");
		}
		System.out.print("\n");
		
		
		//User 클래스의 배열 생성
		User user1 = new User();
		user1.setNum(1);
		user1.setName("조 몬타나");
		user1.setScore(88);
		
		User user2 = new User();
		user2.setNum(2);
		user2.setName("마르티나 나브라틸로바");
		user2.setScore(97);
		
		User user3 = new User();
		user3.setNum(3);
		user3.setName("웨인 그레츠키");
		user3.setScore(87);
		
		User [] users = {user1, user2, user3};
		
		/*
		//배열을 만들고 인스턴스를 대입
		User [] users = new Users[3];
		users[0] = new User();
		users[0].setNum(1);
		 */
		
		//데이터 정렬
		/*
		Arrays.sort(users);
		*/
		
		//한 줄의 문자열을 입력받기 위한 구문
		Scanner sc = new Scanner(System.in);
		System.out.print("정렬 조건 선택(1.번호 2.이름 3.점수):");
		String menu = sc.nextLine();
		
		//자바는 지역변수를 만들면 자동 초기화를 하지 않습니다.
		//만들기만 하고 값을 대입해두지 않으면 없는 것으로 간주합니다.
		Comparator <User> comp = null;
		switch(menu) {
		case "1":
			comp = new Comparator<User>() {
				@Override
				public int compare(User o1, User o2) {
					if(o1.getNum() > o2.getNum()) {
						return 1;
					}else if(o1.getNum() == o2.getNum()) {
						return 0;
					}else {
						return -1;
					}
				}
				
			};
			break;
		case "2":
			comp = new Comparator<User>() {
				@Override
				public int compare(User o1, User o2) {
					return o1.getName().compareTo(o2.getName());
				}
			};
			break;
		case "3":
			comp = new Comparator<User>() {
				@Override
				public int compare(User o1, User o2) {
					return o1.getScore() - o2.getScore();
				}
			};
			break;
		default:
			System.out.println("잘못된 메뉴를 선택하셨습니다.");
			//프로그램 종료
			System.exit(0);
		}
		
		Arrays.sort(users, comp);
		
		
		//데이터 출력
		for(User user : users) {
			System.out.println(user);
		}
	}

}


















