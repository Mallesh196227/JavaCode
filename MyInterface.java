public interface MyInterface {
	int a = 10;
	default void m1()
	{
		System.out.println("M1 method executed");
	}
	static void m2()
	{
		System.out.println("M2 method executed");
	}
}
