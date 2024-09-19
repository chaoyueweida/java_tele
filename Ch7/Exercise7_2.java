
/**
 * @ClassName: Exercise7_2.java
 * @author: 尤木
 * @Description: 
 * @date 2024年9月19日
 */
public class Exercise7_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		int mon = 1 + (int) (11 * Math.random()); 
		//int[] Mons = {1,3,5,7,8,10,12};
		switch(mon)
		{
		/*这种写法只适用于sdk12及其以上
		 * case 1,3,5,7,8,10,12:
			System.out.println(mon + "月共有31天。");
			break;
		*/
		case 1:
			System.out.println(mon + "月共有31天。");
			break;
		case 2:
			System.out.println(mon + "月共有28天。");
			break;
		default:
			System.out.println(mon + "月共有30天。");
			
		
			
		}

	}

}
