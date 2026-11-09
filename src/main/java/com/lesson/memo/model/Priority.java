package com.lesson.memo.model;

import lombok.Getter;

@Getter
public enum Priority {
	
	HIGH("高"),
	MEDIUM("中"), 
	LOW("低");

	private String label;
	
	Priority(String label) {
        this.label = label;
    }
	
}




