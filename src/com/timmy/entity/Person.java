package com.timmy.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	
	private String []arr;
	private List<String>list;
	private Map<String, String>map;
	private Properties properties;
	
	public String[] getArr() {
		return arr;
	}
	public void setArr(String[] arr) {
		this.arr = arr;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public void testArr()
	{
		for(String str:arr)
		{
			System.out.println(str);
		}
	}
	public void testlist()
	{
		for(String str:list)
		{
			System.out.println(str);
		}
	}
	public void testmap()
	{
		Set<String>key=map.keySet();
		for(String str:key)
		{
			System.out.println(map.get(str));
		}
		//System.out.println(map);
	}
	public void testproperties()
	{
		Set<Object> keys = properties.keySet();//返回属性key的集合  
	    for (Object key : keys) {  
	        System.out.println(key.toString() + "=" + properties.get(key));  
	    }  
		
	}
	
	
	

}
