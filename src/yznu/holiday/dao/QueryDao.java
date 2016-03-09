/**
 * ѧУ������ʦ��ѧԺ
 * ѧԺ�����������ѧԺ
 * רҵ���������ѧ�뼼����������������
 * �꼶��2012��
 * ���ڣ�2014��12��30��
 * ʱ�䣺����10:00:36
 * �ļ�����QueryDao.java
 * ����������yznu.holiday.dao
 * ������Ŀ����HolidayReading
 */
package yznu.holiday.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yznu.holiday.bean.BookInfoBean;
import yznu.holiday.bean.BookTypeBean;
import yznu.holiday.bean.BorrowRecordBean;
import yznu.holiday.impl.QueryInterface;

/**
 * ���ڲ�ѯ�����ݿ����
 */
public class QueryDao extends BaseDao implements QueryInterface {

	/*
	 * ���� Javadoc�� ��ѯĳһ�û��Ľ����¼
	 * 
	 * @see
	 * yznu.holiday.impl.QueryInterface#QueryBorrowRecord(java.lang.String[])
	 */
	@Override
	public List<BorrowRecordBean> QueryBorrowRecord(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "select * from tb_borrowrecord where userISBN=? and isback=0";
		ResultSet re = super.select(sql, args);
		List<BorrowRecordBean> list = new ArrayList<BorrowRecordBean>();

		try {
			while (re.next()) {
				String recordid = re.getString("recordid");
				String bookISBN = re.getString("bookISBN");
				String userISBN = re.getString("userISBN");
				String borrowDate = re.getString("borrowDate");
				String isback = re.getString("isback");
				String backDate = re.getString("backDate");
				String arg[] = { bookISBN };
				String bookname = this.QueryBook(arg).getBookname();
				// System.out.println(bookname+"**"+recordid);
				list.add(new BorrowRecordBean(recordid, bookISBN, bookname,
						userISBN, isback, borrowDate, backDate));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see yznu.holiday.impl.QueryInterface#QueryKindsBooks(java.lang.String[])
	 */
	/**
	 * ��ѯĳһ�����ͼ��
	 */
	@Override
	public List<BookInfoBean> QueryKindsBooks(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "select ISBN,bookname,writer,translator,publisher,date,price from tb_bookinfo where typeId=?";
		ResultSet re = super.select(sql, args);
		List<BookInfoBean> list = new ArrayList<BookInfoBean>();
		try {
			while (re.next()) {
				String ISBN = re.getString("ISBN");
				String bookname = re.getString("bookname");
				String writer = re.getString("writer");
				String translator = re.getString("translator");
				String publisher = re.getString("publisher");
				String date = re.getDate("date").toString();
				String price = String.valueOf(re.getDouble("price"));
				list.add(new BookInfoBean(ISBN, args[0], bookname, writer,
						translator, publisher, date, price));
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return null;
		}
		return list;
	}

	/**
	 * ģ����ѯͼ��
	 */
	 @Override
	public List<BookInfoBean> QuerySearchBooks(String[] args, String a[]) {
		// TODO �Զ����ɵķ������
		String sql = "SELECT * from tb_bookinfo where ISBN like '%" + a[0]
				+ "%' OR typeId like '%" + a[0] + "%' OR bookname like '%"
				+ a[0] + "%'" + "or writer like '%" + a[0]
				+ "%' or publisher like '%" + a[0] + "%' or price like '%"
				+ a[0] + "%'";

		ResultSet re = super.select(sql, args);
		List<BookInfoBean> list = new ArrayList<BookInfoBean>();
		try {
			while (re.next()) {
				String ISBN = re.getString("ISBN");
				String typeId = re.getString("typeId");
				String bookname = re.getString("bookname");
				String writer = re.getString("writer");
				String translator = re.getString("translator");
				String publisher = re.getString("publisher");
				String date = re.getDate("date").toString();
				String price = String.valueOf(re.getDouble("price"));
				list.add(new BookInfoBean(ISBN, typeId, bookname, writer,
						translator, publisher, date, price));
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return null;
		}
		return list;
	}

	/*
	 * ���� Javadoc�� ��ѯһ�������ϸ��Ϣ
	 * 
	 * @see yznu.holiday.impl.QueryInterface#QueryBook(java.lang.String[])
	 */
	@Override
	public BookInfoBean QueryBook(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "select * from tb_bookinfo where ISBN=?";
		ResultSet re = super.select(sql, args);
		BookInfoBean book = new BookInfoBean();
		try {
			while (re.next()) {
				String ISBN = re.getString("ISBN");
				String bookname = re.getString("bookname");
				String writer = re.getString("writer");
				String translator = re.getString("translator");
				String publisher = re.getString("publisher");
				String date = re.getDate("date").toString();
				String price = String.valueOf(re.getDouble("price"));
				String typeId = re.getString("typeId");
				book.setBookname(bookname);
				book.setDate(date);
				book.setPrice(price);
				book.setPublisher(publisher);
				book.setWriter(writer);
				book.setTypeId(typeId);
				book.setTranslator(translator);
				book.setISBN(ISBN);

			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return null;
		}
		return book;
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see yznu.holiday.impl.QueryInterface#QueryBookStock(java.lang.String[])
	 */
	/**
	 * ��ѯ�����������������1��ISBN����
	 */
	@Override
	public int QueryBookStock(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "select amount from tb_stockpile where ISBN=?";
		ResultSet re = super.select(sql, args);
		int n = 0;
		try {
			if (re.next()) {
				n = re.getInt("amount");
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return n;
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see yznu.holiday.impl.QueryInterface#pageList(java.lang.String[])
	 */
	/**
	 * ��ҳ��ѯ�鼮��int page, int pageContent��
	 * 
	 * @param page
	 *            ��ʾ��ҳ��
	 * @param pageContent
	 *            ÿҳ������
	 */
	@Override
	public List<BookInfoBean> pageList(int page, int pageContent, String type) {
		// TODO �Զ����ɵķ������
		int startNum = (page - 1) * pageContent; // ������ʼ��¼��
		// int endNum = page * pageContent; // ������ֹ��¼��
		String sql = "select ISBN,typeId,bookname,writer,translator,publisher,date,price from tb_bookinfo where typeId=? limit ?, ?";
		Connection con = super.getConnection();
		List<BookInfoBean> bookList = null;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, type);
			pst.setInt(2, startNum);
			pst.setInt(3, pageContent);
			bookList = new ArrayList<BookInfoBean>();
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String ISBN = rs.getString("ISBN");
				String typeId = String.valueOf(rs.getInt("typeId"));
				String bookname = rs.getString("bookname");
				String writer = rs.getString("writer");
				String translator = rs.getString("translator");
				String publisher = rs.getString("publisher");
				String date = rs.getDate("date").toString();
				String price = String.valueOf(rs.getDouble("price"));
				bookList.add(new BookInfoBean(ISBN, typeId, bookname, writer,
						translator, publisher, date, price));
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return bookList;
	}

	/**
	 * ��ѯĳһ�����鼮��
	 */
	@Override
	public String queryTypeName(String[] args) {
		String sql = "select type from tb_booktype where btid=?";
		ResultSet re = super.select(sql, args);
		String n = null;
		try {
			if (re.next()) {
				n = re.getString("type");
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return n;
	}

	/**
	 * ��ѯ���������鼮��
	 */
	@Override
	public List<BookTypeBean> queryAllTypeName(String[] args) {
		String sql = "select * from tb_booktype";
		ResultSet re = super.select(sql, args);
		List<BookTypeBean> list = new ArrayList<BookTypeBean>();
		try {
			while (re.next()) {
				String typename = re.getString(2);
				String btid = re.getString(1);
				String days = re.getString(3);
				// System.out.println(btid+"zzzzz"+typename+"zzzzzzz"+days);
				BookTypeBean b = new BookTypeBean();
				b.setBtid(btid);
				b.setDays(days);
				b.setType(typename);
				list.add(b);
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * ����ĳһ�������û���� ������������1��arrearageId����
	 */
	public String QueryArrearageBalance(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select arrearageBalance from tb_blacklist where arrearageId=?";
		ResultSet re = super.select(sql, args);
		String ArrearageBalance = null;
		try {
			while (re.next()) {
				ArrearageBalance = re.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ArrearageBalance;
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see yznu.holiday.impl.QueryInterface#count(java.lang.String[])
	 */
	/**
	 * ��ѯĳһ������ĸ���������1��typeId����
	 */
	@Override
	public int count(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "select count(*) from tb_bookinfo where typeId=?";
		ResultSet rs = super.select(sql, args);
		int n = 0;
		try {
			if (rs.next()) {
				n = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return n;
	}

	/**
	 * ��ѯ������ͼ��
	 */
	@Override
	public List<BookInfoBean> QueryNewBooks(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "select * from tb_newbooks";
		ResultSet re = super.select(sql, args);
		List<BookInfoBean> list = new ArrayList<BookInfoBean>();
		try {
			while (re.next()) {
				String newISBN = re.getString("newISBN");
				String newTypeId = re.getString("newTypeId");
				String newBookName = re.getString("newBookName");
				String newWrite = re.getString("newWrite");
				String newPublisher = re.getString("newPublisher");
				String newDate = re.getDate("newDate").toString();
				String newPrice = String.valueOf(re.getDouble("newPrice"));
				list.add(new BookInfoBean(newISBN, newTypeId, newBookName, newWrite,
						"��", newPublisher, newDate, newPrice));
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return null;
		}
		return list;
	}
	/*
	 * ���� Javadoc�� ��ѯ�������һ�������ϸ��Ϣ
	 * 
	 * @see yznu.holiday.impl.QueryInterface#QueryBook(java.lang.String[])
	 */
	@Override
	public BookInfoBean QueryNewBook(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "select * from tb_newbooks where newISBN=?";
		ResultSet re = super.select(sql, args);
		BookInfoBean book = new BookInfoBean();
		try {
			while (re.next()) {
				String ISBN = re.getString("newISBN");
				String bookname = re.getString("newBookName");
				String writer = re.getString("newWrite");
				String translator = re.getString("newTranslator");
				String publisher = re.getString("newPublisher");
				String date = re.getDate("newDate").toString();
				String price = String.valueOf(re.getDouble("newPrice"));
				String typeId = re.getString("newTypeId");
				book.setBookname(bookname);
				book.setDate(date);
				book.setPrice(price);
				book.setPublisher(publisher);
				book.setWriter(writer);
				book.setTypeId(typeId);
				book.setTranslator(translator);
				book.setISBN(ISBN);

			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return null;
		}
		return book;
	}

}