package com.thoughtworks;

import sun.nio.cs.ext.Big5;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: 9527
 * Date: 11-12-12
 * Time: 下午5:11
 * To change this template use File | Settings | File Templates.
 */
public class TaxiAcountingSystems {
    private static final double START_DISTANCE = 3.0;
    private static final BigDecimal START_PRICE = new BigDecimal(6.0);
    private static final BigDecimal FEES_PER_KM = new BigDecimal(2.0);

    public double calculateExpense(double distance) {
        if (distance < 0.0)
            return -1;
        if (0.0 == distance)
            return 0.0;
        if (distance <= START_DISTANCE)
            return START_PRICE.doubleValue();
        else {
            BigDecimal fees = new BigDecimal(0.0);
            fees = fees.add(START_PRICE);
            fees = fees.add(FEES_PER_KM.multiply( new BigDecimal(distance - START_DISTANCE)));
            return fees.doubleValue();
        }
    }
}
