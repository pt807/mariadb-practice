package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrdersDao;
import bookmall.vo.OrdersVo;

public class OrdersDaoTest {

	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		OrdersVo vo = null;
		OrdersDao dao = new OrdersDao();

		vo = new OrdersVo();
		vo.setOrderNo(1);
		vo.setPrice(30000);
		vo.setAddress("부산광역시 연제구");
		vo.setUser_no(1);
		dao.insert(vo);

		vo = new OrdersVo();
		vo.setOrderNo(2);
		vo.setPrice(66000);
		vo.setAddress("부산광역시 수영구");
		vo.setUser_no(2);
		dao.insert(vo);
	}

	private static void testFindAll() {
		List<OrdersVo> list = new OrdersDao().findAll();
		for (OrdersVo vo : list) {
			System.out.println(vo);
		}
	}

}
