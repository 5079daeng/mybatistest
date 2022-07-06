package co.kr.mybatis.dto;

import java.util.List;

import org.springframework.stereotype.Repository;

public class postList {
	private int totalPost;
	private int tempPage;
	private List<post> postlist;
	private int totalPage;
	private int pagePer;
	private int firstRow;
	private int endRow;

	public postList(int totalPost, int tempPage, List<post> postlist, int pagePer, int firstRow, int endRow) {
		super();
		this.totalPost = totalPost;
		this.tempPage = tempPage;
		this.postlist = postlist;
		this.pagePer = pagePer;
		this.firstRow = firstRow;
		this.endRow = endRow;
		calculatetotalPage();
	}

	private void calculatetotalPage() {
		if (totalPost == 0) {
			totalPage = 0;
		} else {
			totalPage = totalPost / pagePer;
			if (totalPost % pagePer > 0) {
				totalPage++;
			}
		}

	}

	public int getTotalPost() {
		return totalPost;
	}

	public int getTempPage() {
		return tempPage;
	}

	public List<post> getPostlist() {
		return postlist;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getFirstRow() {
		return firstRow;
	}

	public int getPagePer() {
		return pagePer;
	}

	public int getEndRow() {
		return endRow;
	}

	public boolean isEmpty() {
		return totalPost == 0;
	}

}
