package bookmall.vo;

public class Order_BookVo {
	private Long no;
	private int bookcount;
	private int book_no;
	private int orders_no;
	private String book_title;

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public int getBookcount() {
		return bookcount;
	}

	public void setBookcount(int bookcount) {
		this.bookcount = bookcount;
	}

	public int getBook_no() {
		return book_no;
	}

	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}

	public int getOrders_no() {
		return orders_no;
	}

	public void setOrders_no(int orders_no) {
		this.orders_no = orders_no;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	@Override
	public String toString() {
		return "Orders_BookVo [no=" + no + ", bookcount=" + bookcount + ", book_no=" + book_no + ", orders_no="
				+ orders_no + ", book_title=" + book_title + "]";
	}

}
