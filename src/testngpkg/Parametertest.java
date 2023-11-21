package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	@Parameters("v")
	@Test
	public void test(String w)
	{
		System.out.println(w);
	}

}
