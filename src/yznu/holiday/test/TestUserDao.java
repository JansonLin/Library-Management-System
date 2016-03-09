package yznu.holiday.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import yznu.holiday.bean.AdminBean;
import yznu.holiday.bean.BlackListBean;
import yznu.holiday.bean.UserInfoBean;
import yznu.holiday.dao.UserDao;

public class TestUserDao {
	private UserDao ud=new UserDao();

	@Test
	public void testAddUser() {//������û�С��
		String args[]={"С��","20","500383199404081024","13845321678","11111111","11"};
		int n = ud.addUser(args);
		assertEquals(n==1,true);
	}

	@Test
	public void testCheckLogin() {//�ж��Ƿ����û��캢��
		String args[]={"03847230","1"};
		UserInfoBean ui = ud.checkLogin(args);
		assertEquals(ui!=null,true);
	}
	
	@Test
	public void testGetUser() {//��ȡ�û�С��
		String args[]={"11111111"};
		UserInfoBean ui = ud.getUser(args);
		assertEquals(ui!=null,true);
	}
	
	@Test
	public void testRechargeUser() {//�û�С����ֵ100
		String args[]={"100","11111111"};
		int n = ud.rechargeUser(args);
		assertEquals(n==1,true);
	}
	
	@Test
	public void testUpdateUserInfo() {//�����û�С���ĵ绰Ϊ15034256780
		String args[]={"С��","15034256780","11111111"};
		int n = ud.updateUserInfo(args);
		assertEquals(n==1,true);
	}
	
	@Test
	public void testUpdatePsw() {//�û�С��������Ϊ888
		String args[]={"888","11111111"};
		int n = ud.updatePsw(args);
		assertEquals(n==1,true);
	}

	@Test
	public void testCheckAdminLogin() {//�ж��Ƿ��й���Աadmin
		String args[]={"admin","admin"};
		AdminBean ab = ud.checkAdminLogin(args);
		assertEquals(ab!=null,true);
	}

	@Test
	public void testGetAllUser() {//��ȡ�����û�
		String args[]={};
		List<UserInfoBean> list = ud.getAllUser(args);
		assertEquals(list!=null,true);
	}

	@Test
	public void testAddArrearageUser() {//����û�С�������
		String args[]={"С��","22222222","500392199403080023","-10"};
		int n = ud.addArrearageUser(args);
		assertEquals(n==1,true);
	}

	@Test
	public void testGetArrearageUser() {//��ȡ�������е��û�̫�׽���
		String args[]={"12345678"};
		BlackListBean blb = ud.getArrearageUser(args);
		assertEquals(blb!=null,true);
	}

	@Test
		public void testRechargeArrearageUser() {//�������е��û�̫�׽��ǳ�ֵ100
			String args[]={"100","12345678"};
			int n = ud.rechargeArrearageUser(args);
			assertEquals(n==1,true);
		}
	
	@Test
	public void testDeleteArrearageUser() {//ɾ���������е��û�̫�׽���
		String args[]={"12345678"};
		int n = ud.deleteArrearageUser(args);
		assertEquals(n==1,true);
	}
}
