import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@DisplayName("Testing class")
public class TestEmployee {
	@BeforeAll
	public  static void setOnce() {
		System.out.println("on the top");
	}
	
	@BeforeEach
	@Tag("dev")
	public void setUp() {
		System.out.println("setup data");
	}
	
	@Test
	@Order(3)
	@Tag("prod")
	@DisplayName("Testing save method")

	public void testSave() {
		System.out.println("Hello Java save test");
	}
	@Test
	@Order(2)
	@DisplayName("Testing delete method")
	@Tag("dev")

	public void testDelete() {
		System.out.println("Hello Java delete test");
	}
	@Test
	@Order(1)
	@Tag("prod")

	public void testUpdate() {
		System.out.println("Hello Java update test");
	}
	@AfterEach
	public void clean() {
		System.out.println("clean data");
	}
	@AfterAll
	@Disabled
	public  static void closeAll() {
		System.out.println("At the end");
	}
	@RepeatedTest(value = 3)
	public void multipleRepeat(TestInfo testinfo) {
		System.out.println("repeated method");
		
	}



}
