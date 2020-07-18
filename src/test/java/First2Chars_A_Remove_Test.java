import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class First2Chars_A_Remove_Test {

	/*
	 * 1. 2 chars : "AA" => "" - success
	 * 2. 4 chars : "ABAC" => "BAC" - success
	 * 3. n chars : "BACDEF" => "BCDEF" - success
	 * 4. 1 chars : "A" => "" - success
	 * 5. empty string : "" => "" - success
	 */
	
	First2Chars_A_Remove obj;
	
	@BeforeEach
	void setup() {
		obj=new First2Chars_A_Remove();
	}
	
	@Test
	void test2Chars() {
		assertEquals(obj.removeFirst2Chars_A("AA"),"");
	}
	
	@Test
	void test4Chars() {
		assertEquals(obj.removeFirst2Chars_A("ABAC"),"BAC");
	}
	
	@Test
	void testNChars() {
		assertEquals(obj.removeFirst2Chars_A("BACDEF"),"BCDEF");
	}
	
	@Test
	void test1Char() {
		assertEquals(obj.removeFirst2Chars_A("A"),"");
	}
	
	@Test
	void test0Chars() {
		assertEquals(obj.removeFirst2Chars_A(""),"");
	}



}
