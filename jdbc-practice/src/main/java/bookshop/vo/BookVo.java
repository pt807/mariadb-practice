package bookshop.vo;

public class BookVo {
	private Long no;
	private String title;
	private String rent;
	private String authorName;
	private Long Author_no;

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRent() {
		return rent;
	}

	public void setRent(String rent) {
		this.rent = rent;
	}

	
	public Long getAuthor_no() {
		return Author_no;
	}

	public void setAuthor_no(Long author_no) {
		Author_no = author_no;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", rent=" + rent + ", authorName=" + authorName
				+ ", Author_no=" + Author_no + "]";
	}

}
