
/**
 * @ClassName: Exercise6_3_2.java
 * @author: 尤木
 * @Description: 利用位运算实现小写转大写、大写转大写
 * @date 2024年9月13日
 */
public class Exercise6_3_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double letter;	//声明原始double变量
		int letter_int;	//声明取整后的int变量

		//do-while循环筛选出符合a-z、A-Z的变量
		do {
			letter = 65 + 57 * Math.random();
			letter_int = (int) letter;
		} while (letter_int >= 91 && letter_int <= 96);
		
		//输出原始值
		System.out.println("转换前:" + (char) letter_int);
		int letter_int2 = letter_int;	//为第二种方法保留原始值
		
		
		
		//第一种方法：小写转大写、大写转大写
		letter_int &= -33;
		System.out.println("转换后（第一种方法）:" + (char) letter_int);
		
		//第二种方法：小写转大写、大写不变
		if(letter_int2 >= 97)
			letter_int2 ^= 32;
		System.out.println("转换后（第二种方法）:" + (char) letter_int2);
		
		

	}

}
