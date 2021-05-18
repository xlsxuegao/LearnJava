/**
 * @author xuls
 * @date 2021/5/13 20:58
 */
public class FloatDetail {
	public static void main(String[] args) {
		//浮点数的陷阱:2.7 和8.1/3
		double num1 = 2.7;
		double num2 = 8.1 / 3;
		System.out.println(num1);//输出2.7
		System.out.println(num2);//输出接近2.7的一个小数  2.6999999999999997
		//因为计算机的计算精度的问题 , 8.1计算机会认为类似是8.1000000002
		//那么怎么解决浮点数的精度比较呢？
		//比较两个数的差值，是否在某个区间内
		if (Math.abs(num1 - num2) < 0.00001) {
			System.out.println("num1 和 num2相等");
		}
	}
}
