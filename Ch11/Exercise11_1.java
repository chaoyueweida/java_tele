enum WeekDay {Sun,Mon,Tue,Wed,Thu,Fri,Sat};

public class Exercise11_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		WeekDay wd = WeekDay.Mon;
		switch(wd)
		{
		case Mon:
			{System.out.println("Do Monday work");
			break;
			}
		case Tue:
			{System.out.println("Do Tuesday work");
			break;
			}
		default:
			{System.out.println("I don't know.");
			break;
			}
		}

	}

}
