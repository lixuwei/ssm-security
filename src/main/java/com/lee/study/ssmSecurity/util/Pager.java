package com.lee.study.ssmSecurity.util;

import java.util.List;

/**
 * ��ҳʵ��
 * 
 * @author lee
 * 
 *         2013-3-13 ����11:30:08
 */
public class Pager<E> {
	/**
	 * �ڼ�ҳ
	 */
	private int pageIndex;
	/**
	 * ÿҳ��ʾ��������¼
	 */
	private int pageSize;
	/**
	 * ��ҳ��ʼ��ֵ
	 */
	private int pageOffset;
	/**
	 * �ܹ���������¼
	 */
	private int totalRecord;
	/**
	 * �ܹ�����ҳ
	 */
	private int totalPage;
	/**
	 * ���þ������ݵ��б�
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
