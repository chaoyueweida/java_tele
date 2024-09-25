
//声明book类	
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
			System.out.println("书名："+this.title+"\t定价："+this.price);
		}
		
	}


public class Exercise9_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		book bookA = new book("傲慢与偏见",30.5f);//声明实例A
		book bookB = new book("战争与和平",90.5f);//声明实例B
		bookB = bookA;//为B赋值A
		bookA.printinfo();
		bookB.printinfo();

	}

}
