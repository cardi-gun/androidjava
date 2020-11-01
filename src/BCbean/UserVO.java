package BCbean;

public class UserVO {
	String uID; //유저아이디
	String uPW; //유저비밀번호
	String uName; //유저이름
	String uBrith; //유저생년월일
	char uGender; //유저성별
	String uTel; //유저전화번호
	
	public String getuID() {
		return uID;
	}
	public void setuID(String uID) {
		this.uID = uID;
	}
	public String getuPW() {
		return uPW;
	}
	public void setuPW(String uPW) {
		this.uPW = uPW;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuBrith() {
		return uBrith;
	}
	public void setuBrith(String uBrith) {
		this.uBrith = uBrith;
	}
	public char getuGender() {
		return uGender;
	}
	public void setuGender(char uGender) {
		this.uGender = uGender;
	}
	public String getuTel() {
		return uTel;
	}
	public void setuTel(String uTel) {
		this.uTel = uTel;
	}
	
}
