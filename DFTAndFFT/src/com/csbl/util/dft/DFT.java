
package com.csbl.util.dft;

import com.csbl.util.Complex;
import java.text.DecimalFormat;

public class DFT {
    
    private Complex getTwiddleFactor(int points)
    {   
        //System.out.println("Twiddle Factor For "+points+" points in DFT is:");
        //System.out.println("--------------------------");
        DecimalFormat df2 = new DecimalFormat("###.###");
        int degrees = (int)(2*180)/points;
        double real = Double.valueOf(df2.format(Math.cos(Math.toRadians(degrees))));
        double imag = Double.valueOf(df2.format(-Math.sin(Math.toRadians(degrees))));   
        //System.out.println(new Complex(real, imag).toString()+"\n");
        return new Complex(real, imag);
    }
          
    
    private Complex[][] getMatrix(int points)
    {
        Complex twiddleFactor = getTwiddleFactor(points);
        //System.out.println("Twiddle Factor Matrix for DFT is:");
        //System.out.println("--------------------------");
        
        Complex [][] matrix = new Complex[points][points];
        for(int m=0; m<points; m++)
        {
            for(int n=0; n<points; n++)
            {
                int power = m*n;
                matrix[m][n] = twiddleFactor.pow(power);
                //System.out.print(matrix[m][n].toString()+"\t");
            }
            //System.out.println();
        }
        
        //System.out.println();
        return matrix;
    }
    
    
    public Complex[] getOutput(int points, double input[])
    {
        
        Complex[][] matrix = getMatrix(points);
        //double input[] = inp;
        //System.out.println("Inputed Value for DFT is: ");
        //System.out.println("--------------------------");
        /*
        for(int i=0; i<points; i++)
            System.out.print(input[i]+", ");
        System.out.println("\n");
        System.out.println("Output Value For DFT is:");
        System.out.println("--------------------------");
        */
        Complex [] output = new Complex[points];
        for(int m=0; m<points; m++)
        {
            Complex sum = new Complex(0, 0);
            for(int n=0; n<points; n++)
            {
                sum = sum.plus(matrix[m][n].times(input[n]));
            }
            output[m] = sum;
            
            //System.out.println(sum.toString());
        }
        
        return output;
    }
    
    /*
    public static void main(String arg[])
    {
        DFT dft = new DFT();
        /*
        System.out.println(Math.sin(Math.toRadians(90d)));
        System.out.println(Math.cos(Math.toRadians(0d)));
        System.out.println(Math.tan(Math.toRadians(0d)));
        
        //System.out.println(dft.getTwiddleFactor(4).toString());
        //dft.getMatrix(4);
        
        long lStartTime = System.nanoTime();
	
        dft.getOutput(4);
	
        long lEndTime = System.nanoTime();
 
	long difference = lEndTime - lStartTime;
 
	System.out.println("\nElapsed milliseconds: " + difference/1000000);
        
        
        
        
    }
    
    */
    
    
    
}
