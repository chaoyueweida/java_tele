
public class BookPress {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		//δ�ĳ�����ǰ�����
		System.out.println("---------δ����ǰ-------------");
		book1 b1 = new book1("������ƫ��",30.5f);
		book1 b2 = new book1("ս�����ƽ",60.5f);
		book1 b3 = new book1("��ı�밮��",40.5f);
		System.out.println(b1.getinfo());
		System.out.println(b2.getinfo());
		System.out.println(b3.getinfo());
		
		//��static���������޸ģ�ֻ���޸�һ��ʵ���ĳ����̣�����ʵ�����ı�
		System.out.println("---------���ĺ�-------------");
		b3.changepub("ÿ�վ��ʳ�����");
		System.out.println(b1.getinfo());
		System.out.println(b2.getinfo());
		System.out.println(b3.getinfo());
		book1 b4 = new book1("���������",20.5f);
		System.out.println(b4.getinfo());
		

	}

}

//����book��	
class book1
{
	String title;
	float price;
	static String publish = "���쾫�ʳ�����";
	
	public book1(String t,float p)
	{
		this.title = t;
		this.price = p;
	}
	
	public void changepub(String pb)
	{
		
		this.publish = pb;
	}
	
	
	
	public String getinfo()
	{
		String end =  "������"+this.title+"\t���ۣ�"+this.price + "\t�����磺"+this.publish ;
		return end;
	}
	
}

