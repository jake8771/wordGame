import java.util.*;

public class Day06 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] train = new String[5];
	    String[] checktrain = new String[5];
		System.out.println("���� 5����� ����ϼ���");
		for(int i=0; i <5; i++) {
		
			String train2 = sc.nextLine();
			train[i] = train2;
			
						
		}
		
		System.out.println("���� 5�� �̸� ��� ���α׷�");
		for(int i=0; i <5; i++) {
				
			System.out.println((i+1) +"." +  train[i]);
			
						
		}
		
		System.out.println("���� �˻��ϴ� ���α׷�");
		   for(int i = 0; i < 5; i++){

		      String CheckTrainName = sc.nextLine();
		      checktrain[i] = CheckTrainName;
		      
		      if(checktrain[i] == train[i])
		{
		 checktrain[i] = train[i];
		System.out.println(checktrain[i]);
		}
		      
		      
		
		}
		
	}
	
}
	


