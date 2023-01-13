package bookmall.main;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.dao.CartDao;
import bookmall.dao.CategoryDao;
import bookmall.dao.Order_BookDao;
import bookmall.dao.OrdersDao;
import bookmall.dao.UserDao;
import bookmall.vo.BookVo;
import bookmall.vo.CartVo;
import bookmall.vo.CategoryVo;
import bookmall.vo.Order_BookVo;
import bookmall.vo.OrdersVo;
import bookmall.vo.UserVo;

public class BookMall {

	public static void main(String[] args) {
		
		insertUser();
		System.out.println("## 회원리스트");
		displayUser();
		
		insertCategory();
		System.out.println("## 카테고리");
		displayCategory();
		
		insertBook();
		System.out.println("## 상품");
		displayBook();
		
		insertCart();
		System.out.println("## 카트");
		displayCart();
		
		insertOrders();
		System.out.println("## 주문");
		displayOrders();
		
		insertOrder_book();
		System.out.println("## 주문 도서 리스트");
		displayOrder_book();

	}

	private static void insertUser() {
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

	private static void displayUser() {
		List<UserVo> list = new UserDao().findAll();
		for (UserVo vo : list) {
			System.out.println(vo.getNo() + 
							   ", 이름: " + vo.getName() + 
							   ", 전화번호: " + vo.getPhoneNo() + 
							   ", 이메일: " + vo.getEmail());
		}
	}
	
	private static void insertCategory() {
		CategoryVo vo = null;
		CategoryDao dao = new CategoryDao();

		vo = new CategoryVo();
		vo.setName("소설");
		dao.insert(vo);

		vo = new CategoryVo();
		vo.setName("수필");
		dao.insert(vo);

		vo = new CategoryVo();
		vo.setName("과학");
		dao.insert(vo);

	}

	private static void displayCategory() {
		List<CategoryVo> list = new CategoryDao().findAll();
		for (CategoryVo vo : list) {
			System.out.println(vo.getNo() + ", 카테고리: " + vo.getName());
		}
	}
	
	private static void insertBook() {
		BookVo vo = null;
		BookDao dao = new BookDao();

		vo = new BookVo();
		vo.setTitle("홍길동전");
		vo.setPrice(15000);
		vo.setCategory_no(1);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("글을 쓴다는 것");
		vo.setPrice(20000);
		vo.setCategory_no(2);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("과학으로 보는 세계");
		vo.setPrice(16500);
		vo.setCategory_no(3);
		dao.insert(vo);

	}

	private static void displayBook() {
		List<BookVo> list = new BookDao().findAll();
		for (BookVo vo : list) {
			System.out.println(vo.getNo() + 
							   ", 카테고리: " + vo.getCategory_name() + 
							   ", 제목: " + vo.getTitle() + 
							   ", 가격: " + vo.getPrice());
		}
	}
	
	private static void insertCart() {
		CartVo vo = null;
		CartDao dao = new CartDao();

		vo = new CartVo();
		vo.setBookcount(2);
		vo.setBook_no(1);
		vo.setUser_no(1);
		dao.insert(vo);

		vo = new CartVo();
		vo.setBookcount(4);
		vo.setBook_no(3);
		vo.setUser_no(2);
		dao.insert(vo);

	}

	private static void displayCart() {
		List<CartVo> list = new CartDao().findAll();
		for (CartVo vo : list) {
			System.out.println(vo.getNo() + 
							   ", 제목: " + vo.getBook_title() + 
							   ", 수량: " + vo.getBookcount() + 
							   ", 가격: " + vo.getBook_price());
		}
	}
	
	private static void insertOrders() {
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

	private static void displayOrders() {
		List<OrdersVo> list = new OrdersDao().findAll();
		for (OrdersVo vo : list) {
			System.out.println(vo.getNo() + 
							   ", 이름: " + vo.getUser_name() + 
							   ", 이메일: " + vo.getUser_email() + 
							   ", 가격: " + vo.getPrice() +
							   ", 주소: " + vo.getAddress());
		}
	}
	
	private static void insertOrder_book() {
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

	private static void displayOrder_book() {
		List<Order_BookVo> list = new Order_BookDao().findAll();
		for (Order_BookVo vo : list) {
			System.out.println(vo.getNo() + 
							   ", 제목: " + vo.getBook_title() + 
							   ", 수량: " + vo.getBookcount());
		}
	}

}
