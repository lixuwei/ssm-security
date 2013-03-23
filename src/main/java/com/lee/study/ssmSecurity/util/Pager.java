package com.lee.study.ssmSecurity.util;

import java.util.List;

/**
 * 分页实体
 * 
 * @author lee
 * 
 *         2013-3-13 下午11:30:08
 */
public class Pager<E> {
	/**
	 * 第几页
	 */
	private int pageIndex;
	/**
	 * 每页显示多少条记录
	 */
	private int pageSize;
	/**
	 * 分页开始的值
	 */
	private int pageOffset;
	/**
	 * 总共多少条记录
	 */
	private int totalRecord;
	/**
	 * 总共多少页
	 */
	private int totalPage;
	/**
	 * 放置具体数据的列表
	 */
	private List<E> datas;

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageOffset() {
		return pageOffset;
	}

	public void setPageOffset(int pageOffset) {
		this.pageOffset = pageOffset;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<E> getDatas() {
		return datas;
	}

	public void setDatas(List<E> datas) {
		this.datas = datas;
	}
}
