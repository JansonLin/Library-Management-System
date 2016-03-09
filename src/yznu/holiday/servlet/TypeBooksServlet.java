package yznu.holiday.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import yznu.holiday.bean.BookInfoBean;
import yznu.holiday.bean.UserInfoBean;
import yznu.holiday.dao.QueryDao;
import yznu.holiday.dao.UserDao;

public class TypeBooksServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		// String pathadd = request.getContextPath();
		HttpSession session = request.getSession();
		// PrintWriter out = response.getWriter();
		// String userid =
		// ((UserInfoBean)(session.getAttribute("user"))).getUserId();
		String type = request.getParameter("type");
		System.out.println("aaaaa" + type);
		if (session.getAttribute("type") == null && type != null) {
			session.setAttribute("type", type);
		} else if (session.getAttribute("type") != null && type == null) {
			type = (String) session.getAttribute("type");
			// System.out.println("֪��ִ��");
		} else if (session.getAttribute("type") != null && type != null) {
			type = request.getParameter("type");// ȡ��ͼ��������
			session.setAttribute("type", type);
		}
		// System.out.println(session.getAttribute("type")+"**/*/*/*//");
		// System.out.println(type+"++++++++++++");
		// System.out.println(type);
		QueryDao qd = new QueryDao();
		String[] args = { type };
		String typename = qd.queryTypeName(args);
		request.setAttribute("typename", typename);
		List<BookInfoBean> list = null;
		/**********************************************/
		String page = request.getParameter("page"); // ��ҳ����Ҫ��ʾ��ҳ��
		int pageNum = 1; // ��ʾ�ڼ�ҳ
		int pageTotal = 0; // ��ҳ��
		int pageContent = 3; // ÿҳ��ʾ��¼����
		int count = 0; // ���ݿ��ܼ�¼��
		try {
			count = qd.count(args); // ͨ��ģ����ķ���������ݿ��¼����
			System.out.println(count + "���ݿ��ܼ�¼��");
			if (count > 0) {
				pageTotal = count / pageContent; // ����ҳ��
				if (pageTotal * pageContent != count) { // ��������
					pageTotal = pageTotal + 1;
				}
			}
			if (page != null) { // �����õ���ʾҳ��ֵ��Ϊ��
				pageNum = Integer.parseInt(page); // ���������͵�ת��
			}
			list = qd.pageList(pageNum, pageContent, type); // ����ģ�ͣ����з�ҳ��ѯ�����ط�ҳ��ʾ������
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println("*********"+pageTotal);
		// System.out.println("*********"+list);
		request.setAttribute("choosebooks", list);
		request.setAttribute("pageTotal", pageTotal);
		request.getRequestDispatcher("bookdetail.jsp").forward(request,
				response);
	}
}