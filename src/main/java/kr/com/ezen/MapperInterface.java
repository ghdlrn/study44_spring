package kr.com.ezen;

import java.util.List;

public interface MapperInterface {

	int insertMember(MemberVO vo);	//db 정보 저장
	int updateMember(MemberVO vo);	//db 정보 수정
	int deleteMember(int id);	//db 정보 삭제
	
	MemberVO selectMemberOne(int id);	//id 값 정보 불러오기
	List<MemberVO> selectMemberList();	//member테이블 리스트에 담아서 전부 가져오기
	
}