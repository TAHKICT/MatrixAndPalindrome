import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeSolutionTest {

    PalindromeSolution solution;

    @Before
    public void init(){
        solution = new PalindromeSolution();
    }

    @Test
    public void whenNothingNeedToBeAdded(){
        assertEquals(0, solution.solution("aabbaa"));
    }

    @Test
    public void when1NeedToBeAdded(){
        assertEquals(1, solution.solution("aabba"));
    }

    @Test
    public void whenAllExceptLastNeedToBeAdded(){
        assertEquals(3, solution.solution("aaab"));
    }
}
