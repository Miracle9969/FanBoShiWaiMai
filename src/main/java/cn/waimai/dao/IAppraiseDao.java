package cn.waimai.dao;

import cn.waimai.pojo.User_Comment;

public interface IAppraiseDao {
	//���
	int addAppraise(int comment_user_id,int comment_shop_id,String comment_content);
	//ɾ��
	int delAppraise(int comment_user_id,int comment_shop_id,String comment_content);
	//�޸�
	int alertAppraise(int comment_user_id,int comment_shop_id,String comment_content);
	//��ѯ
	User_Comment queryAppraise(int comment_user_id,int comment_shop_id,String comment_content);
}
