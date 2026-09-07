package com.lesson.memo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lesson.memo.model.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {
	 List<Memo> findAllByOrderByPriorityAsc();
	 
	 
//	 Memo.JAVA のタイトルとコンテンツの検索
	 List<Memo> findByTitleContainingOrContentContainingOrderByPriorityAsc(String title, String content);
}