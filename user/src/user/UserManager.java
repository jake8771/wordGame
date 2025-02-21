package user;

import java.util.Scanner;

public class UserManager {
	
	 User[] userList = new User[5]; // UserManager 클래스의 멤버변수
	
	//생성자 - UserManager
	UserManager(String title) {
		System.out.println(title + "회원관리프로그램");
		Scanner in = new Scanner(System.in);
		
		while(true) { // 반복을 무한으로 돌리는 while문
			
			menu();
			System.out.println("번호선택");
			int k = in.nextInt();
			
			if(k == 1) {
				add(); // add 메서드 call 인자값이 없음
			} else {
				allList(); // allList 메서드 call
			}
			
		}
		
	}
			
			private void allList() {
				System.out.println("전체보기 기능");
				for(int i =0; i < userList.length; i++) {
					if(userList[i]!=null)
					System.out.println(userList[i].id);
				}
			}
			
			
			private void add() {
				System.out.println("추가");
				Scanner in = new Scanner(System.in);
				System.out.println("아이디를 입력하세요");
				String id = in.nextLine();
				System.out.println("이름을 입력하세요");
				String name = in.nextLine();
				User tempUser = new User(id,name);
				for(int i=0; i < userList.length; i++) {
					if(userList[i] == null) {
						userList[i] = tempUser;
						break;
					}
				}
			}
			
			
			public void menu() {
				System.out.println("1.  추가 2. 전체보기");
			}
			
		
					
		
		
	}

