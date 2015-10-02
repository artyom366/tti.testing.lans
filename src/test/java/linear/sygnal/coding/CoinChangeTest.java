package linear.sygnal.coding;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


/**
 * Created by artyom on 15.30.9.
 *
 */

@RunWith(Parameterized.class)
public class CoinChangeTest {

    private CoinChange coinChange;
    private int total, payment;
    private String expected;

    public CoinChangeTest(int total, int payment, String expected) {
        this.total = total;
        this.payment = payment;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {50100, 50100, ""},                                                                 //no change
                {50100, 100200, "FIVE_HUNDRED_ONE"},                                                //500
                {50100, 100000, "TWO_HUNDRED_TWO_HUNDRED_FIFTY_TWENTY_TWENTY_FIVE_TWO_TWO"},        //200
                {15200, 50000, "TWO_HUNDRED_ONE_HUNDRED_TWENTY_TWENTY_FIVE_TWO_ONE"},               //100
                {4800, 10000, "FIFTY_TWO"},                                                         //50
                {5500, 10000, "TWENTY_TWENTY_FIVE"},                                                //20
                {3500, 5000, "TEN_FIVE"},                                                           //10
                {1100, 2000, "FIVE_TWO_TWO"},                                                       //5
                {300, 500, "TWO"},                                                                  //2
                {400, 500, "ONE"},                                                                  //1
                {450, 500, "HALF"},                                                              //0.5
                {470, 500, "TWENTY_C_TEN_C"},                                                    //0.2
                {485, 500, "TEN_C_FIVE_C"},                                                     //0.1
                {495, 500, "FIVE_C"},                                                           //0.05
                {498, 500, "TWO_C"},                                                            //0.02
                {499, 500, "PENNY"},                                                            //0.01
                {32587, 50000, "ONE_HUNDRED_FIFTY_TWENTY_TWO_TWO_TEN_C_TWO_C_PENNY"},
                {100, 50, "Not enough money to pay"}
        };
        return Arrays.asList(data);
    }

    @Before
    public void setUp() {
        coinChange = new CoinChange();
    }

    @Test
    public void runTests() {
        assertEquals(expected, coinChange.getChange(total, payment));
    }






}
