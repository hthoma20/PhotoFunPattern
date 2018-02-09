package edu.up.cs371.epp.photofunpattern;

import android.graphics.Color;

/**
 *  class GrayFilter changes the image manipulation behavior of its parent
 *  PhotoFilter to convert the image to gray scale.
 *
 *  @author Edward C. Epp
 *  @version November 2017
 *  https://github.com/edcepp/PhotoFunPattern
 */

public class SmoothFilter extends PhotoFilter {

    /*
    * tranformPixel This method overrides the transformPixel in the parent
    * class. It transforms a color pixel to gray by averaging its three RGB
    * components.
    *
    * @param inPixel is a 32 bit pixel that contains RGB color values
    * @return a new Pixel in which each of the RGB components is their averaged
    * value
    */
    public int transformPixel(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {
        int option= 2;
        int outPixel= p4;

        if(option == 1){

        }
        else if(option == 2){
            int otherReds= Color.red(p0)+Color.red(p1)+Color.red(p2)+Color.red(p3)+Color.red(p5)
                    +Color.red(p6)+Color.red(p7)+Color.red(p8);
            int otherGreens= Color.green(p0)+Color.green(p1)+Color.green(p2)+Color.green(p3)+Color.green(p5)
                    +Color.green(p6)+Color.green(p7)+Color.green(p8);
            int otherBlues= Color.blue(p0)+Color.blue(p1)+Color.blue(p2)+Color.blue(p3)+Color.blue(p5)
                    +Color.blue(p6)+Color.blue(p7)+Color.blue(p8);

            otherReds/= 10;
            otherGreens/= 10;
            otherBlues/= 10;

            int thisRed= Color.red(p4)/5;
            int thisGreen= Color.green(p4)/5;
            int thisBlue= Color.blue(p4)/5;

            outPixel= Color.rgb(otherReds+thisRed,otherGreens+thisGreen,otherBlues+thisBlue);
        }
        else if(option == 3){

        }
        return outPixel;
    }

}
