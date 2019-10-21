package cn.waimai.service.impl;

import java.util.List;

import cn.waimai.dao.impl.AddressDaoImpl;
import cn.waimai.pojo.UserInfo;
import cn.waimai.service.IAddressService;

public class AddressServiceImpl implements IAddressService{
	@Override
	public String AddAddress(String provice, String city, String district, String address) {
		AddressDaoImpl ad= new AddressDaoImpl();
		int count = ad.AddAddress(provice, city, district, address);
		if(count > 0){
			return "��ӳɹ�";
		}else{
			return "���ʧ��";
		}
	}

	@Override
	public String DelAddress(String provice, String city, String district, String address) {
		AddressDaoImpl ad= new AddressDaoImpl();
		int count = ad.DelAddress(provice, city, district, address);
		if(count > 0){
			return "ɾ���ɹ�";
		}else{
			return "ɾ��ʧ��";
		}
	}

	@Override
	public String AlertAddress(String provice, String city, String district, String address) {
		AddressDaoImpl ad= new AddressDaoImpl();
		int count = ad.AlertAddress(provice, city, district, address);
		if(count > 0){
			return "�޸ĳɹ�";
		}else{
			return "�޸�ʧ��";
		}
	}

	@Override
	public List<UserInfo> queryShop(String provice, String city, String district, String address) {
		return null;
	}


}
