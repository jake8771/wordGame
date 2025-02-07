
public class Day05 {

	public static void main(String[] args) {
	/*	
	   int a = 56773;
	   
	   int b = a/10000;
	   a = a % 10000;
	   
	   int c = a / 1000;
	   a = a % 1000;
	   
	   int d = a /100;
	   a = a % 100;
	   
	   int e = a / 10;
	   a = a % 10;
	   
	   int f = a;
	   
	   int g = 0;
	   
	   g = b + c + d + e + f;
	   
	   
	   System.out.println("총 자리수의 합은 " + g);
	   */
		
		int chul = 56773;
		int sum = 0;
		sum+=(chul%10);
		chul/=10;
		sum+=(chul%10);
		chul/=10;
		sum+=(chul%10);
		chul/=10;
		sum+=(chul%10);
		chul/=10;
		sum+=(chul%10);
		chul/=10;
		
		System.out.println(sum);
										
	   	}

}
