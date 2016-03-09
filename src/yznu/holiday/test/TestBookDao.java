package yznu.holiday.test;

import static org.junit.Assert.*;

import org.junit.Test;

import yznu.holiday.dao.BookDao;

public class TestBookDao {
	BookDao bd=new BookDao();

	@Test
	public void testUpdateKindsbooks() {
		String args[]={"����","1001"};
		int n=bd.updateKindsbooks(args);
		assertEquals(n==1, true);//�����ӽ���������Ϊ����
	}

	@Test
	public void testAddBooks() {
		String args[]={"1234567891012","1003","׷���ݵ���","����","��","�������ճ�����","2015-09-01","25.5"};
		int n=bd.addBooks(args);
		assertEquals(n==1, true);//���ӡ�׷���ݵ��ˡ���С˵��
	}

	@Test
	public void testDeleteBooks() {
		String args[]={"9787071111111"};
		int n=bd.deleteBooks(args);
		assertEquals(n==1, true);//ɾ�����9787071111111�������������ҵļ�ֵ�ۡ�
	}

	@Test
	public void testBorrowBook() {
		String args[]={"9787108032911","12345678"};
		int n=bd.borrowBook(args);
		assertEquals(n==1, true);//�û�12345678���ı��9787108032911��ѧ��������Ŀ�͡�
	}

	@Test
	public void testBackBook() {
		String args[]={"9787210060161","12345678"};
		int n=bd.backBook(args);
		assertEquals(n==1, true);//�û�12345678�黹���9787210060161��ѧ�ڽ���ͼ�顶�ܶϽ�ա�
	}

	@Test
	public void testRenewBook() {
		String args[]={"9787506376372","12345678"};
		int n=bd.renewBook(args);
		assertEquals(n==1, true);//�û�12345678������9787506376372С˵��ͼ�顶��ƽ��ս�¡�
	}

	@Test
	public void testDeleteNewBooks() {
		String args[]={"9787505729230"};
		int n=bd.deleteNewBooks(args);
		assertEquals(n==1, true);//ɾ������ͼ���С�һ�ж�����õİ��š�
	}

	@Test
	public void testAddNewStocks() {
		String args[]={"9787505729230"};
		int n=bd.addNewStocks(args);
		assertEquals(n==1, true);//���ӡ�һ�ж�����õİ��š��Ŀ����Ϊ5
	}

}
