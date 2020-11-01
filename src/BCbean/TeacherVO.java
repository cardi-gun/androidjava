package BCbean;

public class TeacherVO {
	String tID; //강사아이디
	String tPW; //강사비밀번호
	String tName; //강사이름
	String tBrith; //강사생년월일
	char tGender; //강사성별
	String tTel; //강사전화번호
	String tCrt; //강사자격증
	String tAccNum; //강사계좌번호
	String tBankName; //강사은행명
	String tAccName; //강사예금주명
	
	public String gettID() {
		return tID;
	}
	public void settID(String tID) {
		this.tID = tID;
	}
	public String gettPW() {
		return tPW;
	}
	public void settPW(String tPW) {
		this.tPW = tPW;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettBrith() {
		return tBrith;
	}
	public void settBrith(String tBrith) {
		this.tBrith = tBrith;
	}
	public char gettGender() {
		return tGender;
	}
	public void settGender(char tGender) {
		this.tGender = tGender;
	}
	public String gettTel() {
		return tTel;
	}
	public void settTel(String tTel) {
		this.tTel = tTel;
	}
	public String gettCrt() {
		return tCrt;
	}
	public void settCrt(String tCrt) {
		this.tCrt = tCrt;
	}
	public String gettAccNum() {
		return tAccNum;
	}
	public void settAccNum(String tAccNum) {
		this.tAccNum = tAccNum;
	}
	public String gettBankName() {
		return tBankName;
	}
	public void settBankName(String tBankName) {
		this.tBankName = tBankName;
	}
	public String gettAccName() {
		return tAccName;
	}
	public void settAccName(String tAccName) {
		this.tAccName = tAccName;
	}
	
}
