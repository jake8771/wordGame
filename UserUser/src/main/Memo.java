package main;

public class Memo {
	
	String title = null;
	String content = null;
	//�����ڸ� �⺻�����ڷ� �ڵ��Ѵٴ� �������� �Ѵ�. �⺻������ : Memo()
	public void prt() {
		System.out.println("����"+title);
		System.out.println("����"+content);
	}
	
	public void setdata(String title,String content) {
		this.title = title;
		this.content = content;
	}

}
