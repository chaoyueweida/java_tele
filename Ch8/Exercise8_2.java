import java.util.Random;
public class Exercise8_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Random rand = new Random();
		int a,b,mm;
		int[] aa = {9885,24,112,6,8,11,900,2188};
		
		//��ԭ˳�����
		System.out.println("����ǰ����a��Ԫ��Ϊ��");
		
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
		
		System.out.println("\n"+"���������a��Ԫ��Ϊ��");
		
		for(int i =0;i<aa.length;i++)
		{
			System.out.print("a[" + i + "]=" + aa[i] + " ");
		}

	}

}
