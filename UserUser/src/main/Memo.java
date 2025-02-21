package main;

public class Memo {
	
	String title = null;
	String content = null;
	//생성자를 기본생성자로 코딩한다는 개념으로 한다. 기본생성자 : Memo()
	public void prt() {
		System.out.println("제목"+title);
		System.out.println("내용"+content);
	}
	
	public void setdata(String title,String content) {
		this.title = title;
		this.content = content;
	}

}
