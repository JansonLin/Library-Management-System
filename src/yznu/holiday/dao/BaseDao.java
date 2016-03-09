package yznu.holiday.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ��װ��������ݿ�����ɾ���ģ������
 */
public class BaseDao {
	private String driver = "";
	private String url = "";
	private String user = "";
	private String password = "";
	private static int time = 2;
	private static int day = 30;

	public BaseDao() {
		driver = PropertiesUtil.get("driver");
		url = PropertiesUtil.get("url");
		user = PropertiesUtil.get("user");
		password = PropertiesUtil.get("password");
	}

	public final Connection getConnection() {
		try {
			Class.forName(driver);// ��̬����һ���ⲿ��class�ļ�
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * ͳһ����ɾ���ķ���
	 * 
	 * @param sql
	 *            Ԥ�����SQL���
	 * @param args
	 *            ռλ����?����Ӧ�Ĳ����б�
	 * @return
	 */
	public int update(String sql, String[] args) {
		try {
			PreparedStatement pstmt = getConnection().prepareStatement(sql);
			// System.out.println(args[0]+"**&&&**"+args[1]);
			if (args != null && args.length > 0) {
				for (int i = 0; i < args.length; i++) {// ͨ��ѭ�����ò���
					pstmt.setString(i + 1, args[i]);
				}
			}
			int result = pstmt.executeUpdate();
			pstmt.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 * ͳһ��ѯ����
	 * 
	 * @param sql
	 * @param args
	 * @return
	 */
	public ResultSet select(String sql, String[] args) {
		try {
			PreparedStatement pstmt = getConnection().prepareStatement(sql);
			if (args != null && args.length > 0) {
				for (int i = 0; i < args.length; i++) {// ͨ��ѭ�����ò���
					pstmt.setString(i + 1, args[i]);
				}
			}
			ResultSet result = pstmt.executeQuery();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * ��ȡ��ǰָ����ʽ������
	 * 
	 * @return
	 */
	public String getDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString()
				.trim();
	}

	/**
	 * ��ȡ2���ָ����ʽ������
	 * 
	 * @return
	 */
	public String getAfterDate() {
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		gc.setTime(new Date());
		gc.add(1, time);
		return sf.format(gc.getTime());
	}

	/**
	 * ��ȡ30���ָ����ʽ������
	 * 
	 * @return
	 */
	public String getAfter30Date() {
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		gc.setTime(new Date());
		gc.add(5, day);
		return sf.format(gc.getTime());
	}

	/**
	 * @return day
	 */
	public static int getDay() {
		return day;
	}

	/**
	 * @param day
	 *            Ҫ���õ� day
	 */
	public static void setDay(int day) {
		BaseDao.day = day;
	}
}