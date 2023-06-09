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
        Integer expectedResponse = 405;
        assertEquals(expectedResponse, response);
    }

}