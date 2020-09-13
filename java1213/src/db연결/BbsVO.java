package db연결;

public class BbsVO {
	//멤버 변수 설정
	private int no;
	private String title;
	private String content;
	private String writer;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	//소스 -> 제너레이트 스트링
	//다른곳에서 BbsVO를 찍으면 나타날수있도록
	@Override
	public String toString() {
		return "가르키는 값들 [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
