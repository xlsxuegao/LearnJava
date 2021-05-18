import java.util.Arrays;

/**
 * @author xuls
 * @date 2021/5/18 20:58
 */
public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr1 = {11, 22, 33, 44, 55, 66};
		System.out.println("之前----------");
		Arrays.stream(arr1).forEach(System.out::println);
		for (int i = 0; i < arr1.length / 2; i++) {
			int temp = arr1[i];
			arr1[i] = arr1[arr1.length - i - 1];
			arr1[arr1.length - i - 1] = temp;
		}
		System.out.println("之后----------");
		Arrays.stream(arr1).forEach(System.out::println);
		//逆序遍历
		int[] ints = new int[arr1.length];
//		for (int i = arr1.length-1; i >= 0; i--) {
//			ints[ints.length-i-1] = arr1[i];
//		}
		for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
			ints[j] = arr1[i];
		}
		arr1 = ints;
		System.out.println("逆序遍历");
		Arrays.stream(arr1).forEach(System.out::println);
	}
}
