package com.company;

public class Main {

    public static void main(String[] args)
    {

        // ex. 2

//        int w = 1;
//        int price = 0;
//
//        if (w <= 2)
//            price = 3;
//        else if (w <= 5)
//            price = w + (w - 1);
//        if (w > 5)
//            price = 3 * (w - 5) + 9;
//
//        System.out.println (price);



        // ex. 4

//        boolean value = false;
//        int n = 0;
//        while (!value)
//        {
//            if ((n*n*n + 91) % 47 == 0)
//                value = true;
//
//            else n++;
//        }
//
//        System.out.println(n);



        // ex. 5

//        int t = 0;
//        int BacteriaAfter1hour;
//        int BacteriaAfter2hours;
//        int BiggestDecrInNumbrOfBactFromPrevHour = 0;
//        int result = 0;
//
//        while (t < 100)
//        {
//            BacteriaAfter1hour = t * (t - 20) * (t - 100) + 120000;
//            BacteriaAfter2hours = (t + 1) * ((t + 1) - 20) * ((t + 1) - 100) + 120000;
//
//            if (t == 0)
//            {
//                BiggestDecrInNumbrOfBactFromPrevHour = BacteriaAfter2hours - BacteriaAfter1hour;
//                result = t + 1;
//            }
//
//            else
//            {
//                if (BacteriaAfter2hours - BacteriaAfter1hour < BiggestDecrInNumbrOfBactFromPrevHour)
//                {
//                    BiggestDecrInNumbrOfBactFromPrevHour = BacteriaAfter2hours - BacteriaAfter1hour;
//                    result = t + 1;
//                }
//            }
//
//            t = t + 1;
//        }
//
//        System.out.println (result);

    }
}
