package sec2;

import java.util.Date;

public class Board {
	private int number;
	private String title;
	private String content;
	private String writer;
	private Date date;
	
	/*public Board(){}
	public Board(int number,String title,String content,String writer,String date){
		this.number=number; this.title=title; 
		this.content=content; this.writer=writer; this.date=date;
		
	}*/
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void boardWrite(int number, String title, String content, String writer, Date date){
		this.number=number; this.title=title; this.content=content; this.writer=writer; this.date=date;
	}
	
	public void boardUpdate(int number,String title,String content){
		if(number==this.number){
			this.title=title;
			this.content=content;
		}
	}
	public void boardDelete(int number){
		if(number==this.number){
			try {
				this.finalize(); //this.finalize() 빨간줄 try,catch 선택
			} catch (Throwable e) {
				e.printStackTrace();
			}
			/*this.title="";
			this.content="";
			this.writer="";*/
		}
	}
	public void boardSearch(int number){
		if(number==this.number){
			System.out.println(this.number+"\t"+this.title+"=\t"+this.content+"\t"+this.writer+"\t"+this.date);
		}
	}
	

}
