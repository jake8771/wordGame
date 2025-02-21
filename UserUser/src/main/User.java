package main;
import java.util.*;
public class User {

	String id = null;
	String name = null;
	String addr = null;
	boolean adultFlag = true;
	
	User(String id,String name,String addr,boolean adultFlag){
		
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.adultFlag = adultFlag;
	}
	
	public void prt() { // 다른 클래스에서 멤버변수에 직접 접근하지 말고 
		                // prt() 메서드를 통해서 접근하라..(은닉화)
		System.out.println("아이디 :" + id);
		String prtName = this.name;
		if(!adultFlag) {
			prtName+="(미성년자)";
		}
		System.out.println("이름 : " + prtName);
	}
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
		System.out.println("1.정보수정 2.메모추가");
		int a =in.nextInt();
		in.nextLine();
		if(a==1) {
			
		}else if(a==2) {
			
		}else {
			break;
		}
	}
	}
	
	private void modInfo() {
		Scanner in = new Scanner(System.in);
		System.out.println("새로운 이름을 입력하세요.");
		String name = in.nextLine();
		this.name = name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
}
