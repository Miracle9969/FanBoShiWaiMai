package cn.waimai.test;

import java.sql.Connection;

import cn.waimai.dao.BaseDao;
import cn.waimai.dao.impl.ShopCarDaoImpl;
import cn.waimai.pojo.User_ShopCar;

public class Test {
	public static void main(String[] args) {
		Connection conn = BaseDao.getConn();
		ShopCarDaoImpl scd = new ShopCarDaoImpl();
		User_ShopCar qs = scd.queryShop("��Ƥ", 3);
		if(qs != null){
			System.out.println("��ѯ�ɹ�");
		}else{
			System.out.println("��ѯʧ��");
		}
	}
}
