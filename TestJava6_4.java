
public class TestJava6_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double letter;
		int letter_int;
		
		do
		{
		letter = 65 + 57 * Math.random() ;
		letter_int = (int) letter;
		}while(letter_int >= 91 && letter_int <=96) ;
		System.out.println("ת��ǰ:" + (char) letter_int);
		int letter_end = (letter_int <= 90)? letter_int : (letter_int -32);
		System.out.println("ת����:" + (char) letter_end);

	}

}

65
001000001

000100000

97
001100001