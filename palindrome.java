package palindrome;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the word");
Scanner s=new Scanner(System.in);
String a=s.next();
StringBuffer s3=new StringBuffer(a).reverse();
if(a.equals(s3)){
System.out.println("palindromne");
}
{
	System.out.println("not a palindrome");
}
s.close();
	}

}
