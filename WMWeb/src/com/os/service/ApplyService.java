package com.os.service;

import java.util.List;

import com.os.domain.Apply;
import com.os.domain.PageBean;

public interface ApplyService {

	//�����ŵ�
	void addApply(Apply apply);

	//ͳ����������
	int countBystatus();

	//��ȡ�����б�
	List<Apply> pageOfApply(PageBean page);

	//����ID������������
	Apply findApplyById(Apply apply);


	//������˵��̼���Ϣ
	void updatePassInfo(Apply apply);

	//������˲�ͨ�����̼���Ϣ
	void updateFailInfo(Apply apply);

	//ͳ�����л�Ծ�̼�����(statusΪ1��
	int countBystatus1();

	//ͳ��״̬Ϊ1���̼�
	List<Apply> pageOfApply1(PageBean page);


}
