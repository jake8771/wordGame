
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
	      System.out.print("Start!(enter를 누르세요)");
	      String b=s.nextLine();
	      System.out.println("영단어의 스펠링을  입력하세요.");
	      
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
	         
	       
	         
	         
	      System.out.print("게임의점수는"+score+"로");
	      if(score>=150) {
	         System.out.println("A입니다.");
	      }else if(score<150 &&score>=140) {
	         System.out.println("B입니다.");
	      }else if(score<140&&score>=130) {
	         System.out.println("C입니다.");
	      }else if(score<130&&score>100) {
	         System.out.println("D입니다.");
	      }else {System.out.println("F입니다.");
	      }
	      
	      
	      System.out.println("그만하고 싶다면 종료를,다시하길 원하신다면 다시하기를,틀린단어를 복습하시고 싶다면 오답을 입력해주세요.");
	      b=s.nextLine();
	      if(b.equals("종료")) {break;}
	      else if(b.equals("다시하기")) {continue;}
	      else if(b.equals("오답")) {
	         if(cnt==0) {
	            System.out.println("오답이 없습니다.그만하고 싶다면 종료를,다시하길 원하신다면 다시하기를 입력해주세요");}
	            b=s.nextLine();
	            if (b.equals("종료")) {break;}
	            else if(b.equals("다시하기")) {continue;}

	         else {for(int c=0; c<5;c++) {
	            
	            System.out.println();
	            continue;}}}
	      }
		
		
		

	}

}
