/**
 * ѧУ������ʦ��ѧԺ
 * ѧԺ�����������ѧԺ
 * רҵ���������ѧ�뼼����������������
 * �꼶��2012��
 * ���ڣ�2014��12��30��
 * ʱ�䣺����4:32:51
 * �ļ�����UserBean.java
 * ����������yznu.holiday.bean
 * ������Ŀ����HolidayReading
 */
package yznu.holiday.bean;

/**
 * �û���ϢJavaBean
 */
public class UserInfoBean {
	private String uname;
	private String uage;
	private String uidCard;
	private String effectivedate;
	private String utel;
	private String balance;
	private String userId;
	private String startTime;
	private String upsw;

	public UserInfoBean() {
		super();
	}

	/**
	 * @param uname
	 * @param uage
	 * @param uidCard
	 * @param effectivedate
	 * @param utel
	 * @param balance
	 * @param userId
	 * @param startTime
	 * @param upsw
	 */
	public UserInfoBean(String uname, String uage, String uidCard,
			String effectivedate, String utel, String balance, String userId,
			String startTime, String upsw) {
		super();
		this.uname = uname;
		this.uage = uage;
		this.uidCard = uidCard;
		this.effectivedate = effectivedate;
		this.utel = utel;
		this.balance = balance;
		this.userId = userId;
		this.startTime = startTime;
		this.upsw = upsw;
	}

	/**
	 * @return uname
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * @param uname
	 *            Ҫ���õ� uname
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}

	/**
	 * @return uage
	 */
	public String getUage() {
		return uage;
	}

	/**
	 * @param uage
	 *            Ҫ���õ� uage
	 */
	public void setUage(String uage) {
		this.uage = uage;
	}

	/**
	 * @return uidCard
	 */
	public String getUidCard() {
		return uidCard;
	}

	/**
	 * @param uidCard
	 *            Ҫ���õ� uidCard
	 */
	public void setUidCard(String uidCard) {
		this.uidCard = uidCard;
	}

	/**
	 * @return effectivedate
	 */
	public String getEffectivedate() {
		return effectivedate;
	}

	/**
	 * @param effectivedate
	 *            Ҫ���õ� effectivedate
	 */
	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}

	/**
	 * @return utel
	 */
	public String getUtel() {
		return utel;
	}

	/**
	 * @param utel
	 *            Ҫ���õ� utel
	 */
	public void setUtel(String utel) {
		this.utel = utel;
	}

	/**
	 * @return balance
	 */
	public String getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            Ҫ���õ� balance
	 */
	public void setBalance(String balance) {
		this.balance = balance;
	}

	/**
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            Ҫ���õ� userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            Ҫ���õ� startTime
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return upsw
	 */
	public String getUpsw() {
		return upsw;
	}

	/**
	 * @param upsw
	 *            Ҫ���õ� upsw
	 */
	public void setUpsw(String upsw) {
		this.upsw = upsw;
	}
}