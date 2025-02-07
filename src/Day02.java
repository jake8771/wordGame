import java.util.*;


public class Day02 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
				
		/*
		  영수와 철수는 각각 기본 점수 100점이다.
		  
		  int pointYougsu = 100; (자료형 int를 선언하고, pointYougsu라는 변수명을 선언하였다. 100이라는 값을 저장했다.)
		  int pointChulsu = 100; (자료형 int를 선언하고, pointChulsu라는 변수명을 선언하였다. 100이라는 값을 저장했다.)
		  
		  철수가 2번 연속 이겼다.
		  
		  pointChulsu = pointChulsu + 10;
		  pointYougsu = pointYougsu - 10;
		  pointChulsu = pointChulsu + 10;
		  pointYougsu = pointYougsu - 10;
		  
		  비겼다.
		   pointChulsu = pointChulsu + 2;
		   pointYougsu = pointYougsu + 2;
		   
		  영수가 1번 이겼다.
		  
		  pointYougsu = pointYougsu + 10; // 변수 + 10(상수) +는 사칙 연산자 근거 : 자료형이 int이기 때문이다. 
		  pointChulsu = pointChulsu - 10; // 변수 - 10(상수) -는 사칙 연산자 근거 : 자료형 int익 때문이다.
		  
		  최종 점수를 출력하시오.
		      System.out.println("영수의 점수" + pointYougsu);
		      System.out.println("철수의 점수" + pointChulsu);
		 */
		
		
        
	String eng[]= {"culture", "experience", "education", "symbol", "effect", "liberty", "affair", "comfort", "tradition", "subject"};
	Scanner s=new Scanner(System.in);
	Random r=new Random();

	String start;
	System.out.println("게임을 시작하겠습니까? ENTER키를 누르면 게임이 실행됩니다.");
	start=s.next();
		if (start=="line.separator") {
			for(int i=0; i<5; i++) {
				int score=0;
				String system[]=new String[5];
				String user[]=new String[5];
				int random=r.nextInt(10);
				system[i]=eng[random];
				user[i]=s.next();
					if (system[i]==user[i]) {
						score+=20;
						}else score-=10;
				
		System.out.println("게임이 종료되었습니다. 당신의 점수는 "+score+"점 입니다.");

	
				
		
     
		
		
	}

}
