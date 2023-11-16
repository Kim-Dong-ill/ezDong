package com.javateam.memberProject.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PagingVO {

	private int total;//전체 글의  수
	
	private int totalPage;//전체 페이지 개수
	
	private int startPage;//시작 페이지 번호
	
	private int currentPage;//현재 페이지 번호
	
	private int endPage;//마지막 페이지 번호
	
	private int pagingCount;//한 페이지에 나올 행의 개수
	
	private int pagesize=5;//보여줄 페이지 개수
	
	private int prePage;//이전 페이지
	
	private int nextPage;//다음 페이지
	
	
	public PagingVO(int total,   int currentPage, int pagingCount) {
		this.total = total;
		this.currentPage = currentPage;
		this.pagingCount = pagingCount;
		
		
		//전체 페이지 수
		//(전체 글의 행수-1) / 한 페이지에 나올 행의 개수 + 1
		this.totalPage = (total - 1)/pagingCount+1;
		
		
		//현재 페이지
		currentPage = (currentPage < 1)? 1:currentPage;
		this.currentPage = (currentPage < totalPage)? currentPage:totalPage;
		
		
		//시작 페이지
		//( (현재 페이지 번호 -1) / 총 페이지 사이즈 ) * 총 페이지 사이즈 + 1
		this.startPage = (currentPage - 1)/totalPage * totalPage + 1;
		
		
		//끝 페이지
		this.endPage = startPage + pagesize -1;
		this.endPage = (this.endPage > totalPage)? totalPage:this.endPage;
		
		//이전 페이지
		this.prePage = (this.currentPage-1 < 1)? 1:this.currentPage-1;
		
		//다음 페이지
		this.nextPage = (this.currentPage+1 > this.endPage)? this.endPage:this.currentPage+1;
	}
	
}//
