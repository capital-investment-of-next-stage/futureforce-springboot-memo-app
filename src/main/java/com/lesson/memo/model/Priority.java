package com.lesson.memo.model;

public enum Priority {
	HIGH("高"),
	MEDIUM("中"),
	LOW("低");
	
	private final String lavel;
	
	Priority(String lavel){
		this.lavel=lavel;
	}
	
	public String getLavel(){
		return lavel;
	}
}
