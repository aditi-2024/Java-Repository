package Assignment;
class Da
{
	int sum(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		if(a<b) return 0;
		return a-b;
	}
}
public class Question_6 {

	public static void main(String[] args) {
		Da d=new Da();
		int a=2,b=3;
		int result=(a>b)? d.sum(a, b):d.sub(a, b);
		System.out.println(result);
	}

}