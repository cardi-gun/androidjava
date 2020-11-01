package BCbean;

import java.sql.Date;

public class PaymentVO {
	int pCode; //결제코드
	String pAccNum; //결제계좌번호
	String pBankName; //결제은행명
	String pAccName; //결제예금주명
	Date pDate; //결제날짜
	Date pCancle; //결제환불날짜
	int cCode; //강의코드
	int cPrice; //강의가격
	String uID; //유저아이디
	
	public int getpCode() {
		return pCode;
	}
	public void setpCode(int pCode) {
		this.pCode = pCode;
	}
	public String getpBankName() {
		return pBankName;
	}
	public void setpBankName(String pBankName) {
		this.pBankName = pBankName;
	}
	public String getpAccNum() {
		return pAccNum;
	}
	public void setpAccNum(String pAccNum) {
		this.pAccNum = pAccNum;
	}
	public String getpAccName() {
		return pAccName;
	}
	public void setpAccName(String pAccName) {
		this.pAccName = pAccName;
	}
	public Date getpDate() {
		return pDate;
	}
	public void setpDate(Date pDate) {
		this.pDate = pDate;
	}
	public Date getpCancle() {
		return pCancle;
	}
	public void setpCancle(Date pCancle) {
		this.pCancle = pCancle;
	}
	public int getcCode() {
		return cCode;
	}
	public void setcCode(int cCode) {
		this.cCode = cCode;
	}
	public int getcPrice() {
		return cPrice;
	}
	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}
	public String getuID() {
		return uID;
	}
	public void setuID(String uID) {
		this.uID = uID;
	}
}
