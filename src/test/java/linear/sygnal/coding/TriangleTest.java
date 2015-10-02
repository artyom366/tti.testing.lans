package linear.sygnal.coding;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class TriangleTest {

    private Triangle triangle;
    private List<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();

    @Before
    public void setUp() {

        triangle = new Triangle();

        expected.add(new ArrayList<Integer>(Arrays.asList(1)));
        expected.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
        expected.add(new ArrayList<Integer>(Arrays.asList(1, 2, 1)));
        expected.add(new ArrayList<Integer>(Arrays.asList(1, 3, 3, 1)));
        expected.add(new ArrayList<Integer>(Arrays.asList(1, 4, 6, 4, 1)));
        expected.add(new ArrayList<Integer>(Arrays.asList(1, 5, 10, 10, 5, 1)));
        expected.add(new ArrayList<Integer>(Arrays.asList(1, 6, 15, 20, 15, 6, 1)));
    }

    @Test
    public void getNull() {

        assertNull(triangle.getRow(-1));
    }

    @Test
    public void getFirstRow() {

        List<Integer> integers = triangle.getRow(1);
        assertEquals(integers, expected.get(1));
    }

    @Test
    public void getSecondRow() {

        List<Integer> integers = triangle.getRow(2);
        assertEquals(integers, expected.get(2));
    }

    @Test
    public void getThirdRow() {

        List<Integer> integers = triangle.getRow(3);
        assertEquals(integers, expected.get(3));
    }

    @Test
    public void getFourthRow() {

        List<Integer> integers = triangle.getRow(4);
        assertEquals(integers, expected.get(4));
    }

    @Test
    public void getFifthRow() {

        List<Integer> integers = triangle.getRow(5);
        assertEquals(integers, expected.get(5));
    }

    @Test
    public void getSixthRow() {

        List<Integer> integers = triangle.getRow(6);
        assertEquals(integers, expected.get(6));
    }
}
