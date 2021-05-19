import java.util.Scanner;

/**
 * @author xuls
 * @date 2021/5/18 22:24
 */
public class ArrayReduce {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3, 4, 5};
		Scanner scanner = new Scanner(System.in);
		while (true) {
			if (arr.length == 1) {
				System.out.println("无法再缩减了");
				break;
			}
			char key = scanner.next().charAt(0);
			if (key == 'y') {
				int[] tempArr = new int[arr.length - 1];
				System.arraycopy(arr, 0, tempArr, 0, tempArr.length);
				arr = tempArr;
			} else {
				System.out.println("停止缩减...");
				break;
			}
		}
	}
}
