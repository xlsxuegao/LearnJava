
import java.util.Arrays;

/**
 * @author xuls
 * @date 2021/5/22 10:36
 */
public class YangHuI {
	public static void main(String[] args) {
		//打印10行杨辉三角

		int[][] arr = new int[10][];
		for (int i = 0; i < 10; i++) {
			int[] tempArr = new int[i + 1];
			if (i <= 1) {
				Arrays.fill(tempArr, 1);
			} else {
				tempArr[0] = 1;
				tempArr[tempArr.length - 1] = 1;
				for (int j = 1; j < tempArr.length - 1; j++) {
					tempArr[j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
			arr[i] = tempArr;
		}

		for (int[] ints : arr) {
			for (int anInt : ints) {
				System.out.print(anInt + "\t");
			}
			System.out.print("\n");
		}
	}
}
