import java.util.*;
public class day06_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		/*
	    Scanner in = new Scanner (System.in);
	    while(true) {
	    	
	    	System.out.println("�̸��� �Է��ϼ���");
	    	String name = in.nextLine();
	    	System.out.println("�Է��Ͻ� �̸���" + name);
	    	System.out.println("�Է��Ͻ� �̸��� ���̴�" + name.length());
	    	System.out.println("���̸� �Է��ϼ���");
	    	int age = in.nextInt();
	    	System.out.println("�Է��Ͻ� ���̴�" + age);
	    	System.out.println("��̸� �Է��ϼ���");
	    	String hobby = in.nextLine();
	    	System.out.println("��̷�" + hobby + "�� �Է��ϼ̽��ϴ�.");
	    	
	    	
	    }
		*/
		int cnt = 0;
		Scanner sc = new Scanner (System.in);
		String sign="!@#$%^&*";
		System.out.println("���̵� �Է��ϼ���.");
		while(true) {
		
			String c = sc.nextLine();
			cnt = 0;
			for(int i=0; i < c.length(); i++) {
				
				
				for(int j=0; j < sign.length();j++) {
					 
					
					if(c.charAt(i) == sign.charAt(j)) {
					    
						cnt++;
					}
					
					
					
				}
				
		   
				
			}
			
			
			System.out.println("Ư�������� ������" + cnt);
			
		

			
			
		}
		
	
		
		
		
		
	
			
			
			
			
			
		
		
		
		
		
		
		
		
		
	}

}
