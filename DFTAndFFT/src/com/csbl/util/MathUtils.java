
package com.csbl.util;

import java.text.DecimalFormat;

public class MathUtils {

    public static int getPower(int base, int result)
    {
        return (int)(Math.log10(result)/Math.log10(base));
    }
    
    public static int getResultOfPower(int base, int power)
    {
        if(power == 0)
            return 1;
        else
        {
            int result = 1;
            for(int i=0; i<power; i++)
                result = base*result;
        
        return result;
        }
        
    }
    
    public static String getComplexAsString(Complex c) {
        
        DecimalFormat df2 = new DecimalFormat("###.##");
        double im = Double.valueOf(df2.format(c.im()));
        double re = Double.valueOf(df2.format(c.re()));
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im <  0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }
    
    public static String getDoubleAsString(double value) {
        DecimalFormat df2 = new DecimalFormat("###.##");
        return Double.valueOf(df2.format(value))+"";
        
    }
    
    /*
    public static void main(String args[])
    {
        System.out.println(getResultOfPower(2, 2));
    }
    */
}
