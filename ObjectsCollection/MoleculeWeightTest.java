package com.metacube.ObjectsCollection;
import org.junit.*;

public class MoleculeWeightTest {

	@Test
	public void TestTrue()
	{
		Assert.assertEquals(46,MoleculeWeight.evaluate("C(OH)2"));
	}
	
	@Test(expected=AssertionError.class)
	public void Asserttest()
	{
		MoleculeWeight.evaluate(null);
	}
}
