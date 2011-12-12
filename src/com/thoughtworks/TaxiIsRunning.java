package com.thoughtworks;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: 9527
 * Date: 11-12-12
 * Time: 下午5:51
 * To change this template use File | Settings | File Templates.
 */
public class TaxiIsRunning {
    public static void main(String[] args) {
        if (args.length != 1){
            for(String arg :args){
                System.out.println(arg);
            }
            System.out.println("Please Enter like this:\n" +
                    "java -jar [filename] [distance]");
            System.exit(-1);
        }
        double distance = Double.parseDouble(args[0]);
        TaxiAcountingSystems tas = new TaxiAcountingSystems();
        double fees = tas.calculateExpense(distance);
        System.out.println("Total cost:" + fees);
    }
}
