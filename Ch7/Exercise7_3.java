import java.io.*;

public class Exercise7_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		System.out.print("请输入要判断的年份：");
		String year ;
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		int result = 0;
		try {
			year = bufin.readLine();
			//(int) year;
			result = Integer.parseInt(year);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.err.println("请输入正确数字。");			
			e.printStackTrace();
			return;
		}
		
		//鉴定是否是闰年
		if (result % 4 == 0)
		{
			if(result %100 != 0)
			{
				System.out.println(result + "年是闰年。");
			}
			else
				System.out.println(result + "年不是闰年。");
				
		}
		else
			System.out.println(result + "年不是闰年。");
		

	}

}
