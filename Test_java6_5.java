
public class Test_java6_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double letter;
		int letter_int;
		
		do
		{
		letter = 65 + 57 * Math.random() ;
		letter_int = (int) letter;
		}while(letter_int >= 91 && letter_int <=96) ;
		System.out.println("转换前:" + (char) letter_int);
		//if(letter_int >= 97)
			//letter_int ^= 32;
		letter_int &= -33;
		System.out.println("转换前:" + (char) letter_int);
			

	}

}
