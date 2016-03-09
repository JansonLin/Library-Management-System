/**
 * ѧУ������ʦ��ѧԺ
 * ѧԺ�����������ѧԺ
 * רҵ���������ѧ�뼼����������������
 * �꼶��2012��
 * ���ڣ�2014��12��30��
 * ʱ�䣺����9:12:07
 * �ļ�����BooksManage.java
 * ����������yznu.holiday.impl
 * ������Ŀ����HolidayReading
 */
package yznu.holiday.impl;

/**
 * ����ͼ��Ĳ���
 */
public interface BookInterface {
	/**
	 * ���ͼ������
	 * 
	 * @param args
	 * @return
	 */
	public int addKindsBooks(String[] args);

	/**
	 * ����ͼ������
	 * 
	 * @param args
	 * @return
	 */
	public int updateKindsbooks(String[] args);

	/**
	 * ɾ��ͼ������
	 * 
	 * @param args
	 * @return
	 */
	//public int deleteKindsbooks(String[] args);

	/**
	 * ���ͼ��
	 * 
	 * @param args
	 * @return
	 */
	public int addBooks(String[] args);

	/**
	 * ɾ��ͼ��
	 * 
	 * @param args
	 * @return
	 */
	public int deleteBooks(String[] args);

	/**
	 * ����ͼ��
	 * 
	 * @param args
	 * @return
	 */
	public int borrowBook(String[] args);

	/**
	 * �黹ͼ��
	 * 
	 * @param args
	 * @return
	 */
	public int backBook(String[] args);

	/**
	 * ����ͼ��
	 * 
	 * @param args
	 * @return
	 */
	public int renewBook(String[] args);
	/**
	 * ɾ��������е�ͼ��
	 * 
	 * @param args
	 * @return
	 */
	public int deleteNewBooks(String[] args);
	/**
	 * �����������
	 * 
	 * @param args
	 * @return
	 */
	public int addNewStocks(String[] args);
	/**
	 * ɾ��ͼ������
	 * 
	 * @param args
	 * @return
	 */
	public int delNewStocks(String[] args);

}