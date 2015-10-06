package linear.sygnal.coding;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by artyom on 15.6.10.
 */

@RunWith(Parameterized.class)
public class DistinctTest {

    private Distinct distinct;
    private boolean expected;
    private int[] nums;

    public DistinctTest(int[] nums, boolean expected) {
        this.expected = expected;
        this.nums = nums;
    }

    @Before
    public void setUp() {
        distinct = new Distinct();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {null, false},
                {new int[]{}, false},
                {new int[]{0}, false},
                {new int[]{0, 2, 3, 4, 5}, false},
                {new int[]{0, 1, 2, 5, 0} ,true}
        };
        return Arrays.asList(data);
    }

    @Test
    public void runTests() {
        assertEquals(expected, distinct.containsDuplicate(nums));
    }
}
