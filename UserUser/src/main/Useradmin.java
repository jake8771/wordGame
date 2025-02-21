package main;

import java.util.Scanner;

public class Useradmin {

	User[] ulist = new User[5];
	public void mainStart() {
		
		Scanner in = new Scanner(System.in);
		while(true) {
		menu();
		System.out.println("����");
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
		System.out.println("1.�߰�");
		System.out.println("2.��ü����");
		System.out.println("3.����");
		System.out.println("4.����");
		System.out.println("5.�˻�");
		
	}
	
     public void add() {
    	 
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("����� �߰�");
    	 System.out.println("���̵� �Է�");
    	 String id = in.nextLine();
    	 System.out.println("�̸� �Է�");
    	 String name = in.nextLine();
    	 System.out.println("�ּ��Է�");
    	 String addr = in.nextLine();
    	 System.out.println("1.���� 2.�̼�����");
    	 String a = in.nextLine();
    	 boolean adultFlag = true;
    	 if(a.equals("2")) adultFlag = false;
		 User user = new User(id,name,addr,adultFlag);
		 
		 for(int i=0; i < ulist.length;i++) {
			 if(ulist[i] == null) {
				 ulist[i] = user; // user�� User ��ü �ּҸ� �����ؼ� ulist ��ü �迭�� User�� ��ü �ּҸ� ��� ������ �Ѵ�. (�ּҸ� ������)
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
    	 System.out.println("���̵� �Է����ּ���.");
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
    	  // ���̵� �Է¹޾Ƽ� ������
    	  // ���� 1. ���̵� �Է¹޴´�. 2. �迭�� ã�´�. 3. �����Ѵ�(�̸���)
    	  Scanner in = new Scanner(System.in);
    	  System.out.println("���̵� �Է��ϼ���");
    	  String did = in.nextLine();
    	  for(int i=0; i < ulist.length; i++) {
    		  if(ulist[i]!=null) {
    			  if(ulist[i].id.equals(did)) {
    				  //System.out.println("������ �̸��� �Է��ϼ���");
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
    	  System.out.println("�˻���(id)�� �Է��ϼ���.");
    	  String sid = in.nextLine();
    	  for(int i=0; i < ulist.length;i++) {
    		  if(ulist[i]!=null) {
    			  //if(ulist[i].id.equals(sid)) indexOf �޼��� �˾ƺ���
    			  if(ulist[i].id.indexOf(sid) != -1)
    			  {
    				  ulist[i].prt();
    			  }
    		  }
    	  }
	
      }
}
