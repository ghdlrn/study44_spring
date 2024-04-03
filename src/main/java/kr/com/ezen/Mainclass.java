package kr.com.ezen;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Mainclass {

	public static void main(String[] args) {
		
		try {
			String resource = "kr/com/ezen/mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session = sqlSessionFactory.openSession(true);
			MapperInterface mapper = session.getMapper(MapperInterface.class);
			
			System.out.println(session);
			
			MemberVO vo = new MemberVO();
			vo.setId(5);
			vo.setName("��");
			vo.setPhone("010-3333-9999");
			vo.setAddress("����� ������");
			
//			mapper.deleteMember(1);	//����
			
//			mapper.updateMember(vo);	//����
//			
//			int result = mapper.insertMember(vo);		//�߰�
//			System.out.println("�����̸� " + result);
			
//			vo = mapper.selectMemberOne(1);	//id ���� ����� ���̺� �˻�
//			System.out.println(vo);
			
			List<MemberVO> list = mapper.selectMemberList();	//Member���̺� ��ü ��������
			for(MemberVO v2 : list) {
				System.out.println(v2);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
