
enum Day {
	Monday
	{
		public String getDay()
		{
		return "����һ";
		}
		public String codeDay()
		{
			return "�ܺ�";
		}
	},
	Tuesday
	{
		public String getDay()
		{
			return "���ڶ�";
		}
		public String codeDay()
		{
			return "�ܲ���";
		}
	},
	Wednesday
	{
		public String getDay()
		{
		return "������";
		}
		public String codeDay()
		{
			return "̫����";
		}
	};
	public abstract String getDay();
	public abstract String codeDay();
	

}

public class Exercise11_2
{
	public static void main(String[] args)
	{
		Day day1 = Day.Monday;
		System.out.println(day1.getDay());
		System.out.println(day1.codeDay());
	}
}
