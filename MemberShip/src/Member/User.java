package Member;

import java.util.Scanner;

public class User {
	
	UserManager[] user = new UserManager[4];
  
	
	
	
	User() {
		
		System.out.println("ȸ������ ���α׷�");
		while(true) {
		System.out.println("1.ȸ������  2.�α��� 3.ȸ������Ʈ 4.ȸ������ 5.ȸ������ 6.ȸ���˻� 7.��̵��");
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
		System.out.println("ȸ�� id�� �Է����ּ���");
		String id = sc.nextLine();
		System.out.println("ȸ�� ��й�ȣ�� �Է����ּ���");
		String pw = sc.nextLine();
		System.out.println("ȸ�� �̸��� �Է����ּ���");
		String name = sc.nextLine();
		System.out.println("ȸ�� ���̸� �Է����ּ���");
		String age = sc.nextLine();
		System.out.println("ȸ�� �ּҸ� �Է����ּ���");
		String address = sc.nextLine();
		System.out.println("�̼������Դϱ�?");
		System.out.println("1. ��  2. �ƴϿ�");
		
		int youth = sc.nextInt();
		if(youth == 1) {
			name = name + "(�̼�����)";
		}else {
			System.out.println("�̼����ڰ� �ƴմϴ�.");
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
		
		System.out.println("����Ʈ�� �����Ű��� ȯ���մϴ�.");
	}


    public void memberlogin() {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("id�� �Է����ּ���.");
    	String id = sc.nextLine();
    	System.out.println("�н����带 �Է����ּ���");
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
    	System.out.println("�����Ͻðڽ��ϱ�?");
    	String delid = sc2.nextLine();
    	
    	for(int i = 0; i < user.length;i++) {
    		
    		if(user[i].id.equals(delid)) {
    			
    			user[i] = null;
    			
    		}
    		
    		
    	}
    	
    	
		
	}
	

    public void memberupdate() {
    	
    	Scanner sc3 = new Scanner(System.in);
    	System.out.println("�����ϱ�");
    	System.out.println("���� id�� �Է����ּ���");
    	String id3 = sc3.nextLine();
    	System.out.println("������ �н����带 �Է����ּ���");
    	String chpw = sc3.nextLine();
    	System.out.println("������ �̸��� �Է����ּ���");
    	String chname = sc3.nextLine();
    	System.out.println("������ ���̸� �Է����ּ���");
    	String chage = sc3.nextLine();
    	System.out.println("������ �ּҸ� �Է����ּ���");
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
    	  System.out.println("�˻��ϱ�");
    	  System.out.println("�˻��� id�� �Է����ּ���");
    	  String id2 = sc.nextLine();
    	  for(int i=0; i < user.length; i++) {
    		    if(user[i] != null)
    		 for(int j=0; j < user[i].id.length(); j++) {
    			 
    			   			    	  				  
    				 		      	
    			  
    			 
    		  }
    		  
    		  
    		  
    	  }
    	  
    	 
    	  
    	  
    	  
      }
      
      
      public void hobbylist2() {
    	  
    
    	  Scanner sc3 = new Scanner(System.in);
    	  System.out.println("��̵��");
    	  System.out.println("1. �⺻��������  2.��̵��");
    	  int num2 = sc3.nextInt();
    	  if(num2 == 1) {
    		  
    		  memberupdate();
    		  
    	  }else  {
    		  
    		  Scanner sc4 = new Scanner(System.in);
    		  System.out.println("��̸� ������ּ���");
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
                System.out.println("1. �޸��� 2. �޸� ���");
                int num = sc.nextInt();
                if(num == 1) {
                	
                	
                	
                } else {
                	
                	
                }
                
                
                
      }
      
}
                
                			
               	  
    	  
    	  
      
 
    
    
	
    	  
    	  
    	  
    	  
    	  
    	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


