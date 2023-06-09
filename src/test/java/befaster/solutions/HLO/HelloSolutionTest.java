package befaster.solutions.HLO;

import befaster.solutions.SUM.SumSolution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class HelloSolutionTest {

    private HelloSolution helloSolution;

    @BeforeEach
    public void setUp() {
        helloSolution = new HelloSolution();
    }

    @Test
    public void do_hello() {
        String response = helloSolution.hello("John");
        String expectedResponse = "Hello, John!";
        assertEquals(expectedResponse, response);
    }

}