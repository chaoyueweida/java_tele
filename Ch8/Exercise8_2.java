import java.util.Random;
public class Exercise8_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random rand = new Random();
		int a,b,mm;
		int[] aa = {9885,24,112,6,8,11,900,2188};
		
		//按原顺序输出
		System.out.println("排序前数组a的元素为：");
		
		for(int i =0;i<aa.length;i++)
		{
			System.out.print("a[" + i + "]=" + aa[i] + " ");
		}
		for(int i = 0;i<7;i++)
		{
			a = rand.nextInt(8);
			b = rand.nextInt(8);
			if(a!=b)
			{
				mm = aa[b];
				aa[b] =aa[a];
				aa[a] =mm;
			}
		}
		
		System.out.println("\n"+"乱序后数组a的元素为：");
		
		for(int i =0;i<aa.length;i++)
		{
			System.out.print("a[" + i + "]=" + aa[i] + " ");
		}

	}

}
