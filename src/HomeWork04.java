import java.util.Arrays;

/**
 * @author xuls
 * @date 2021/5/22 11:23
 */
public class HomeWork04 {
	public static void main(String[] args) {
		//10  12 45 90 找到合适的位置插入 保证升序
		int[] arr = {10, 12, 45, 90};
		int[] targetArr = new int[5];
		int target = 23;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (target <= arr[i]) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			index = targetArr.length - 1;
		}
		for (int i = 0; i < targetArr.length; i++) {
			if (i <= index - 1) {
				targetArr[i] = arr[i];
			} else if (i == index) {
				targetArr[i] = target;
			} else {
				targetArr[i] = arr[i - 1];
			}
		}
		Arrays.stream(targetArr).forEach(System.out::println);
	}
}
