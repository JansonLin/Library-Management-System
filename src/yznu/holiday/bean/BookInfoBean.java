/**
 * ѧУ������ʦ��ѧԺ
 * ѧԺ�����������ѧԺ
 * רҵ���������ѧ�뼼����������������
 * �꼶��2012��
 * ���ڣ�2014��12��30��
 * ʱ�䣺����4:09:14
 * �ļ�����Book.java
 * ����������yznu.holiday.bean
 * ������Ŀ����HolidayReading
 */
package yznu.holiday.bean;

/**
 * ͼ����ϢJavaBean
 */
public class BookInfoBean {
	/**
	 * ͼ����
	 */
	private String ISBN;
	/**
	 * ͼ�����
	 */
	private String typeId;
	/**
	 * ͼ������
	 */
	private String bookname;
	/**
	 * ����
	 */
	private String writer;
	/**
	 * ����
	 */
	private String translator;
	/**
	 * ������
	 */
	private String publisher;
	/**
	 * ��������
	 */
	private String date;
	/**
	 * ͼ��۸�
	 */
	private String price;

	/**
	 * 
	 */
	public BookInfoBean() {
		super();
	}

	/**
	 * @param iSBN
	 * @param typeId
	 * @param bookname
	 * @param writer
	 * @param translator
	 * @param publisher
	 * @param date
	 * @param price
	 */
	public BookInfoBean(String ISBN, String typeId, String bookname,
			String writer, String translator, String publisher, String date,
			String price) {
		super();
		this.ISBN = ISBN;
		this.typeId = typeId;
		this.bookname = bookname;
		this.writer = writer;
		this.translator = translator;
		this.publisher = publisher;
		this.date = date;
		this.price = price;
	}

	/**
	 * @return iSBN
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * @param iSBN
	 *            Ҫ���õ� iSBN
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	/**
	 * @return typeId
	 */
	public String getTypeId() {
		return typeId;
	}

	/**
	 * @param typeId
	 *            Ҫ���õ� typeId
	 */
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	/**
	 * @return bookname
	 */
	public String getBookname() {
		return bookname;
	}

	/**
	 * @param bookname
	 *            Ҫ���õ� bookname
	 */
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	/**
	 * @return writer
	 */
	public String getWriter() {
		return writer;
	}

	/**
	 * @param writer
	 *            Ҫ���õ� writer
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}

	/**
	 * @return translator
	 */
	public String getTranslator() {
		return translator;
	}

	/**
	 * @param translator
	 *            Ҫ���õ� translator
	 */
	public void setTranslator(String translator) {
		this.translator = translator;
	}

	/**
	 * @return publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher
	 *            Ҫ���õ� publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date
	 *            Ҫ���õ� date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            Ҫ���õ� price
	 */
	public void setPrice(String price) {
		this.price = price;
	}
}