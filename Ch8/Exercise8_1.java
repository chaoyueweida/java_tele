
public class Exercise8_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		int[] a = {9885,24,112,6,8,11,900,2188};
		int min = 0;
		//按原顺序输出
		System.out.println("排序前数组a的元素为：");
		
		for(int i =0;i<a.length;i++)
		{
			System.out.print("a[" + i + "]=" + a[i] + " ");
		}
		
		//排序算法
		for(int j = 0;j<(a.length-4);j++)
		{
			for(int i =0;i<(a.length-1);i++)
			{
				if(a[i] <= a[i+1])
					;
					//min = a[i];
				else 
				{
					min = a[i+1];
					a[i+1] = a[i];
					a[i] = min;
				}			
			}
		}
		System.out.println("\n" + "排序后数组a的元素为：");
		for(int i =0;i<a.length;i++)
		{
			System.out.print("a[" + i + "]=" + a[i] + " ");
		}
		
	}

}
