
/**
 * @ClassName: Exercise7_2.java
 * @author: ��ľ
 * @Description: 
 * @date 2024��9��19��
 */
public class Exercise7_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		int mon = 1 + (int) (11 * Math.random()); 
		//int[] Mons = {1,3,5,7,8,10,12};
		switch(mon)
		{
		/*����д��ֻ������sdk12��������
		 * case 1,3,5,7,8,10,12:
			System.out.println(mon + "�¹���31�졣");
			break;
		*/
		case 1:
			System.out.println(mon + "�¹���31�졣");
			break;
		case 2:
			System.out.println(mon + "�¹���28�졣");
			break;
		default:
			System.out.println(mon + "�¹���30�졣");
			
		
			
		}

	}

}
