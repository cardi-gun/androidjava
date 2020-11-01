package BCbean;

import java.sql.Date;
import java.sql.Time;

public class ClassVO {
	int cCode; //강의코드
	String cTitle; //강의제목
	String cType; //강의종류
	
	Date cDate; //강의날짜
	String cDay;//강의요일
	
	Time cTime; //강의시간(시간대 오전 오후 저녁, String 예상 = cType처럼.)
	String cAddress; // 강의장소주소
	String cInfo; //강의내용
	byte cLimit; // 강의인원수
	int cPrice; //강의가격
	String cImg; //강의이미지
	String tID; //강사아이디

	public int getcCode() {
		return cCode;
	}
	public void setcCode(int cCode) {
		this.cCode = cCode;
	}
	public String getcTitle() {
		return cTitle;
	}
	public void setcTitle(String cTitle) {
		this.cTitle = cTitle;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	public Date getcDate() {
		return cDate;
	}
	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	public String getcDay() {
		return cDay;
	}
	public void setcDay(String cDay) {
		this.cDay = cDay;
	}
	public Time getcTime() {
		return cTime;
	}
	public void setcTime(Time cTime) {
		this.cTime = cTime;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcInfo() {
		return cInfo;
	}
	public void setcInfo(String cInfo) {
		this.cInfo = cInfo;
	}
	public byte getcLimit() {
		return cLimit;
	}
	public void setcLimit(byte cLimit) {
		this.cLimit = cLimit;
	}
	public int getcPrice() {
		return cPrice;
	}
	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}
	public String getcImg() {
		return cImg;
	}
	public void setcImg(String cImg) {
		this.cImg = cImg;
	}
	public String gettID() {
		return tID;
	}
	public void settID(String tID) {
		this.tID = tID;
	}
}
