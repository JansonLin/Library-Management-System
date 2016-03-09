/**
 * ѧУ������ʦ��ѧԺ
 * ѧԺ�����������ѧԺ
 * רҵ���������ѧ�뼼����������������
 * �꼶��2012��
 * ���ڣ�2014��12��30��
 * ʱ�䣺����8:26:09
 * �ļ�����UserInterface.java
 * ����������yznu.holiday.impl
 * ������Ŀ����HolidayReading
 */
package yznu.holiday.impl;

import java.util.List;

import yznu.holiday.bean.*;

/**
 * �����û��Ĳ���
 */
public interface UserInterface {
	/**
	 * ����û�
	 * 
	 * @param args
	 * @return
	 */
	public int addUser(String[] args);

	/**
	 * ɾ���û�
	 * 
	 * @param args
	 * @return
	 */
//	public int deleteUser(String[] args);

	/**
	 * �����û���Ϣ
	 * 
	 * @param args
	 * @return
	 */
	public int updateUserInfo(String[] args);

	/**
	 * ��ȡ�û�����
	 * 
	 * @param args
	 * @return
	 */
	public UserInfoBean getUser(String[] args);

	/**
	 * ����½
	 * 
	 * @param args
	 * @return
	 */
	public UserInfoBean checkLogin(String[] args);

	/**
	 * ���г�ֵ
	 * 
	 * @param args
	 * @return
	 */
	public int rechargeUser(String[] args);

	/**
	 * �޸�����
	 * 
	 * @param args
	 * @return
	 */
	public int updatePsw(String[] args);

	/**
	 * ������Ա��¼
	 * 
	 * @param args
	 * @return
	 */
	public AdminBean checkAdminLogin(String[] args);

	/**
	 * �õ������û�
	 * 
	 * @param args
	 * @return
	 */
	public List<UserInfoBean> getAllUser(String[] args);

	/**
	 * ��Ӻ������û�
	 * 
	 * @param args
	 * @return
	 */
	public int addArrearageUser(String[] args);

	/**
	 * ����ĳһ�����û���Ϣ
	 * 
	 * @param args
	 * @return
	 */
	public BlackListBean getArrearageUser(String[] args);

	/**
	 * ɾ��ĳһ�������û�
	 * 
	 * @param args
	 * @return
	 */
	public int deleteArrearageUser(String[] args);
}