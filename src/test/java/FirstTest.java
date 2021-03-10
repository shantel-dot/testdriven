import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FirstTest {

    @BeforeEach
    void beforeEachTest() {
    System.out.println("Test is running...");
}
    @Test
    @DisplayName("Testing returnBool() method in Utility class")
    void test() {
        Boolean actual = Utility.returnBool();
        assertTrue(actual);
    }

    @Test
    @Disabled("This test is currently disabled")
    void isBiggerTest() {
        Boolean actual = Utility.isLarger(5, 3);
        assertTrue(actual);
    }

    @Test
    void addTest() {
        int actual = Utility.addInts(10, 21);
        int expected = 31;

        assertEquals(expected, actual);
    }

    @Test
    void addAnotherTest() {
        int actual = Utility.addInts(15, 11);
        int expected = 26;

        assertEquals(expected, actual);
    }
}