
public class Exercise8_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		int[] a = {9885,24,112,6,8,11,900,2188};
		int min = 0;
		//��ԭ˳�����
		System.out.println("����ǰ����a��Ԫ��Ϊ��");
		
		for(int i =0;i<a.length;i++)
		{
			System.out.print("a[" + i + "]=" + a[i] + " ");
		}
		
		//�����㷨
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
		System.out.println("\n" + "���������a��Ԫ��Ϊ��");
		for(int i =0;i<a.length;i++)
		{
			System.out.print("a[" + i + "]=" + a[i] + " ");
		}
		
	}

}
