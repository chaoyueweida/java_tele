/**
 * @ClassName: Exercise6_2.java
 * @author: 尤木
 * @Description: 生成a-z、A-Z中的随机一个字母
 * @date 2024年9月13日
 */
public class Exercise6_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double letter;	//声明原始double变量
		int letter_int;	//声明取整后的int变量

		//do-while循环筛选出符合a-z、A-Z的变量
		do {
			letter = 65 + 57 * Math.random();
			letter_int = (int) letter;
		} while (letter_int >= 91 && letter_int <= 96);
		
		//输出该随机字母
		System.out.println((char)letter_int);

	}

}
