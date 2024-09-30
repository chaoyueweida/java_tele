import java.lang.*;

public class Exercise10_2 {
	
	//创造betweenInt函数
	public static double betweenInt(int a,int b)
	{
		double end = 0;
		if(a > b)
			end = b + (a-b)*java.lang.Math.random();
		else
			end = a + (b-a)*Math.random();
			
		return end;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double z = betweenInt(4,7);
		System.out.println(z);

	}

}
