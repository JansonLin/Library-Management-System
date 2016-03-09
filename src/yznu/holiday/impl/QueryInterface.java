/**
 * ѧУ������ʦ��ѧԺ
 * ѧԺ�����������ѧԺ
 * רҵ���������ѧ�뼼����������������
 * �꼶��2012��
 * ���ڣ�2014��12��30��
 * ʱ�䣺����8:31:48
 * �ļ�����UtilInterface.java
 * ����������yznu.holiday.impl
 * ������Ŀ����HolidayReading
 */
package yznu.holiday.impl;

import java.util.List;

import yznu.holiday.bean.BookInfoBean;
import yznu.holiday.bean.BookTypeBean;
import yznu.holiday.bean.BorrowRecordBean;

/**
 * ���ڲ�ѯ�Ĳ���
 */
public interface QueryInterface {
	/**
	 * ��ѯ���ļ�¼
	 * 
	 * @return
	 */
	public List<BorrowRecordBean> QueryBorrowRecord(String[] args);

	/**
	 * ��ѯ�鼮����
	 * 
	 * @param typeId
	 * @return
	 */
	public List<BookInfoBean> QueryKindsBooks(String[] args);

	/**
	 * ��ѯĳһ���鼮
	 * 
	 * @param ISBN
	 * @return
	 */
	public BookInfoBean QueryBook(String[] args);

	/**
	 * ��ѯ�����
	 */
	public int QueryBookStock(String[] args);

	/**
	 * ��ҳ��ѯ
	 * 
	 * @param args
	 * @return
	 */
	public List<BookInfoBean> pageList(int page, int pageContent, String type);

	/**
	 * 
	 * ��ѯĳһͼ����������
	 */
	public String queryTypeName(String[] args);

	/**
	 * 
	 * ��ѯ����ͼ����������
	 * 
	 */
	public List<BookTypeBean> queryAllTypeName(String[] args);

	/**
	 * 
	 * ģ����ѯͼ��
	 * 
	 */
	public List<BookInfoBean> QuerySearchBooks(String[] args, String a[]);

	/**
	 * ��ѯĳһ������ĸ���
	 */
	public int count(String[] args);
	
	/**
	 * ��ѯ���е�����
	 */
	public List<BookInfoBean> QueryNewBooks(String[] args);
	
	/**
	 * ��ѯĳһ������
	 */
	public BookInfoBean QueryNewBook(String[] args);

}