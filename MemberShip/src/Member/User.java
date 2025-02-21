package Member;

import java.util.Scanner;

public class User {
	
	UserManager[] user = new UserManager[4];
  
	
	
	
	User() {
		
		System.out.println("회원관리 프로그램");
		while(true) {
		System.out.println("1.회원가입  2.로그인 3.회원리스트 4.회원삭제 5.회원수정 6.회원검색 7.취미등록");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num ==1) {
			membersignup();
		
		}else if(num == 2) {
			memberlogin();
			prt();
		}else if(num == 3) {
			memberlist();
		}else if(num == 4) {
			memberdelete();
		}else if(num == 5) {
			memberupdate();
		}else if(num == 6){
        membersearch();
		}else {
			hobbylist2();
		}
		
		
		
	}
		
	}
	
	public void membersignup() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 id를 입력해주세요");
		String id = sc.nextLine();
		System.out.println("회원 비밀번호를 입력해주세요");
		String pw = sc.nextLine();
		System.out.println("회원 이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("회원 나이를 입력해주세요");
		String age = sc.nextLine();
		System.out.println("회원 주소를 입력해주세요");
		String address = sc.nextLine();
		System.out.println("미성년자입니까?");
		System.out.println("1. 예  2. 아니오");
		
		int youth = sc.nextInt();
		if(youth == 1) {
			name = name + "(미성년자)";
		}else {
			System.out.println("미성년자가 아닙니다.");
		}
		
		UserManager temp = new UserManager(id,pw,name,age,address);
		
		
		for(int i = 0; i < user.length; i++) {
			
			if(user[i]==null) {
			  
				user[i] = temp;
				break;
			}
			
			
		}
		
		
		
		

		
		
		
	}
	
	
	public void prt() {
		
		System.out.println("사이트에 들어오신것을 환영합니다.");
	}


    public void memberlogin() {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("id를 입력해주세요.");
    	String id = sc.nextLine();
    	System.out.println("패스워드를 입력해주세요");
    	String pw = sc.nextLine();
    	
    	
		
	}
    
    public void memberlist() {
    	
    	for(int i =0; i < user.length; i++) {
    		
    		if(user[i] != null) {
    			System.out.println(user[i].id);
    			System.out.println(user[i].pw);
    			System.out.println(user[i].name);
    			System.out.println(user[i].age);
    			System.out.println(user[i].address);
    		}
    		System.out.println();
    	}
		
	}
	
    public void memberdelete() {
    	
    	Scanner sc2 = new Scanner(System.in);
    	System.out.println("삭제하시겠습니까?");
    	String delid = sc2.nextLine();
    	
    	for(int i = 0; i < user.length;i++) {
    		
    		if(user[i].id.equals(delid)) {
    			
    			user[i] = null;
    			
    		}
    		
    		
    	}
    	
    	
		
	}
	

    public void memberupdate() {
    	
    	Scanner sc3 = new Scanner(System.in);
    	System.out.println("수정하기");
    	System.out.println("기존 id를 입력해주세요");
    	String id3 = sc3.nextLine();
    	System.out.println("수정할 패스워드를 입력해주세요");
    	String chpw = sc3.nextLine();
    	System.out.println("수정할 이름을 입력해주세요");
    	String chname = sc3.nextLine();
    	System.out.println("수정할 나이를 입력해주세요");
    	String chage = sc3.nextLine();
    	System.out.println("수정할 주소를 입력해주세요");
    	String chaddress = sc3.nextLine();
    	
    	
    	for(int i =0; i < user.length; i++) {
    		
    		if(user[i].id.equals(id3)) {
    			
    			user[i].pw = chpw;
    			user[i].name =chname;
    			user[i].age =chage;
    			user[i].address = chaddress;
    			   			   					
    			    		           }
    		   		
    	                      	
    	           }
    	}
    
    
    
      public void membersearch() {
    	  
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("검색하기");
    	  System.out.println("검색할 id를 입력해주세요");
    	  String id2 = sc.nextLine();
    	  for(int i=0; i < user.length; i++) {
    		    if(user[i] != null)
    		 for(int j=0; j < user[i].id.length(); j++) {
    			 
    			   			    	  				  
    				 		      	
    			  
    			 
    		  }
    		  
    		  
    		  
    	  }
    	  
    	 
    	  
    	  
    	  
      }
      
      
      public void hobbylist2() {
    	  
    
    	  Scanner sc3 = new Scanner(System.in);
    	  System.out.println("취미등록");
    	  System.out.println("1. 기본정보수정  2.취미등록");
    	  int num2 = sc3.nextInt();
    	  if(num2 == 1) {
    		  
    		  memberupdate();
    		  
    	  }else  {
    		  
    		  Scanner sc4 = new Scanner(System.in);
    		  System.out.println("취미를 등록해주세요");
    		  String introll = sc4.nextLine();
    	      for(int i=0; i < user.length;i++) {
    	    	  
    	    	  if(user[i] == null)
    	    	  for(int j=0; j < user[i].hobby.length;j++) {
    	    		  
    	    		  if(user[i].hobby[j]== null) {
    	    			  
    	    		  user[i].hobby[j] = introll;
    	    		  
    	    		  }
    	    		      	    		  
    	  	          } 
    	    	  
    	      }
    	  }
      }
    	    	  
    	    	  
    	    	  
    	    	  
    	      
    	     
    		
    	     	  
    	    	  
    	  
    
    	  
    	  
      public void memo() {
    	  
    	        Scanner sc = new Scanner(System.in);
                System.out.println("1. 메모등록 2. 메모 출력");
                int num = sc.nextInt();
                if(num == 1) {
                	
                	
                	
                } else {
                	
                	
                }
                
                
                
      }
      
}
                
                			
               	  
    	  
    	  
      
 
    
    
	
    	  
    	  
    	  
    	  
    	  
    	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


