<%@page import="org.json.simple.JSONArray"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JSONObject jobject1 = new JSONObject();
	jobject1.put("id","root");
	jobject1.put("pw","1234");
	jobject1.put("name","kim");
	jobject1.put("tel","011");
	
	//out.println(jobject1.toJSONString());

	
	JSONObject jobject2 = new JSONObject();
	jobject2.put("id","admin");
	jobject2.put("pw","5678");
	jobject2.put("name","hong");
	jobject2.put("tel","010");
	

	JSONArray array = new JSONArray();	
	array.add(jobject1);
	array.add(jobject2);
	
	//out.println(array.toJSONString());
	

	JSONObject main =  new JSONObject();
	main.put("array",array); 
	
	out.println(array.toJSONString());
	
	
	
%>