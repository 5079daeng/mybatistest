package co.kr.mybatis.dto;


public class user {
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;

	public user() {

	}

	public user(String id, String pw) {
		this.id = id;
		this.pw = pw;

	}

	public user(String id, String pw, String name, String email, String address) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}

}
