package yznu.holiday.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * �����ļ���ȡ������ģʽ,����ֻ�ṩ������̬����
 */
public final class PropertiesUtil {

	private static PropertiesUtil util = null;
	private Properties prop = new Properties(); // �����ļ���ȡ��

	/**
	 * ˽�л��˹��췽�����������ⲿ����
	 */
	private PropertiesUtil() {
		try {
			load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void load() throws IOException {
		// ʹ��8λ���ֽ�����ȡ�����ļ�
		// InputStream is = new FileInputStream("dbconfig.properties");
		// ͨ�����λ�ö�λ�ļ�
		InputStream is = this.getClass().getResourceAsStream(
				"dbconfig.properties");
		prop.load(is);
	}

	/**
	 * ��ȡ����Ӧ��ֵ
	 * 
	 * @param key
	 * @return
	 */
	public static String get(String key) {
		if (util == null)
			util = new PropertiesUtil();
		return util.prop.getProperty(key);
	}
}