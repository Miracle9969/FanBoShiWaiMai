package cn.waimai.service;

import cn.waimai.pojo.UserInfo;

import java.util.List;

public interface IAddressService {
	/**
	 * �ж��Ƿ���ӳɹ�
	 * @param provice ʡ��
	 * @param city ����
	 * @param district ����
	 * @param address �����ַ������ֵ������ƺ�
	 * @return ��ӽ��
	 */
	String AddAddress(String provice,String city,String district,String address);
	/**
	 * �ж��Ƿ�ɾ���ɹ�
	 * @param provice ʡ��
	 * @param city ����
	 * @param district ����
	 * @param address �����ַ������ֵ������ƺ�
	 * @return ɾ�����
	 */
	String DelAddress(String provice,String city,String district,String address);
	/**
	 * �ж��Ƿ��޸ĳɹ�
	 * @param provice ʡ��
	 * @param city ����
	 * @param district ����
	 * @param address �����ַ������ֵ������ƺ�
	 * @return �޸Ľ��
	 */
	String AlertAddress(String provice,String city,String district,String address);
	/**
	 * ��ѯ
	 * @param provice ʡ��
	 * @param city ����
	 * @param district ����
	 * @param address �����ַ������ֵ������ƺ�
	 * @return ��ѯ�������
	 */
	 List<UserInfo> queryShop(String provice, String city, String district, String address);
}
