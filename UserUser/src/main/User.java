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
	
	public void prt() { // �ٸ� Ŭ�������� ��������� ���� �������� ���� 
		                // prt() �޼��带 ���ؼ� �����϶�..(����ȭ)
		System.out.println("���̵� :" + id);
		String prtName = this.name;
		if(!adultFlag) {
			prtName+="(�̼�����)";
		}
		System.out.println("�̸� : " + prtName);
	}
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
		System.out.println("1.�������� 2.�޸��߰�");
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
		System.out.println("���ο� �̸��� �Է��ϼ���.");
		String name = in.nextLine();
		this.name = name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
}
