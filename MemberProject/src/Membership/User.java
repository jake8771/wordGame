package Membership;
import java.util.*;

public class User {
	
     UserInfo[] user = new UserInfo[4];
	
	
	User(String title){
		
		Scanner sc = new Scanner(System.in);
		System.out.println(title +"���α׷�");
		while(true) {
		System.out.println("1. ���  2. ����  3. ����  4. �˻�  5.��ü����");
	    int num = sc.nextInt();
	    sc.nextLine();
	    if (num == 1) {
			add();
			
		} else if (num == 2) {
			delete();
		} else if (num == 3) {
			update();
		} else if (num == 4)  {
			search();
		}else {
			prt();
		}
	
		}
		
	}		
		

		
	    
	    public void add() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("���̵� �Է����ּ���.");
			String id = sc.nextLine();
			System.out.println("��й�ȣ�� �Է����ּ���.");
			String pw = sc.nextLine();
			System.out.println("�̸��� �Է����ּ���");
			String name = sc.nextLine();
			System.out.println("�ּҸ� �Է����ּ���");
			String address = sc.nextLine();
			System.out.println("���̸� �Է����ּ���");
			int age = sc.nextInt();
			UserInfo temp = new UserInfo(id,pw,name,address,age);
			for(int i = 0; i < user.length; i++) {
				if(user[i] == null) {
					user[i] = temp;
					break;
				}
			}
		    
			
			
			
		}
	    
		
		public  void delete() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("������ �̸��� �˷��ּ���");
			String del = sc.nextLine();
			for(int i=0; i < 4; i++) {
				if(user[i]!=null) {
					if(user[i].name.equals(del)) {
						
						user[i] = null;
					}
					
				}
			}
							
		}
		
		public void update() {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("�̸��� �Է����ּ���");
	    String name = sc.nextLine();
	    System.out.println("�ٲ� ��й�ȣ�� �Է����ּ���.");
	    String changepw = sc.nextLine();
	    System.out.println("�ٲ� ���̵� �Է����ּ���.");
	    String changeid = sc.nextLine();
	    System.out.println("�ٲ� �ּҸ� �Է����ּ���.");
	    String changeaddress = sc.nextLine();
	    System.out.println("�ٲ� ���̸� �Է����ּ���.");
	    int changeage = sc.nextInt();
	    
	    
	    for(int i =0; i < user.length; i++) {
	    	
	    	if(user[i] != null && user[i].name.equals(name)) {
	    		
	    			user[i].pw = changepw;
	    			user[i].id = changeid;
	    			user[i].address = changeaddress;
	    			user[i].age = changeage;
	    			
	    		    			    			    		
	    		
	    	}
	    	
	    }
	    	
	    
	
			
			
		}
		
		
		public void search() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("ȸ���� �˻����ּ���.");
			String name3 = sc.nextLine();
			for(int i=0; i < user.length; i++) {
				
				
					
				}
				
			}
			
			
			
						
		
	
		
			
		
		public void prt() {
			
			for(int i = 0; i < user.length; i++) {
				
				if(user[i] != null) {
					System.out.println(user[i].id);
					System.out.println(user[i].name);
					System.out.println(user[i].address);
					
					
				}
				
			
			}
			
			
		
		
}
		
	
	
	

}
