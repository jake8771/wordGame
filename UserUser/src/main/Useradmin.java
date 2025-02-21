package main;

import java.util.Scanner;

public class Useradmin {

	User[] ulist = new User[5];
	public void mainStart() {
		
		Scanner in = new Scanner(System.in);
		while(true) {
		menu();
		System.out.println("선택");
		int a = in.nextInt();
		if(a==1) {
			add();
		}else if(a==2) {
			list();
		}else if(a==3) {
			delete();
		}else if(a ==4) {
			mod();
		}else if(a == 5) {
			search();
		}else {
		  break;
		}
	}
		
	}
	
	public void menu() {
		System.out.println("1.추가");
		System.out.println("2.전체보기");
		System.out.println("3.삭제");
		System.out.println("4.수정");
		System.out.println("5.검색");
		
	}
	
     public void add() {
    	 
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("사용자 추가");
    	 System.out.println("아이디 입력");
    	 String id = in.nextLine();
    	 System.out.println("이름 입력");
    	 String name = in.nextLine();
    	 System.out.println("주소입력");
    	 String addr = in.nextLine();
    	 System.out.println("1.성인 2.미성년자");
    	 String a = in.nextLine();
    	 boolean adultFlag = true;
    	 if(a.equals("2")) adultFlag = false;
		 User user = new User(id,name,addr,adultFlag);
		 
		 for(int i=0; i < ulist.length;i++) {
			 if(ulist[i] == null) {
				 ulist[i] = user; // user의 User 객체 주소를 복사해서 ulist 객체 배열에 User의 객체 주소를 담는 역할을 한다. (주소를 저장함)
				 break;
			 }
		 }
	 }
     

     public void list() {
    	 for(int i = 0; i < ulist.length; i++) {
    		 if(ulist[i] != null) ulist[i].prt();
    	 }
	
      }

     public void delete() {
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("아이디를 입력해주세요.");
    	 String did = in.nextLine();
    	 for(int i = 0; i < ulist.length; i++) {
    		 if(ulist[i]!= null) {
    			 if(ulist[i].id.equals(did)) {
    				 ulist[i] = null;
    			 }
    		 }
    	 }
    	 in.close();
	
      }
      public void mod() {
    	  // 아이디를 입력받아서 수정ㄴ
    	  // 순서 1. 아이디 입력받는다. 2. 배열에 찾는다. 3. 수정한다(이름만)
    	  Scanner in = new Scanner(System.in);
    	  System.out.println("아이디를 입력하세요");
    	  String did = in.nextLine();
    	  for(int i=0; i < ulist.length; i++) {
    		  if(ulist[i]!=null) {
    			  if(ulist[i].id.equals(did)) {
    				  //System.out.println("수정할 이름을 입력하세요");
    				  //String newName = in.nextLine();
    				  //ulist[i].name = newName;
    				  //ulist[i].setName(newName);
    				  ulist[i].menu();
    			  }
    		  }
    	  }
    	  
    	  
    	  
    	  
    	  
	
      }
      public void search() {
    	  Scanner in = new Scanner(System.in);
    	  System.out.println("검색어(id)를 입력하세요.");
    	  String sid = in.nextLine();
    	  for(int i=0; i < ulist.length;i++) {
    		  if(ulist[i]!=null) {
    			  //if(ulist[i].id.equals(sid)) indexOf 메서드 알아보기
    			  if(ulist[i].id.indexOf(sid) != -1)
    			  {
    				  ulist[i].prt();
    			  }
    		  }
    	  }
	
      }
}
