
public class Day3_01 {

	
	//1.1부터 20까지 숫자 중 3의 배수를 모두 출력하시오.

	//2.철수는 int point = 70점을 획듣한 상태이다. 철수는 보너스를 2회 획득하였다. 보너스 당 +10점을 추가로 부여한다. 철수의 현재 점수에 보너스 점수를 획한 한 후의 점수를 출력하시오.
    
	
	//3. 100부터 50까지 숫자를 내림차순으로 출력하시오.
	
	//4. 철수는 30일 동안 매일 천원씩 저금을 하려고 한다. 현재 금액이 1000원이다. 짝수 날짜에는 500원을 추가로 저금한다. 30일 지난 후 철수가 모을 수 있는 금액은?
	
	/*
	public static void main(String[] args) {
	
		for (int i =1; i <= 20; i++) {
			    
			  if(i%3 == 0) {
				  System.out.println(i);
			  }
			  
			 }
		  
		}
	*/
	
	// 반복할 작업 : 숫자 중 3의 배수를 출력한다. >> 여기에는 저장할 값은 없고, 3의 배수 판별하는 조건이 필요
	// 반복문 작성 -- 반복문은 총 20번 반복해야 한다.
	//초기값 : int i = 1;
	//조건식 : i <= 20
	//증감식 : i++;
	
	
	
	
	/*
	public static void main(String[] args) {
		
		      int point = 70;
		      for(int i =0; i <10; i++) {
		    	  
		    	    point+=10;
		    	   
		    	  
		    	  
		      }
		
		
		
		      System.out.println(point);
		
		
	}
	*/
	
	// 반복할 작업 : 철수의 현재 point에 보너스 10점을 가산한다.
	// 반복문 작성 -- 보너스를 10회 가산하는 작업을 반복한다.
	//초기값 : int i = 0;
	//조건식 : i < 10
	//증감식 : i++;
	/*
	public static void main(String[] args) {
	
	              for(int i = 100; i>=50;i--) {
	            	  
	            	  System.out.println(i);
	              }
	
         
		
	}
	*/
	// 반복할 작업 : 철수의 현재 point에 보너스 10점을 가산한다.
	// 반복문 작성 -- 보너스를 10회 가산하는 작업을 반복한다.
	//초기값 : int i = 100;
	//조건식 : i >= 50;
	//증감식 : i--;
	
	/*
	public static void main(String[] args) {
		
		int money = 1000;
		for(int i=1;i<=30;i++) {
			  money+=1000;
			    if(i%2 == 0) {
				    money += 500;
				    System.out.println(money);
			   }
	
			
			
		   }
		
		           System.out.println(money);
	
	
	
	}
	*/
}
	

	



