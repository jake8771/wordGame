
import java.util.*;


public class english23 {

	public static void main(String[] args) {
		
		
		String[]a= {"culture","experience","education","symbol","effect","liberty","affair","comfort","tradition","subject"};
	      char[]grade= {'A','B','C','D','F'};
	      int cnt=0;
	      String[] fail=new String[5];
	      
	      
	      
	      Scanner s=new Scanner(System.in);
	      Random r=new Random();
	      
	      
	      while(true){
	          cnt=0;
	          int score=0;
	      System.out.print("Start!(enter�� ��������)");
	      String b=s.nextLine();
	      System.out.println("���ܾ��� ���縵��  �Է��ϼ���.");
	      
	      for(int c=0; c<5; c++) {
	         String d=a[r.nextInt(a.length)];
	         System.out.println(d);
	         b=s.nextLine();
	         for(int i=0; i<d.length() &&i< b.length(); i++) {
	            if(d.charAt(i)==b.charAt(i)) { 
	               score+=5;}}
	         if(!d.equals(b)) {
	            cnt++; fail[c]=d;
	          }
	      }
	         
	       
	         
	         
	      System.out.print("������������"+score+"��");
	      if(score>=150) {
	         System.out.println("A�Դϴ�.");
	      }else if(score<150 &&score>=140) {
	         System.out.println("B�Դϴ�.");
	      }else if(score<140&&score>=130) {
	         System.out.println("C�Դϴ�.");
	      }else if(score<130&&score>100) {
	         System.out.println("D�Դϴ�.");
	      }else {System.out.println("F�Դϴ�.");
	      }
	      
	      
	      System.out.println("�׸��ϰ� �ʹٸ� ���Ḧ,�ٽ��ϱ� ���ϽŴٸ� �ٽ��ϱ⸦,Ʋ���ܾ �����Ͻð� �ʹٸ� ������ �Է����ּ���.");
	      b=s.nextLine();
	      if(b.equals("����")) {break;}
	      else if(b.equals("�ٽ��ϱ�")) {continue;}
	      else if(b.equals("����")) {
	         if(cnt==0) {
	            System.out.println("������ �����ϴ�.�׸��ϰ� �ʹٸ� ���Ḧ,�ٽ��ϱ� ���ϽŴٸ� �ٽ��ϱ⸦ �Է����ּ���");}
	            b=s.nextLine();
	            if (b.equals("����")) {break;}
	            else if(b.equals("�ٽ��ϱ�")) {continue;}

	         else {for(int c=0; c<5;c++) {
	            
	            System.out.println();
	            continue;}}}
	      }
		
		
		

	}

}
