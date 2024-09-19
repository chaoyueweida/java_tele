
/**
 * @ClassName: Exercise7_1.java
 * @author: 尤木
 * @Description: for循环求1+2+3+...+100的值
 * @date 2024年9月19日
 */
public class Exercise7_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sum = 0;
		for(int i = 1;i < 101;++i)
		{
			sum += i;
		}
		System.out.println("1+2+3+...+100 =" + sum);

	}

}
