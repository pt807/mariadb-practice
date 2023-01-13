package bookmall.dao.test;

import java.util.List;

import bookmall.dao.UserDao;
import bookmall.vo.UserVo;

public class UserDaoTest {

	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		UserVo vo = null;
		UserDao dao = new UserDao();

		vo = new UserVo();
		vo.setName("길동");
		vo.setPhoneNo("010-1234-5678");
		vo.setEmail("gildong@naver.com");
		vo.setPassword("gil1234");
		dao.insert(vo);

		vo = new UserVo();
		vo.setName("하하");
		vo.setPhoneNo("010-1313-5678");
		vo.setEmail("haha@naver.com");
		vo.setPassword("haha1313");
		dao.insert(vo);
	}

	private static void testFindAll() {
		List<UserVo> list = new UserDao().findAll();
		for (UserVo vo : list) {
			System.out.println(vo);
		}
	}

}
