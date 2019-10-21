package cn.waimai.dao;

import cn.waimai.pojo.UserInfo;
import cn.waimai.pojo.User_ShopCar;

public interface IShopCarDao {
	/**
	 * �������
	 * @param food_name ʳƷ����
	 * @param shopCar_num ����
	 * @return
	 */
	int shopAdd(String food_name,int shopCar_num);
	/**
	 * ɾ������
	 * @param food_name ʳƷ����
	 * @param shopCar_num ����
	 * @return
	 */
	int delShop(String food_name,int shopCar_num);
	/**
	 * �޸�����
	 * @param food_name ʳƷ����
	 * @param shopCar_num ����
	 * @return
	 */
	int alterShop(String food_name,int shopCar_num);
	/**
	 * ��ѯ����
	 * @param food_name ʳƷ����
	 * @param shopCar_num ����
	 * @return
	 */
	User_ShopCar queryShop(int ShopCar_food_id, int shopCar_num);
	User_ShopCar queryShop(String food_name, int shopCar_num);
}

