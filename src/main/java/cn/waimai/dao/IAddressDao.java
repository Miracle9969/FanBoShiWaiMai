package cn.waimai.dao;

import cn.waimai.pojo.UserInfo;

public interface IAddressDao {
	/**
	 * ��ӵ�ַ
	 * @param provice ����ʡ��
	 * @param city ���ڳ���
	 * @param district ��������
	 * @param address �����ַ������ֵ������ƺ�
	 * @return �޸�����
	 */
	int AddAddress(String provice,String city,String district,String address);
	/**
	 * ɾ����ַ
	 * @param provice ����ʡ��
	 * @param city ���ڳ���
	 * @param district ��������
	 * @param address �����ַ������ֵ������ƺ�
	 * @return �޸�����
	 */
	int DelAddress(String provice,String city,String district,String address);
	/**
	 * �޸ĵ�ַ
	 * @param provice ����ʡ��
	 * @param city ���ڳ���
	 * @param district ��������
	 * @param address �����ַ������ֵ������ƺ�
	 * @return �޸�����
	 */
	int AlertAddress(String provice,String city,String district,String address);
	/**
	 * ��ѯ��ַ
	 * @param provice ����ʡ��
	 * @param city ���ڳ���
	 * @param district ��������
	 * @param address �����ַ������ֵ������ƺ�
	 * @return �޸�����
	 */
	UserInfo QueryAddress(String provice,String city,String district,String address);
}
