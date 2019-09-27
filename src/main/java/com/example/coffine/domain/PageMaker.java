package com.example.coffine.domain;

public class PageMaker {
	private int totalCount; // 전체 게시물 갯수
	private int pageNum;//현재 페이지 번호
	private int contentNum = 10;//한 페이지에 몇개 표시할지
	private int startPage = 1;//현재 페이지 블록의 시작 페이지
	private int endPage = 5;//현재 페이지 블록의 마지막 페이지 
	private boolean prev=false;//이전 페이지로 가는 화살표
	private boolean next;//다음 페이지로 가는 화살표
	private int currentBlock;//현재 페이지 블록
	private int lastBlock;//마지막 페이지 블록
	
	// 이전 페이지 다음 페이지 
	public void prevNext(int pageNum) {
		// 페이지 번호가 0보다 크고 6보다 작을 경우
		if(pageNum > 0 && pageNum < 6) {
			setPrev(false); // 이전 페이지 X 
			setNext(true);  // 다음 페이지 O
		} // 마지막 블록과  현재 페이지 블록 같을 경우  
		else if(getLastBlock() == getCurrentBlock()) {
			setPrev(next); // 이전 페이지 O
			setNext(false);// 다음 페이지 X
		}
		else { // 나머지 경우 
			setPrev(true);
			setNext(true);
		}
	}
	
	public int calcPage(int totalCount,int contentNum) {//전체 페이지 수를 계산하는 함수
		// ex) 전체게시글 (125) / 페이지당 표시 갯수(10) => 12.5가 된다 
		// 나머지가 0보다 크기 때문에 여기에 1을 더해주면 13페이지까지 표시가 된다 
		int totalPage = totalCount / contentNum;
		if(totalCount%contentNum > 0) {
			
			totalPage++;
		}
		return totalPage;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getContentNum() {
		return contentNum;
	}
	public void setContentNum(int contentNum) {
		this.contentNum = contentNum;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int currentBlock) {
		// 현재 페이지 블록이 n일 때 *5 -4 를 적용하면 startPage가 된다  
		this.startPage = (currentBlock*5)-4;
	//1/1 2 3 4 5 
	//2/6 7 8 9 10
	//3/11 12 13	
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int getlastBlock, int getcurrentBlcok) {
		//마지막 블록 번호  == 현재 페이지 번호  ==> true
		if(getlastBlock == getcurrentBlcok) {
			//calcPage 메소드를 통해 전체 페이지 수를 구하고  endPage에 저장 
			  this.endPage = calcPage(getTotalCount(), getContentNum());
		}else {
			// 시작 페이지를 구하고 + 4 => 해당 블록 마지막 페이지 
			this.endPage = getStartPage()+4;
		}
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public int getCurrentBlock() {
		return currentBlock;
	}
	public void setCurrentBlock(int pageNum) {
		//현재 페이지블록은 페이지 번호를 통해서 구한다 
		//페이지 번호 / 페이지 그룹안의 페이지 갯수 
		// 1page 1 / 5 => 0.2  0 + 1  1 =>페이지 블록 1 
		// 0.2 소수점 결과는 타입이 int 정수형이라서 0이된다 
		// 8page  8 / 5 => 1.6 => 1 + 1 =>페이지 블록 2가 된다 
		this.currentBlock = pageNum/5;
		if(pageNum%5 > 0) {
			this.currentBlock++;
		}
	} 	
	public int getLastBlock() {
		return lastBlock;
	}
	public void setLastBlock(int lastBlock) {
		//10 , 5  = > 10 * 5 => 50 
		//125 / 50 => 2.5 
		//3
		this.lastBlock = totalCount / (5*this.contentNum);
		if(totalCount %(5*this.contentNum) > 0) {
			this.lastBlock++;
		}
	}
	@Override
	public String toString() {
		return "PageMakerDTO [totalCount=" + totalCount + ", pageNum=" + pageNum + ", contentNum=" + contentNum
				+ ", startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next
				+ ", currentBlock=" + currentBlock + ", lastBlock=" + lastBlock + "]";
	}
	
}
