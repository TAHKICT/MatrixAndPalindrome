import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MatrixSolutionTest {
    MatrixSolution solution;

    @Before
    public void init(){
        solution = new MatrixSolution();
    }

    @Test
    public void whenRowsMoreThenColumns(){
        int [ ] [ ] M = {
                { 11, 21, 31 },
                { 12, 22, 32 },
                { 13, 23, 33 },
                { 14, 24, 34 },
                { 15, 25, 35 },
                { 16, 26, 36 }
        };

        assertEquals(Arrays.asList(11, 21, 12, 13, 22, 31, 32, 23, 14, 15, 24, 33, 34, 25, 16, 26, 35, 36),solution.solution(6,3, M));
    }

    @Test
    public void whenRowsLessThenColumns(){
        int [ ] [ ] M = {
                { 11, 21, 31, 41, 51, 61 },
                { 12, 22, 32, 42, 52, 62 },
                { 13, 23, 33, 43, 53, 63 }
        };

        assertEquals(Arrays.asList(11, 21, 12, 13, 22, 31, 41, 32, 23, 33, 42, 51, 61, 52, 43, 53, 62, 63),solution.solution(3,6, M));
    }
}
