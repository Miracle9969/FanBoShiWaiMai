package cn.waimai.dao;

import java.util.List;

import cn.waimai.pojo.ShopInfo;



public interface IShopInfoPageDao {
	/**
	 * �ܼ�¼��
	 * @return �ܼ�¼��
	 */
	int getCount();
	/**
	 * ���ÿҳ��Ϣ�ļ���
	 * @param index ҳ��
	 * @param pageSize ÿҳ��ʾ����Ϣ��
	 * @return ÿҳ����Ϣ����
	 */
	List<ShopInfo>getPageInfo(int index,int pageSize);
}
