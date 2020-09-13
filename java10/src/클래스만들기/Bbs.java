package 클래스만들기;

public class Bbs {
	public int id;
	public String title;
	public String content;
	public String writer;

	public void create() {
		System.out.println(id + "번 게시물을 작성합니다.");
	}

	public void read() {
		System.out.println(id + "번 게시물을 읽습니다.");

	}

	public void update() {
		System.out.println(id + "번 게시물을 수정합니다.");

	}

	public void delete() {
		System.out.println(id + "번 게시물을 삭제합니다.");

	}

	@Override
	public String toString() {
		return id + ", " + title + ", " + content + ", " + writer;
	}
	
}
