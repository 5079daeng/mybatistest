package co.kr.mybatis.dto;

public class post {

	private int idpost;
	private String cate;
	private String title;
	private String contents;
	private int userid;
	private String id;
	private String date;

	public post() {

	}

	public post(int idpost, String cate, String title, String contents, int userid, String id, String date) {
		super();
		this.idpost = idpost;
		this.cate = cate;
		this.title = title;
		this.contents = contents;
		this.userid = userid;
		this.id = id;
		this.date = date;
	}

	public int getIdpost() {
		return idpost;
	}

	public void setIdpost(int idpost) {
		this.idpost = idpost;
	}

	public String getCate() {
		return cate;
	}

	public void setCate(String cate) {
		this.cate = cate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "post [idpost=" + idpost + ", cate=" + cate + ", title=" + title + ", contents=" + contents + ", userid="
				+ userid + ", id=" + id + ", date=" + date + "]";
	}

}
