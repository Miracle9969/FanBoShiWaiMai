package cn.waimai.dao;

import java.util.List;

import cn.waimai.pojo.FoodInfo;
import cn.waimai.pojo.ShopInfo;



public interface IFoodInfoPageDao {
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
	List<FoodInfo>getPageInfo(int index,int pageSize);
}
