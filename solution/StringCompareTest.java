import junit.framework.*;
import org.junit.Test;

public class StringCompareTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		assertEquals(1, StringCompare.compare("a", "a"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(0, StringCompare.compare("a", "b"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(1, StringCompare.compare("aa", "ab"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(3, StringCompare.compare("cassis", "castor"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(-1, StringCompare.compare("tacos", "poulpe"));
	}
}