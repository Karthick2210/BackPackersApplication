package com.ty.backpackers.dto;

import java.util.Map;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	
	private int status;
	
	private String message;
	
	private T data;

	public void setStatus(int value) {
		// TODO Auto-generated method stub
		
	}

	public void setMessage(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setData(Map<String, String> info) {
		// TODO Auto-generated method stub
		
	}

	public void setData(String message2) {
		// TODO Auto-generated method stub
		
	}

	public void setStatus1(int value) {
		// TODO Auto-generated method stub
		
	}

}
