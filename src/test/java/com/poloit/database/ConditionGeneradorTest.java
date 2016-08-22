/**
 * 
 */
package Test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.poloit.generador.Condition;

/**
 * @author Bootcamp
 *
 */
public class ConditionGeneradorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		/*public class Condition {
	private String condition;
	Random rd2 = new Random();

	public Condition(int flag) {
		if (flag == 1) {condition = "Healthy";}
		 else {condition = "Sick";}
	}

	public String getCondition() {return condition;	}}*/
		Condition asd = new Condition();
		int a=1;
		assertEquals(a , Condition.this.getCondition() );
		//fail("Not yet implemented");
		
	}

}
