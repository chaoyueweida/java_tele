import java.lang.*;

public class Exercise10_2 {
	
	//����betweenInt����
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
		// TODO �Զ����ɵķ������
		double z = betweenInt(4,7);
		System.out.println(z);

	}

}
