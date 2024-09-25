
class Person 
{
	//定义属性
	String name,age,like;
	
	//定义构造函数
	public Person(String n,String a,String l)
	{
		this.name = n;
		this.age = a;
		this.like = l;
	}
	
	//定义输出方法
	public void introduce()
	{
		System.out.println("我是"+this.name+",今年"+this.age+"，我喜欢"+this.like+"。");
	}


	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person a = new Person("王四","25","读书"); //生成实例a
		a.introduce();

	}

}
