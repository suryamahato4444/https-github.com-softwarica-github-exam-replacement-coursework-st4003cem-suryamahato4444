import static org.junit.Assert.*;

import org.junit.Test;

import TesTing.Calculator;

public class CalTest {

	@Test
	public void calTest() {
		assertEquals("error in add()",3,Calculator.add(1, 2));
		assertEquals("error in add()",-3,Calculator.add(-1, -2));
		assertEquals("error in add()",9,Calculator.add(9, 0));
	}
	public void calcTestAddFail() {
		assertEquals("error in add()",0,Calculator.add(1, 2));
	}
	public void calctestSubPass() {
		assertEquals("error in sub()",-1,Calculator.sub(1, 2));
		assertEquals("error in sub()",-3,Calculator.sub(-1, -2));
		assertEquals("error in sub()",9,Calculator.sub(9, 0));
	}
	public void calcSubFail() {
		assertEquals("error in sub()",0,Calculator.add(2, 1));
	}
	public void calcTestMulPass() {
		assertEquals("error in Mul()",2,Calculator.mul(1, 2));
		assertEquals("error in Mul()",2,Calculator.mul(-1, -2));
		assertEquals("error in Mul()",0,Calculator.mul(9, 0));
	}
	public void calcMulFail() {
		assertEquals("error in Mul()",0,Calculator.add(1, 2));
	}
	public void calcTestDivPass() {
		assertEquals("error in Div()",4,Calculator.div(8, 2));
		assertEquals("error in Div()",-4,Calculator.div(-8, -2));
		assertEquals("error in Div()",3,Calculator.div(9, 3));
	}
	public void calcDivFail() {
		assertEquals("error in div()",0,Calculator.add(1, 2));
	}

}
