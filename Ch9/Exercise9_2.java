
//����book��	
class book
	{
		String title;
		float price;
		
		public book(String t,float p)
		{
			this.title = t;
			this.price = p;
		}
		
		public void printinfo()
		{
			System.out.println("������"+this.title+"\t���ۣ�"+this.price);
		}
		
	}


public class Exercise9_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		book bookA = new book("������ƫ��",30.5f);//����ʵ��A
		book bookB = new book("ս�����ƽ",90.5f);//����ʵ��B
		bookB = bookA;//ΪB��ֵA
		bookA.printinfo();
		bookB.printinfo();

	}

}
