
public class BookPress {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//未改出版社前的输出
		System.out.println("---------未更改前-------------");
		book1 b1 = new book1("傲慢与偏见",30.5f);
		book1 b2 = new book1("战争与和平",60.5f);
		book1 b3 = new book1("阴谋与爱情",40.5f);
		System.out.println(b1.getinfo());
		System.out.println(b2.getinfo());
		System.out.println(b3.getinfo());
		
		//对static变量进行修改，只用修改一个实例的出版商，所有实例都改变
		System.out.println("---------更改后-------------");
		b3.changepub("每日精彩出版社");
		System.out.println(b1.getinfo());
		System.out.println(b2.getinfo());
		System.out.println(b3.getinfo());
		book1 b4 = new book1("理智与情感",20.5f);
		System.out.println(b4.getinfo());
		

	}

}

//声明book类	
class book1
{
	String title;
	float price;
	static String publish = "天天精彩出版社";
	
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
		String end =  "书名："+this.title+"\t定价："+this.price + "\t出版社："+this.publish ;
		return end;
	}
	
}

