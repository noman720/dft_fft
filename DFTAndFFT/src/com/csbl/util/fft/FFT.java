
package com.csbl.util.fft;

import com.csbl.util.Complex;
import com.csbl.util.MathUtils;
import java.text.DecimalFormat;

public class FFT {
    
    int []res;
    int index=0;
    private int[] getInputSequence(int [] a)
    {
        if(a.length ==1)
        {
            res[index] = a[0];
            //System.out.println(res[index]);
            index++;
        }   
        else
        {
            //even values
            int x[] = new int[a.length/2];
            int indexEven=0;
            for(int i=0; i<a.length; i+=2)
            {
                x[indexEven] = a[i];
                indexEven++;
            }

            getInputSequence(x);


            //odd values
            int y[] = new int[a.length/2];
            int indOdd=0;
            for(int i=1; i<a.length; i+=2)
            {
                y[indOdd] = a[i];
                indOdd++;
            }

            getInputSequence(y);
        }
        
        return res;
    }
    
    public Complex[] getActualInput(double [] userInput, int points)
    {
        res = new int[points];
        Complex [] actualInput = new Complex[points];
        int [] n = new int[points];
        for(int i=0; i<n.length; i++)
        {
            n[i]=i;
        }
        int [] inputSequence = getInputSequence(n);
        for(int i=0; i<points; i++)
        {
            actualInput[i] = new Complex(userInput[inputSequence[i]], 0);
        }
        
        return actualInput;
    }
    
    
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
    
    public Complex[] getOutput(Complex[] result, int points)
    {
        int stage = MathUtils.getPower(2, points);
        //Complex result[] = new Complex[points];
        
        for(int stg=0; stg<stage; stg++)
        {
            int d = MathUtils.getResultOfPower(2, stg);
            
            int flag[] = new int[256];
            int power = 0;
            Complex twiddleFactor = getTwiddleFactor(MathUtils.getResultOfPower(2, stg+1));
            for(int i=0; i<points; i++)
            {
                if((i+d)<points && flag[i]==0 && flag[i+d]==0)
                {
                    
                    if(power>=d)
                    {
                        power = 0;
                    }
                    
                    Complex a, b;
                    a = result[i].plus(result[i+d].times(twiddleFactor.pow(power)));
                    b = result[i].minus(result[i+d].times(twiddleFactor.pow(power)));
                    flag[i]=flag[i+d]=1;
                    
                    result[i] = a;
                    result[i+d] = b;
                    
                    power++;
                }
            }
        }
        
        
        return result;
    }
    
    
    
    /*
    public static void main(String args[])
    {
        int points = 8;
        
        FFT fft = new FFT();
        double userInput[] = {1,2,3,4,-4,-3,-2,-1};
        
        Complex input[] = fft.getActualInput(userInput, points);
        
        Complex[] output = fft.getOutput(input, points);
        
        for(int i=0; i<output.length; i++)
            System.out.println(output[i].toString());
        
        
        //System.out.println(MathUtils.getPower(3, 9));
        
        
    }
    
    */
    
}
