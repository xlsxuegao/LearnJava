package house;

/**
 * @author xuls
 * @date 2021/6/8 21:31
 * 实体类
 */
public class House {
	private int id;
	private String name;
	private String tel;
	private String address;
	private String price;
	private String state;

	public House(int id, String name, String tel, String address, String price, String state) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.price = price;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return id + "\t\t" + name + "\t\t" + tel + "\t\t" + address + "\t\t" + price + "\t\t" + state;
	}
}
