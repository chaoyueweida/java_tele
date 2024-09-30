
enum Day {
	Monday
	{
		public String getDay()
		{
		return "星期一";
		}
		public String codeDay()
		{
			return "很好";
		}
	},
	Tuesday
	{
		public String getDay()
		{
			return "星期二";
		}
		public String codeDay()
		{
			return "很不好";
		}
	},
	Wednesday
	{
		public String getDay()
		{
		return "星期三";
		}
		public String codeDay()
		{
			return "太不好";
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
