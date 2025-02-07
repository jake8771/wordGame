import java.util.*;
public class day06_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		/*
	    Scanner in = new Scanner (System.in);
	    while(true) {
	    	
	    	System.out.println("이름을 입력하세요");
	    	String name = in.nextLine();
	    	System.out.println("입력하신 이름은" + name);
	    	System.out.println("입력하신 이름의 길이는" + name.length());
	    	System.out.println("나이를 입력하세요");
	    	int age = in.nextInt();
	    	System.out.println("입력하신 나이는" + age);
	    	System.out.println("취미를 입력하세요");
	    	String hobby = in.nextLine();
	    	System.out.println("취미로" + hobby + "을 입력하셨습니다.");
	    	
	    	
	    }
		*/
		int cnt = 0;
		Scanner sc = new Scanner (System.in);
		String sign="!@#$%^&*";
		System.out.println("아이디를 입력하세요.");
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
			
			
			System.out.println("특수문자의 개수는" + cnt);
			
		

			
			
		}
		
	
		
		
		
		
	
			
			
			
			
			
		
		
		
		
		
		
		
		
		
	}

}
