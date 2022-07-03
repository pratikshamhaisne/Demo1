package addition;

public class GloballVariable {
 int z=2;
	public void aOne()
	{
		System.out.println(z);
	}
	public static void main(String[] args) {
		GloballVariable g=new GloballVariable();
		g.aOne();
	}
}
