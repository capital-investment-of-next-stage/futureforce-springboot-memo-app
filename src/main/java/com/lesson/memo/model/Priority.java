package com.lesson.memo.model;

public enum Priority {
	HIGH(0),
	MEDIUM(1),
	LOW(2);
	
	private final int order;
	
	Priority(int order)  {
		this.order = order;
	}
	
	public int getOrder() {
		return order;
	}

}

