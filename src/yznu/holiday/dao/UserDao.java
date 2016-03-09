/**
 * ѧУ������ʦ��ѧԺ
 * ѧԺ�����������ѧԺ
 * רҵ���������ѧ�뼼����������������
 * �꼶��2012��
 * ���ڣ�2014��12��30��
 * ʱ�䣺����9:15:40
 * �ļ�����UserDao.java
 * ����������yznu.holiday.dao
 * ������Ŀ����HolidayReading
 */
package yznu.holiday.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yznu.holiday.bean.AdminBean;
import yznu.holiday.bean.*;
import yznu.holiday.impl.UserInterface;

/**
 * �����û������ݿ����
 */
public class UserDao extends BaseDao implements UserInterface {
	/*
	 * ���� Javadoc��
	 * 
	 * @see yznu.holiday.impl.UserInterface#addUser(java.lang.String[])
	 */
	/**
	 * ����û�������������6��Uname��Uage��UidCard��Utel��UserId��Upsw����
	 */
	@Override
	public int addUser(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "insert into tb_user (Uname, Uage, UidCard, effectivedate, Utel, balance, UserId,starttime,Upsw) values (?,?,?,'"
				+ super.getAfterDate() + "',?,0,?,'" + super.getDate() + "',?)";
		return super.update(sql, args);
	}

