import java.util.*;


public class Day01 {

	public static void main(String[] args) {
		             
		String eng[]= {"culture", "experience", "education", "symbol", "effect", "liberty", "affair", "comfort", "tradition", "subject"};
		Scanner s=new Scanner(System.in);
		Random r=new Random();

		String start;
		System.out.println("������ �����ϰڽ��ϱ�? ENTERŰ�� ������ ������ ����˴ϴ�.");
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
					
			System.out.println("������ ����Ǿ����ϴ�. ����� ������ "+score+"�� �Դϴ�.");

					
		
	}

}
