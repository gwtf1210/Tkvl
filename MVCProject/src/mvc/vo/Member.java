package mvc.vo;

// vo(value object:값을 저장하기 위한 객체)
// table 안의 레코드 한 건에 해당
public class Member {
	private String id, name, address, tel;

	public Member() {}
	public Member(String id, String name, String address, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