	/**
	 * ��Ӻ������û�������������3��Uname��UidCard��UserId����
	 */
	@Override
	public int addArrearageUser(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "insert into tb_blacklist (arrearageName, arrearageId, arrearageIdCard,arrearageBalance) values (?,?,?,?)";
		return super.update(sql, args);
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see yznu.holiday.impl.UserInterface#deleteUser(java.lang.String[])
	 */
	/**
	 * ɾ���û�������������1��UserId����
	 */
	/*
	@Override
	public int deleteUser(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "delete from tb_user where UserId=?";
		return super.update(sql, args);
	}
    */
	/*
	 * ���� Javadoc��
	 * 
	 * @see yznu.holiday.impl.UserInterface#updateUserInfo(java.lang.String[])
	 */
	/**
	 * �����û���Ϣ������������3��Uname��Utel��UserId����
	 */
	@Override
	public int updateUserInfo(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "update tb_user set Uname=?,Utel=? where UserId=?";
		return super.update(sql, args);
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see yznu.holiday.impl.UserInterface#getUser(java.lang.String[])
	 */
	/**
	 * ����Userid��ȡ�û���Ϣ������������1��UserId����
	 */
	@Override
	public UserInfoBean getUser(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "select Uname,Uage,UidCard,effectivedate,Utel,balance,startTime,Upsw from tb_user where UserId=?";
		ResultSet rs = super.select(sql, args);
		UserInfoBean uib = null;
		try {
			if (rs.next()) {
				String uname = rs.getString("Uname");
				String uage = String.valueOf(rs.getInt("Uage"));
				String uidCard = rs.getString("UidCard");
				String effectivedate = rs.getDate("effectivedate").toString();
				String utel = rs.getString("Utel");
				String balance = String.valueOf(rs.getFloat("balance"));
				String startTime = rs.getDate("startTime").toString();
				String upsw = rs.getString("Upsw");
				uib = new UserInfoBean(uname, uage, uidCard, effectivedate,
						utel, balance, args[0], startTime, upsw);
				return uib;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return uib;
		}
		return uib;
	}

	/*
	 * ���� Javadoc��
	 * 
	 * @see yznu.holiday.impl.UserInterface#checkLogin(java.lang.String[])
	 */
	/**
	 * �����ͨ�û���½������������2��UserId��Upsw����
	 */
	@Override
	public UserInfoBean checkLogin(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "select Uname,Uage,UidCard,effectivedate,Utel,balance,starttime from tb_user where UserId=? and Upsw=?";
		ResultSet rs = super.select(sql, args);
		UserInfoBean uib = null;
		try {
			if (rs.next()) {
				String uname = rs.getString("Uname");
				String uage = String.valueOf(rs.getInt("Uage"));
				String uidCard = rs.getString("UidCard");
				String effectivedate = rs.getDate("effectivedate").toString();
				String utel = rs.getString("Utel");
				String balance = String.valueOf(rs.getFloat("balance"));
				String startTime = rs.getDate("startTime").toString();
				uib = new UserInfoBean(uname, uage, uidCard, effectivedate,
						utel, balance, args[0], startTime, args[1]);
				return uib;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return uib;
		}
		return uib;
	}

	/**
	 * ������Ա��½������������2��AId��Apsw����
	 */
	@Override
	public AdminBean checkAdminLogin(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "select Aname,Asex,Aage,AidCard,Atel,Alevel from tb_admin where Aid=? and Apsw=?";
		ResultSet rs = super.select(sql, args);
		AdminBean ab = null;
		try {
			if (rs.next()) {
				String Aname = rs.getString("Aname");
				String Asex = rs.getString("Asex");
				String Aage = rs.getString("Aage");
				String AidCard = rs.getString("AidCard");
				String Atel = rs.getString("Atel");
				String Alevel = rs.getString("Alevel");
				ab = new AdminBean(args[0], Aname, Asex, Aage, AidCard, Atel,
						Alevel, args[1]);
				return ab;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return null;
		}
		return ab;
	}
   
	/**
	 * ���г�ֵ������������2��UserId����ֵ��Ŀ����
	 */ 
	@Override
	public int rechargeUser(String[] args) {
		// TODO Auto-generated method stub
		String sql = "update tb_user set balance=balance+? where UserId=?";
		return super.update(sql, args);
	}
    
	/**
	 * �޸����루����������2��UserId�������롿��
	 */
	@Override
	public int updatePsw(String[] args) {
		// TODO Auto-generated method stub
		String sql = "update tb_user set Upsw=? where UserId=?";
		return super.update(sql, args);
	}

	/**
	 * �õ����е��û���Ϣ
	 */
	@Override
	public List<UserInfoBean> getAllUser(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select Uname,Uage,UidCard,effectivedate,Utel,balance,UserId,startTime,Upsw from tb_user";
		ResultSet rs = super.select(sql, args);
		List<UserInfoBean> uib = new ArrayList<UserInfoBean>();
		try {
			while (rs.next()) {
				String uname = rs.getString("Uname");
				String uage = String.valueOf(rs.getInt("Uage"));
				String uidCard = rs.getString("UidCard");
				String effectivedate = rs.getDate("effectivedate").toString();
				String utel = rs.getString("Utel");
				String balance = String.valueOf(rs.getFloat("balance"));
				String startTime = rs.getDate("startTime").toString();
				String upsw = rs.getString("Upsw");
				String UserId = rs.getString("UserId");
				uib.add(new UserInfoBean(uname, uage, uidCard, effectivedate,
						utel, balance, UserId, startTime, upsw));
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return uib;
	}

	/**
	 * ��ȡĳһ�������û���Ϣ������������1��arrearageId����
	 */
	@Override
	public BlackListBean getArrearageUser(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "select arrearageName,arrearageIdCard,arrearageBalance from tb_blacklist where arrearageId=?";
		ResultSet rs = super.select(sql, args);
		BlackListBean uib = null;
		try {
			if (rs.next()) {
				String arrearageName = rs.getString("arrearageName");
				String arrearageIdCard = rs.getString("arrearageIdCard");
				String arrearageBalance = rs.getString("arrearageBalance");
				uib = new BlackListBean(arrearageName, args[0],
						arrearageIdCard, arrearageBalance);
				return uib;
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return uib;
		}
		return uib;
	}

	/**
	 * ɾ���������û�������������1��arrearageId����
	 */
	@Override
	public int deleteArrearageUser(String[] args) {
		// TODO �Զ����ɵķ������
		String sql = "delete from tb_blacklist where arrearageId=?";
		return super.update(sql, args);
	}

	/**
	 * ��ֵ����ĺ�������� ������������1��arrearageId����
	 */
	public int rechargeArrearageUser(String[] args) {
		// TODO Auto-generated method stub
		String sql = "update tb_blacklist set arrearageBalance=arrearageBalance+? where arrearageId=?";
		return super.update(sql, args);
	}
}