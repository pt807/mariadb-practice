package bookshop.dao.test;

import java.util.List;

import bookshop.dao.BookDao;
import bookshop.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		// testInsert();
		testFindAll();
	}

	private static void testInsert() {
		BookVo vo = null;
		BookDao dao = new BookDao();

		vo = new BookVo();
		vo.setTitle("트와일라잇");
		vo.setAuthor_no((long) 1);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("뉴문");
		vo.setAuthor_no((long) 1);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("이클립스");
		vo.setAuthor_no((long) 1);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("브레이킹던");
		vo.setAuthor_no((long) 1);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("아리랑");
		vo.setAuthor_no((long) 2);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("젊은그들");
		vo.setAuthor_no((long) 3);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("아프니깐 청춘이다");
		vo.setAuthor_no((long) 4);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("귀천");
		vo.setAuthor_no((long) 5);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("태백산맥");
		vo.setAuthor_no((long) 6);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("풀하우스");
		vo.setAuthor_no((long) 7);
		dao.insert(vo);

	}

	private static void testFindAll() {
		List<BookVo> list = new BookDao().findAll();
		for (BookVo vo : list) {
			System.out.println(vo);
		}
	}

}