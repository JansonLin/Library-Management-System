/**
 * ѧУ������ʦ��ѧԺ
 * ѧԺ�����������ѧԺ
 * רҵ���������ѧ�뼼����������������
 * �꼶��2012��
 * ���ڣ�2014��12��30��
 * ʱ�䣺����6:57:20
 * �ļ�����BorrowRecord.java
 * ����������yznu.holiday.bean
 * ������Ŀ����HolidayReading
 */
package yznu.holiday.bean;

/**
 * ���ļ�¼JavaBean
 */
public class BorrowRecordBean {
	private String recordid;
	private String bookISBN;
	private String userISBN;
	private String isback;
	private String borrowDate;
	private String backDate;
	private String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public BorrowRecordBean() {
		super();
	}

	/**
	 * @param recordid
	 * @param bookISBN
	 * @param adminId
	 * @param userISBN
	 * @param isback
	 * @param borrowDate
	 * @param backDate
	 */
	public BorrowRecordBean(String recordid, String bookISBN, String bookName,
			String userISBN, String isback, String borrowDate, String backDate) {
		super();
		this.recordid = recordid;
		this.bookISBN = bookISBN;
		this.bookName = bookName;
		this.userISBN = userISBN;
		this.isback = isback;
		this.borrowDate = borrowDate;
		this.backDate = backDate;
	}

	/**
	 * @return recordid
	 */
	public String getRecordid() {
		return recordid;
	}

	/**
	 * @param recordid
	 *            Ҫ���õ� recordid
	 */
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}

	/**
	 * @return bookISBN
	 */
	public String getBookISBN() {
		return bookISBN;
	}

	/**
	 * @param bookISBN
	 *            Ҫ���õ� bookISBN
	 */
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	/**
	 * @return userISBN
	 */
	public String getUserISBN() {
		return userISBN;
	}

	/**
	 * @param userISBN
	 *            Ҫ���õ� userISBN
	 */
	public void setUserISBN(String userISBN) {
		this.userISBN = userISBN;
	}

	/**
	 * @return isback
	 */
	public String getIsback() {
		return isback;
	}

	/**
	 * @param isback
	 *            Ҫ���õ� isback
	 */
	public void setIsback(String isback) {
		this.isback = isback;
	}

	/**
	 * @return borrowDate
	 */
	public String getBorrowDate() {
		return borrowDate;
	}

	/**
	 * @param borrowDate
	 *            Ҫ���õ� borrowDate
	 */
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}

	/**
	 * @return backDate
	 */
	public String getBackDate() {
		return backDate;
	}

	/**
	 * @param backDate
	 *            Ҫ���õ� backDate
	 */
	public void setBackDate(String backDate) {
		this.backDate = backDate;
	}
}