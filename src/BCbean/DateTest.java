package BCbean;

import java.util.Calendar;

public class DateTest {

	public static String getCurMonday(){

 		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy.MM.dd");

 		Calendar c = Calendar.getInstance();

 		c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);

 		return formatter.format(c.getTime());

 	}



 	//현재 날짜 일요일

 	public static String getCurSunday(){

 		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy.MM.dd");

 		Calendar c = Calendar.getInstance();

 		

 		c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);

 		c.add(c.DATE,7);

 		return formatter.format(c.getTime());

 	}

 	

 	//현재 날짜 주차

 	public static String getWeek(){

 		Calendar c = Calendar.getInstance();

 		String week = String.valueOf(c.get(Calendar.WEEK_OF_MONTH));

 		return week;

 	}

 	

 	//특정 년,월,주 차에 월요일 구하기

 	public static String getMonday(String yyyy,String mm, String wk){

 		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy.MM.dd");

 		Calendar c = Calendar.getInstance();

 		

 		int y=Integer.parseInt(yyyy);

 		int m=Integer.parseInt(mm)-1;

 		int w=Integer.parseInt(wk);

 		

 		c.set(Calendar.YEAR,y);

 		c.set(Calendar.MONTH,m);

 		c.set(Calendar.WEEK_OF_MONTH,w);

 		c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);

 		return formatter.format(c.getTime());

 	}

 	

 	//특정 년,월,주 차에 일요일 구하기

 	public static String getSunday(String yyyy,String mm, String wk){

 		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy.MM.dd");

 		Calendar c = Calendar.getInstance();

 		

 		int y=Integer.parseInt(yyyy);

 		int m=Integer.parseInt(mm)-1;

 		int w=Integer.parseInt(wk);

 		

 		c.set(Calendar.YEAR,y);

 		c.set(Calendar.MONTH,m);

 		c.set(Calendar.WEEK_OF_MONTH,w);

 		c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);

 		c.add(c.DATE,7);

 		return formatter.format(c.getTime());

 	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
