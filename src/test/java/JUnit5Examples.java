import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("### @Test beforeAll !");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("### @Test afterAll !");
    }

    @BeforeEach
    void beforeEach() {
        //open("google.com")
        System.out.println("### @Test beforeEach !");
    }

    @AfterEach
    void afterEach() {
        //open("google.com")
        System.out.println("### @Test afterEach !");
    }

    @Test
    void firstTest(){
        System.out.println("### @Test firstTest() !");
        assertTrue( 3> 2);
    }

    @Test
    void secondTest(){
        System.out.println("### @Test secondTest() !");
        assertFalse(3 >2);
    }
}
