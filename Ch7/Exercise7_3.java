import java.io.*;

public class Exercise7_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		System.out.print("������Ҫ�жϵ���ݣ�");
		String year ;
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		int result = 0;
		try {
			year = bufin.readLine();
			//(int) year;
			result = Integer.parseInt(year);
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			System.err.println("��������ȷ���֡�");			
			e.printStackTrace();
			return;
		}
		
		//�����Ƿ�������
		if (result % 4 == 0)
		{
			if(result %100 != 0)
			{
				System.out.println(result + "�������ꡣ");
			}
			else
				System.out.println(result + "�겻�����ꡣ");
				
		}
		else
			System.out.println(result + "�겻�����ꡣ");
		

	}

}
