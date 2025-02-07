

import java.util.*;


public class EnglishVocaproject {

	public static void main(String[] args) {
		
		String[]a= {"culture","experience","education","symbol","effect","liberty","affair","comfort","tradition","subject"};// 
	      char[]grade= {'A','B','C','D','F'}; // grade 점수별로 선택 
	
	      int[] achk = new int[a.length];
	      int cnt=0; // cnt 맞은 개수 코드 만드는 법 
	      int num;
		  String d;
	     
	      
	      
	      
	       System.out.println("===================");
	       System.out.println("   영어 타자 게임 시작     ");
	       System.out.println("===================");
	       
	       System.out.println("┏━━━━━━━━━━━━━━━━━━━━┓");
	       System.out.println("┃저장된 영단어 타자 프로그램  ┃");
	       System.out.println("┗━━━━━━━━━━━━━━━━━━━━┘");
	       System.out.println();
	       
	       System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
	   
	       for (int i = 0; i < 2; i++) {
	    	    System.out.println("                                                       ┃");
	            for (int j = 0; j < 5; j++) {
	                System.out.print(a[i * 5 + j] + "\t");  // tab으로 구분
	            }
	            
	            System.out.println();  // 줄 바꿈
	            System.out.println("                                                       ┃");
	    
	       }
	       
	       System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┘");
	      
	      Scanner s=new Scanner(System.in);
	      Random r=new Random();
	     
	 

	      
	      
	      
		


	}
	      
	}
	



