
class Person 
{
	//��������
	String name,age,like;
	
	//���幹�캯��
	public Person(String n,String a,String l)
	{
		this.name = n;
		this.age = a;
		this.like = l;
	}
	
	//�����������
	public void introduce()
	{
		System.out.println("����"+this.name+",����"+this.age+"����ϲ��"+this.like+"��");
	}


	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Person a = new Person("����","25","����"); //����ʵ��a
		a.introduce();

	}

}
