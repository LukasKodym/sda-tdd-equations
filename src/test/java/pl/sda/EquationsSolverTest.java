package pl.sda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EquationsSolverTest {

    private EquationsSolver equationsSolver;

    @Before
    public void setUp() {
        equationsSolver = new EquationsSolver();
    }

    @Test
    public void shouldReturn1IfEquationIsXPlus3Equals4() {
        //given
        final double a = 1;
        final double b = 3;
        final double c = 4;
        final double expectedResult = 1;
        //when
        double result = equationsSolver.solve(a, b, c);
        //then
        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void shouldThrowExceptionWhenEquationIsIncorrect() {
        //given
        final double a = 0;
        final double b = 0;
        final double c = 4;

        //when
        try {
            equationsSolver.solve(a, b, c);
            Assert.fail("Wyjątek nie został rzucony");
        } catch (IncorrectEquationException e) {
            //then
            Assert.assertTrue(e instanceof IncorrectEquationException);
        }
    }

    @Test
    public void shouldReturn6IfEquationIs6xEquals36() {
        //given
        final double a = 6;
        final double b = 0;
        final double c = 36;
        final double expectedResult = 6;
        //when
        double result = equationsSolver.solve(a, b, c);
        //then
        Assert.assertEquals(expectedResult, result, 0.001);
    }
}
