package user;

import java.util.Scanner;

public class UserManager {
	
	 User[] userList = new User[5]; // UserManager Ŭ������ �������
	
	//������ - UserManager
	UserManager(String title) {
		System.out.println(title + "ȸ���������α׷�");
		Scanner in = new Scanner(System.in);
		
		while(true) { // �ݺ��� �������� ������ while��
			
			menu();
			System.out.println("��ȣ����");
			int k = in.nextInt();
			
			if(k == 1) {
				add(); // add �޼��� call ���ڰ��� ����
			} else {
				allList(); // allList �޼��� call
			}
			
		}
		
	}
			
			private void allList() {
				System.out.println("��ü���� ���");
				for(int i =0; i < userList.length; i++) {
					if(userList[i]!=null)
					System.out.println(userList[i].id);
				}
			}
			
			
			private void add() {
				System.out.println("�߰�");
				Scanner in = new Scanner(System.in);
				System.out.println("���̵� �Է��ϼ���");
				String id = in.nextLine();
				System.out.println("�̸��� �Է��ϼ���");
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
				System.out.println("1.  �߰� 2. ��ü����");
			}
			
		
					
		
		
	}

