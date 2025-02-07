
public class Day02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		/*
		int pointEng = 0; // 
		double avgPoint = 0.0; //
		boolean haveMoney = false; //
		char saveWord = 'a'; // 
		
		
		
		System.out.println(pointEng);
		System.out.println(avgPoint);
		System.out.println(haveMoney);
		System.out.println(saveWord);
		*/
		
		/*
		int b = 10; // b 변수를 선언하고 b 변수의 자료형은 int이다. 초기값 10을 대입하여 저장함.
		int c = 4; // c 변수를 선언하고 c 변수의 자료형은 int이다. 초기값 4를 대입하여 저장함.
		int d = b /c; // d변수를 선언하고 자료형은 int이다. 초기값은 b/c 결과를 대입하여 저장한다. b/c 연산은 정수/정수 연산이므로 결과값은 정수이다. 결과값은 2이다.
		double e = b / c; // e 변수를 선언하고 자료형은 double이다. 초기값은 b/c 
		int g = b /c;
		double h = b / (double)c; //h변수를 선언하고 자료형은 더블이다.  초기값은 b/(double)c 결과를 대입하여 저장  b/(double)c 연산은 캐스팅이 일어난다. 타입을 맞추기 위해 정수부분이 묵시적형변환이일어나서  실수/실수가 된다. 실수의 나누기 연산이 결과값은 2.5가 된다. 이 결과값이 h변수에 저장된다.
		System.out.println(e);
		System.out.println(g);		
		System.out.println(h);
		*/
		//철수는 3과목의 평균을 구하는데 
		/*
		float pointJava = 10;
		float pointOracle = 50;
		float pointMaria = 80;
		
		float avg = 0;
		
	     avg = (pointJava + pointOracle + pointMaria)/(float) 3;
		System.out.println(avg);
		*/
		/*
		int a = 10;//
		int b = 50;//
		int c = 0;//
		double e = 20;//
		int f = 4;//
		c = a + b;//
		int d = a+b/f;//
		b=d;
		e = b /(double) f;//
		int g = (int) (b/(double)f);//
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(g);
		*/
		/*
		int pJava=50;
		int pDb=80;
		boolean c = (pJava >= 60) && (pDb >= 60);
		System.out.println(c);
		*/
		/*
		int ageChul=30;
		int ageGirl=26; 
		boolean b = (ageChul - ageGirl) <= 2;
		boolean c = (ageChul - ageGirl) >= 2;
		System.out.println(b);
		System.out.println(c);
		*/
		
		/*
		char beforeChar='a';
		int charNum=0;
		System.out.println(charNum = (int)beforeChar);
	*/
		
		/*
		int middle=80;
		int filnal=70;
		double total = 0;
		total = (double)middle + filnal;
		System.out.println(total);
		*/
		
		/*
		char beforeChar = 'a';
		boolean d = (beforeChar >= 'a' && beforeChar <= 'z');
		boolean f =  (beforeChar >= 'A' && beforeChar <= 'Z');

		System.out.println(d);
		System.out.println(f);
		*/
		/*
		char beforeChar='a';
		int afterChar = (int)beforeChar - 32;
		System.out.println((char)afterChar);
		*/
		
       /*
		char beforeChar='a';
		int charNum=0;
		System.out.println(charNum = (int)beforeChar);
		*/ 
		  
	
		char b = 'a';
		int a = (int)b-97;
		
		System.out.println(b+2); // 결과값 99
		System.out.println((char)(b+2)); // 결과값 c
		System.out.println("현재값" + a);
		
		System.out.println("원하는 값"+a);
		a=((a+2)%26)+97;
		//System.out.println("97에서 떨어진수 "  + a);
		System.out.println("원하는 값" + (char)a);
		
		
     

		
				
	}

}
