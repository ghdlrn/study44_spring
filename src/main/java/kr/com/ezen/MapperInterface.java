package kr.com.ezen;

import java.util.List;

public interface MapperInterface {

	int insertMember(MemberVO vo);	//db ���� ����
	int updateMember(MemberVO vo);	//db ���� ����
	int deleteMember(int id);	//db ���� ����
	
	MemberVO selectMemberOne(int id);	//id �� ���� �ҷ�����
	List<MemberVO> selectMemberList();	//member���̺� ����Ʈ�� ��Ƽ� ���� ��������
	
}