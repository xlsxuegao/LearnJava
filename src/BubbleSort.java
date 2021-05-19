import java.util.Arrays;

/**
 * @author xuls
 * @date 2021/5/19 20:43
 */
public class BubbleSort {
	public static void main(String[] args) {
		//冒泡排序
		//将数组中的元素从小到大排序
//		int [] arr = new int[]{24,69,80,57,13};
		int[] arr = new int[]{24, 13, 57, 69, 80};
		//第一个版本
		//排五个数 每次找到最大的一个 最多找4次
		//外循环n-1
//		for (int i = arr.length-1; i >=0; i--) {
//			for (int j = 0; j < i; j++) {
//				int temp = arr[j];
//				//两两比较 大于就进行交换
//				if (temp>arr[j+1]){
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		//然后我们就会发现 如果只需要两次就能获得我们想要的顺序了
		//按照第一版 已经是正确的顺序 却还会再次排序
		//所以 有了改进的第二版
		for (int i = arr.length - 1; i >= 0; i--) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				//两两比较 大于就进行交换
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			//说明没有发生交换 即数组已经是有序的了
			if (!flag) {
				break;
			}
		}
		Arrays.stream(arr).forEach(System.out::println);

	}
}
