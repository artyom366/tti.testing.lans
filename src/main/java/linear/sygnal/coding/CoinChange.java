package linear.sygnal.coding;

import java.text.DecimalFormat;

/**
 * Created by artyom on 15.30.9.
 */
public class CoinChange {

    public String getChange(int total, int payment) {

        if (payment < total) {
            return "Not enough money to pay";
        }

        int cashBack = payment - total;
        StringBuilder change = new StringBuilder();

        while (cashBack >= 1) {

            if (cashBack >= Nominal.FIVE_HUNDRED.value) {
                cashBack -= Nominal.FIVE_HUNDRED.value;
                change.append(Nominal.FIVE_HUNDRED);

            } else if (cashBack >= Nominal.TWO_HUNDRED.value) {
                cashBack -= Nominal.TWO_HUNDRED.value;
                change.append(Nominal.TWO_HUNDRED);

            } else if (cashBack >= Nominal.ONE_HUNDRED.value) {
                cashBack -= Nominal.ONE_HUNDRED.value;
                change.append(Nominal.ONE_HUNDRED);

            } else if (cashBack >= Nominal.FIFTY.value) {
                cashBack -= Nominal.FIFTY.value;
                change.append(Nominal.FIFTY);

            } else if (cashBack >= Nominal.TWENTY.value) {
                cashBack -= Nominal.TWENTY.value;
                change.append(Nominal.TWENTY);

            } else if (cashBack >= Nominal.TEN.value) {
                cashBack -= Nominal.TEN.value;
                change.append(Nominal.TEN);

            } else if (cashBack >= Nominal.FIVE.value) {
                cashBack -= Nominal.FIVE.value;
                change.append(Nominal.FIVE);

            } else if (cashBack >= Nominal.TWO.value) {
                cashBack -= Nominal.TWO.value;
                change.append(Nominal.TWO);

            } else if (cashBack >= Nominal.ONE.value) {
                cashBack -= Nominal.ONE.value;
                change.append(Nominal.ONE);

            } else if (cashBack >= Nominal.HALF.value) {
                cashBack -= Nominal.HALF.value;
                change.append(Nominal.HALF);

            } else if (cashBack >= Nominal.TWENTY_C.value) {
                cashBack -= Nominal.TWENTY_C.value;
                change.append(Nominal.TWENTY_C);

            } else if (cashBack >= Nominal.TEN_C.value) {
                cashBack -= Nominal.TEN_C.value;
                change.append(Nominal.TEN_C);

             } else if (cashBack >= Nominal.FIVE_C.value) {
                cashBack -= Nominal.FIVE_C.value;
                change.append(Nominal.FIVE_C);

            } else if (cashBack >= Nominal.TWO_C.value) {
                cashBack -= Nominal.TWO_C.value;
                change.append(Nominal.TWO_C);

            } else if (cashBack >= Nominal.PENNY.value) {
                cashBack -= Nominal.PENNY.value;
                change.append(Nominal.PENNY);
            }

            if (cashBack != 0) change.append("_");
        }

        return change.toString();
    }

    private enum Nominal {

        FIVE_HUNDRED(50000),
        TWO_HUNDRED(20000),
        ONE_HUNDRED(10000),
        FIFTY(5000),
        TWENTY(2000),
        TEN(1000),
        FIVE(500),
        TWO(200),
        ONE(100),
        HALF(50),
        TWENTY_C(20),
        TEN_C(10),
        FIVE_C(5),
        TWO_C(2),
        PENNY(1);

        private final int value;

        Nominal(int value) {
            this.value = value;
        }
    }
}
