
public class Exercise10_1 {

	// 创建del0方法，输入原数组，输出新数组
	public static int[] del0(int[] arr) {
		// 统计原数组不为0的元素个数，赋值给len变量
		int len = 0;
		for (int i : arr) {
			if (i != 0)
				len++;
		}

		// 声明定义新数组
		int[] newarr = new int[len];

		// 利用for+if实现新数组赋值
		{
			int j = 0;
			for (int i : arr) {
				if (i != 0) {
					newarr[j] = i;
					j++;
				}
			}
		}

		return newarr;
	}

	// 展示数组的值
	public static void show(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (i == (arr.length - 1))
				System.out.print(i + "}\n");
			else
				System.out.print(i + ",");
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] oldArr = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };
		int[] newArr = del0(oldArr);

		// 展示原数组
		System.out.print("oldArr[]={");
		show(oldArr);

		// 展示新数组
		System.out.print("newArr[]={");
		show(newArr);

	}

}
