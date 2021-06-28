package house;

import java.util.ArrayList;

/**
 * @author xuls
 * @date 2021/6/8 21:31
 * 响应houseview的调用
 * 完成对房屋信息的各种操作
 */
public class HouseService {
	private ArrayList<House> list = new ArrayList<>();
	public int index = 0;

	public House[] list() {
		return list.toArray(new House[0]);
	}

	public void add(House house) {
		index++;
		house.setId(index);
		list.add(house);
	}

	public void update(House house) {

	}

	public boolean delete(int id) {
		for (House house : list) {
			if (house.getId() == id) {
				return list.remove(house);
			}
		}
		return false;
	}

	public void read() {

	}
}
