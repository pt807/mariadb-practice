package bookmall.dao.test;

import java.util.List;

import bookmall.dao.Order_BookDao;
import bookmall.vo.Order_BookVo;

public class Order_BookDaoTest {

	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		Order_BookVo vo = null;
		Order_BookDao dao = new Order_BookDao();

		vo = new Order_BookVo();
		vo.setBookcount(2);
		vo.setBook_no(1);
		vo.setOrders_no(1);
		dao.insert(vo);

		vo = new Order_BookVo();
		vo.setBookcount(4);
		vo.setBook_no(3);
		vo.setOrders_no(2);
		dao.insert(vo);
	}

	private static void testFindAll() {
		List<Order_BookVo> list = new Order_BookDao().findAll();
		for (Order_BookVo vo : list) {
			System.out.println(vo);
		}
	}

}
