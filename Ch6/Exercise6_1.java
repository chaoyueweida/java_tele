/**
 * @ClassName: Exercise6_1.java
 * @author: 尤木
 * @Description: 三元运算的使用
 * @date 2024年9月13日
 */
public class Exercise6_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//第一种方法
		System.out.println("第一种方法((12345679*9)>(98654321*3))?" + (((12345679*9)>(98654321*3))?true:false));
		
		//第二种方法
		Boolean answer = ((12345679*9)>(98654321*3))?true:false;
		System.out.println("第二种方法((12345679*9)>(98654321*3))?" + answer);
		

	}

}
