package com.metacube.ObjectsCollection;
import org.junit.Assert;
import org.junit.Test;

public class UniqueCharTest {
	
	@Test
	public void TestExpression(){
		Assert.assertEquals(5,UniqueCharUsingChache.Calc("mohit"));
	}
	
	
	@Test(expected=AssertionError.class)
	public void Error()
	{
		UniqueCharUsingChache.Calc(null);
	}
}
