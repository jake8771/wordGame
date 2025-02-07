import java.util.*;


public class Day01 {

	public static void main(String[] args) {
		             
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
