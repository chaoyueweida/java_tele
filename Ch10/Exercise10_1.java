
public class Exercise10_1 {

	// ����del0����������ԭ���飬���������
	public static int[] del0(int[] arr) {
		// ͳ��ԭ���鲻Ϊ0��Ԫ�ظ�������ֵ��len����
		int len = 0;
		for (int i : arr) {
			if (i != 0)
				len++;
		}

		// ��������������
		int[] newarr = new int[len];

		// ����for+ifʵ�������鸳ֵ
		{
			int j = 0;
			for (int i : arr) {
				if (i != 0) {
					newarr[j] = i;
					j++;
				}
			}
		}

		return newarr;
	}

	// չʾ�����ֵ
	public static void show(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (i == (arr.length - 1))
				System.out.print(i + "}\n");
			else
				System.out.print(i + ",");
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] oldArr = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };
		int[] newArr = del0(oldArr);

		// չʾԭ����
		System.out.print("oldArr[]={");
		show(oldArr);

		// չʾ������
		System.out.print("newArr[]={");
		show(newArr);

	}

}
