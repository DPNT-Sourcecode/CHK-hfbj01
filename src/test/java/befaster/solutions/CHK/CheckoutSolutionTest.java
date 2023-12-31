package befaster.solutions.CHK;

import befaster.solutions.HLO.HelloSolution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutSolutionTest {

    private CheckoutSolution checkoutSolution;

    @BeforeEach
    public void setUp() {
        checkoutSolution = new CheckoutSolution();
    }

    @Test
    public void do_checkout1() {
        Integer response = checkoutSolution.checkout("AABCCDA");
        Integer expectedResponse = 215;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout2() {
        Integer response = checkoutSolution.checkout("AABKCDA");
        Integer expectedResponse = -1;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout3() {
        Integer response = checkoutSolution.checkout("AAAABBCDDA");
        Integer expectedResponse = 295;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout4() {
        Integer response = checkoutSolution.checkout("");
        Integer expectedResponse = 0;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout5() {
        Integer response = checkoutSolution.checkout("AAAABBBCCDDA");
        Integer expectedResponse = 345;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout6() {
        Integer response = checkoutSolution.checkout("AAAABBBCCDDAE");
        Integer expectedResponse = 385;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout7() {
        Integer response = checkoutSolution.checkout("AAAAABBBCCDDEEEEEE");
        Integer expectedResponse = 510;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout8() {
        Integer response = checkoutSolution.checkout("AAAAABBBBBCCDDEEEEEE");
        Integer expectedResponse = 555;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout9() {
        Integer response = checkoutSolution.checkout("C");
        Integer expectedResponse = 20;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout10() {
        Integer response = checkoutSolution.checkout("D");
        Integer expectedResponse = 15;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout11() {
        Integer response = checkoutSolution.checkout("FFF");
        Integer expectedResponse = 20;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout12() {
        Integer response = checkoutSolution.checkout("FFFFF");
        Integer expectedResponse = 40;
        assertEquals(expectedResponse, response);
    }

    @Test
    public void do_checkout13() {
        Integer response = checkoutSolution.checkout("FFFFFF");
        Integer expectedResponse = 40;
        assertEquals(expectedResponse, response);
    }

}