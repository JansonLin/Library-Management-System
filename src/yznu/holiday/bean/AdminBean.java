/**
 * ѧУ������ʦ��ѧԺ
 * ѧԺ�����������ѧԺ
 * רҵ���������ѧ�뼼����������������
 * �꼶��2012��
 * ���ڣ�2014��12��30��
 * ʱ�䣺����5:21:41
 * �ļ�����AdminBean.java
 * ����������yznu.holiday.bean
 * ������Ŀ����HolidayReading
 */
package yznu.holiday.bean;

/**
 * ����Ա��ϢJavaBean
 */
public class AdminBean {
	private String aid;
	private String aname;
	private String asex;
	private String aage;
	private String aidCard;
	private String atel;
	private String alevel;
	private String apsw;

	public AdminBean() {
		super();
	}

	/**
	 * @param aid
	 * @param aname
	 * @param asex
	 * @param aage
	 * @param aidCard
	 * @param atel
	 * @param alevel
	 * @param apsw
	 */
	public AdminBean(String aid, String aname, String asex, String aage,
			String aidCard, String atel, String alevel, String apsw) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.asex = asex;
		this.aage = aage;
		this.aidCard = aidCard;
		this.atel = atel;
		this.alevel = alevel;
		this.apsw = apsw;
	}

	/**
	 * @return aid
	 */
	public String getAid() {
		return aid;
	}

	/**
	 * @param aid
	 *            Ҫ���õ� aid
	 */
	public void setAid(String aid) {
		this.aid = aid;
	}

	/**
	 * @return aname
	 */
	public String getAname() {
		return aname;
	}

	/**
	 * @param aname
	 *            Ҫ���õ� aname
	 */
	public void setAname(String aname) {
		this.aname = aname;
	}

	/**
	 * @return asex
	 */
	public String getAsex() {
		return asex;
	}

	/**
	 * @param asex
	 *            Ҫ���õ� asex
	 */
	public void setAsex(String asex) {
		this.asex = asex;
	}

	/**
	 * @return aage
	 */
	public String getAage() {
		return aage;
	}

	/**
	 * @param aage
	 *            Ҫ���õ� aage
	 */
	public void setAage(String aage) {
		this.aage = aage;
	}

	/**
	 * @return aidCard
	 */
	public String getAidCard() {
		return aidCard;
	}

	/**
	 * @param aidCard
	 *            Ҫ���õ� aidCard
	 */
	public void setAidCard(String aidCard) {
		this.aidCard = aidCard;
	}

	/**
	 * @return atel
	 */
	public String getAtel() {
		return atel;
	}

	/**
	 * @param atel
	 *            Ҫ���õ� atel
	 */
	public void setAtel(String atel) {
		this.atel = atel;
	}

	/**
	 * @return alevel
	 */
	public String getAlevel() {
		return alevel;
	}

	/**
	 * @param alevel
	 *            Ҫ���õ� alevel
	 */
	public void setAlevel(String alevel) {
		this.alevel = alevel;
	}

	/**
	 * @return apsw
	 */
	public String getApsw() {
		return apsw;
	}

	/**
	 * @param apsw
	 *            Ҫ���õ� apsw
	 */
	public void setApsw(String apsw) {
		this.apsw = apsw;
	}
}