
public class Day03_01 {

	public static void main(String[] args) {
		// 배열 특징 : 연속적으로 할당, 고정길이
		// 참조변수명, 길이(인덱스), value를 먼저 분석한다.
		/*
		int[] a = new int[4];
		System.out.println("길이 : " + a.length);
		System.out.println("초기값 : " + a[0]); // ln은 줄 바꿈을 의미한다.
		a[0] = 40;
		a[3] = 60;
		System.out.print(a[0] + "/" + a[1] + "/" + a[2] + "/" + a[3]);
		System.out.print("ok");
	    //배열의 인덱스 범위가 벗아나면 예외 발생
	    //a[4] = 70;
        */
		/*
		
		String[] menu = {"짜장면","국수","우동","한식"};
		System.out.println("오늘의 저녁 메뉴");
		System.out.print(menu[0]);
		System.out.print(menu[1]);
		System.out.print(menu[2]);
		System.out.print(menu[3]);
		menu[2] = "돈가스";
		System.out.println(); // 행 바꿈 
		System.out.print(menu[0]);
		System.out.print(menu[1]);
		System.out.print(menu[2]);
		System.out.print(menu[3]);
		*/
		
		// 2번 문제 
		/*
		int[] dartpoint = {20,0,30,35,19};
		double avg;
		avg = dartpoint[0]+dartpoint[1]+dartpoint[2]+dartpoint[3]+dartpoint[4];
		System.out.println(avg);
		*/
		
		/*
		int[] Point = new int[1];
		Point[0] = 80;
		System.out.println(Point[0]);
		*/
		/*
		int[] Number = new int[2];
		double Quota;
		Number[0] = 10;
		Number[1] = 4;
		Quota = Number[0] / Number[1];
		System.out.println(Quota);
        */
		/*
		String[] name = new String[1];
		name[0] = "홍길동";
		System.out.println(name[0] + "님");
		*/
		/*
		int[] lotto = {6,12,33,4,5,26};
		lotto[2] = lotto[2] + 80;
		System.out.println(lotto[2]);
		*/
		
		/*
		int total;
		int[] carNumber = {3,4,5,6};
		int[] ParkingNumber = {0,1,2,3,4,5,6,7,8,9};
		total = carNumber[0] + carNumber[1] + carNumber[2] + carNumber[3];
		total = total % 10;
		System.out.println(total);
		*/
		/*
		byte[] buffers = {97, 49, 98, 50, 99, 51}; 
		System.out.println((char)buffers[0]);
		System.out.println((char)buffers[1]);
		System.out.println((char)buffers[2]);
		System.out.println((char)buffers[3]);
		System.out.println((char)buffers[4]);
		System.out.println((char)buffers[5]);
		*/
		
		boolean sinHo[] = {true,false}; 
		System.out.println("횡단보도로 건너면 파란불" + sinHo[0] + "기다려야 한다면" + sinHo[1]);
	    

	
	}

}
