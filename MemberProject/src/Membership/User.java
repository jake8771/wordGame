package Membership;
import java.util.*;

public class User {
	
     UserInfo[] user = new UserInfo[4];
	
	
	User(String title){
		
		Scanner sc = new Scanner(System.in);
		System.out.println(title +"프로그램");
		while(true) {
		System.out.println("1. 등록  2. 삭제  3. 수정  4. 검색  5.전체보기");
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
			System.out.println("아이디를 입력해주세요.");
			String id = sc.nextLine();
			System.out.println("비밀번호를 입력해주세요.");
			String pw = sc.nextLine();
			System.out.println("이름을 입력해주세요");
			String name = sc.nextLine();
			System.out.println("주소를 입력해주세요");
			String address = sc.nextLine();
			System.out.println("나이를 입력해주세요");
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
			System.out.println("삭제할 이름을 알려주세요");
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
	    System.out.println("이름을 입력해주세요");
	    String name = sc.nextLine();
	    System.out.println("바꿀 비밀번호를 입력해주세요.");
	    String changepw = sc.nextLine();
	    System.out.println("바꿀 아이디를 입력해주세요.");
	    String changeid = sc.nextLine();
	    System.out.println("바꿀 주소를 입력해주세요.");
	    String changeaddress = sc.nextLine();
	    System.out.println("바꿀 나이를 입력해주세요.");
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
			System.out.println("회원을 검색해주세요.");
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
