/**
 * @author xuls
 * @date 2021/5/23 15:53
 */
public class Recursion01 {
	private static int count = 0;

	public static void main(String[] args) {
//		System.out.println(feibonaqi(8));
//		System.out.println(chiTaoZi(10));
//		int [][] miGong = createMiGong();
//		if (findWay(miGong,1,1)){
//			showMiGong(miGong);
//		}
//		move(3, 'A', 'B', 'C');
		int[] ints = new int[8];
		Check(ints, 0, 8);
		System.out.println(count);
	}

	//计算斐波那契数列的值
	//1 1 2 3 5 8 13
	public static int feibonaqi(int n) {
		if (n >= 1 && n <= 2) {
			return 1;
		}
		return feibonaqi(n - 1) + feibonaqi(n - 2);
	}

	//猴子吃桃问题：
	//有一堆桃子第一天吃了一半，并且多吃了一个，以后每天都吃一半并多吃一个，
	// 到第10天想吃时发现只有一个桃子了，请问原来有多少桃子
	//思路分析：
	//10day - > 1
	//9day -> (10day+1)*2
	//8day -> (9day+1)*2
	public static int chiTaoZi(int day) {
		if (day < 0) {
			return -1;
		}
		if (day == 1) {
			return 1;
		}
		return (chiTaoZi(day - 1) + 1) * 2;
	}

	public static int[][] createMiGong() {
		int[][] arr = new int[8][7];
		//0表示迷宫 ，1表示障碍物
		//1.先把上下两层设置为障碍物
		for (int i = 0; i < 7; i++) {
			arr[0][i] = 1;
			arr[7][i] = 1;
		}
		//2.再把左右两层设置为障碍物
		for (int i = 0; i < 8; i++) {
			arr[i][0] = 1;
			arr[i][6] = 1;
		}
		//3.单独设置一下 3,1 3,2
		arr[3][1] = 1;
		arr[3][2] = 1;
		return arr;
	}

	public static void showMiGong(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int i1 = 0; i1 < arr[i].length; i1++) {
				System.out.print(arr[i][i1] + "\t");
			}
			System.out.println();
		}
	}

	// 0表示无障碍 ，1表示有障碍 ，2表示可以走，3表示走过但不能走到出口
	//当map[6][5]==2，return true
	//寻找策略下右上左
	public static boolean findWay(int[][] map, int startX, int startY) {
		if (map[6][5] == 2) {
			return true;
		} else {
			if (map[startX][startY] == 0) {
				map[startX][startY] = 2;
				//下 右 上 左
				if (findWay(map, startX + 1, startY) || findWay(map, startX, startY + 1)
						|| findWay(map, startX - 1, startY) || findWay(map, startX, startY - 1)) {
					return true;
				} else {//说明四个方向都走不通
					map[startX][startY] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
	}

	//汉诺塔问题

	/**
	 * @param num 要移动的柱子
	 * @param a   柱子a
	 * @param b   柱子b
	 * @param c   柱子c
	 */
	public static void move(int num, char a, char b, char c) {
		if (num == 1) {
			System.out.println(a + "->" + c);
		} else {
			//1.先把除了最后一个的其他盘 ，移动到B， 借助c
			move(num - 1, a, c, b);
			//2.再把a柱子上的一个盘移动到C
			System.out.println(a + "->" + c);
			//3.再把b柱子上的移动到c，借助a
			move(num - 1, b, a, c);
		}
	}

	public static void baHuangHou(int[] arr, int i, int j) {
		if (i > 8) {
			return;
		}

	}

	public static void Check(int[] array, int n, int max) {
		if (n == max) {
			count++;
			return;
		}
		for (int i = 0; i < max; i++) {
			array[n] = i;
			if (JudgeIsOk(n, array)) {
				Check(array, n + 1, max);
			}
		}
	}

	public static boolean JudgeIsOk(int n, int[] array) {
		//判断是否在同一列、同一行、或者同一对角线
		for (int i = 0; i < n; i++) {
			if (array[i] == array[n] || (n - i) == Math.abs(array[i] - array[n])) {
				return false;
			}
		}
		return true;
	}
}
