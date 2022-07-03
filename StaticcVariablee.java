package addition;

public class StaticcVariablee {
	static int a=10;
public void aOne()
{
	System.out.println(a);
}
public static void main(String[] args) {
	StaticcVariablee v=new StaticcVariablee();
	v.aOne();
}
}
