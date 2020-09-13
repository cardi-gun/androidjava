package db연결;

public class MemberVO {
	//private을 쓰면, 이 클래스 내에서만 변수에 접근해서 쓸 수 있음.
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//외부에서 접근이 불가하기 때문에 이곳에서
	//각 변수에 값을 넣고 빼는 메서드를 정의해준다. 
	
	//가방에 넣을 때 set메서드로 정의하고 :setters
	public void setId(String id) {
		this.id = id;//this이 클래스에서 사용되는 전역변수를 지칭
	}//setId
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//가방에서 꺼낼 때는 get메서드로 정의한다.:getters
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	

}//class
