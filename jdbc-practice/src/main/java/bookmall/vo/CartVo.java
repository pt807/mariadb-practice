package bookmall.vo;

public class CartVo {
	private Long no;
	private int bookcount;
	private int user_no;
	private int book_no;
	private String book_title;
	private int book_price;

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

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public int getBook_no() {
		return book_no;
	}

	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	@Override
	public String toString() {
		return "CartVo [no=" + no + ", bookcount=" + bookcount + ", user_no=" + user_no + ", book_no=" + book_no
				+ ", book_title=" + book_title + ", book_price=" + book_price + "]";
	}

}
