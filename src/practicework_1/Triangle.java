/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicework_1;

/**
 * 
 * @author Marcos Paulo Salgado Gomes
 */
public class Triangle
{
    //---------- Constructor Variables ----------
    final int [] SIDES;
    private final int SIZE = 3;
    //Triangle's sides indexes and angles indexes
    final int AB = 0, BC = 1, CA = 2, A = 0, B = 1, C = 2;
    //----------- Class constructor -------------
    public Triangle(int [] sides) { this.SIDES = sides; }
    //------------ Global variables -------------
    private double sumAngles;
    private double [] arrayCos, arraySin, arrayTan, arrayAngles;
    private double [][] matTrigo;
    //-------------------------------------------
    /**
     * 
     * @return True if the inequality is respected.
     */
    public boolean triangleInequality()
    { return (SIDES[AB] < SIDES[BC] + SIDES[CA] &&
              SIDES[BC] < SIDES[AB] + SIDES[CA] &&
              SIDES[CA] < SIDES[AB] + SIDES[BC]); }
    /**
     * @return Perimeter that have the side array sum value
     */
    public double getPerimeter()
    {
        //Local variables
        double perimeter = 0.0;
        //Loop to perimeter concatenation
        for (int i = 0; i < SIDES.length; i++)
        {
            perimeter += (double) SIDES[i];
        }
        return perimeter;
    }
            
    /**
     * @AREA It is the triangle area.
     * @P is the Héron coefficient that is difined as perimeter / 2.
     * @return the area
     */
    public double getArea()
    {
        //Local variables
        final double P, AREA;
        //p - Héron's coefficient
        P = getPerimeter() / 2;
        //Calculus according to Héron's law; 
        AREA = Math.sqrt(P * (P - SIDES[AB]) * (P - SIDES[BC]) * (P - SIDES[CA]));
        return AREA;
    }
    
    /**
     * 
     * @return The Cos, Sin, Tan and Angles arrays by a matrix respectively
     */
    public double [][] setTrigonometry()
    {
        //Local declarations and variables
        arrayCos = new double [SIZE];
        arraySin = new double [SIZE];
        arrayTan = new double [SIZE];
        arrayAngles = new double [SIZE];
        final double EXP = 2;
        double CA2, AB2, BC2;
        //Sides powered by 2
        CA2 = Math.pow(SIDES[CA], EXP);
        AB2 = Math.pow(SIDES[AB], EXP);
        BC2 = Math.pow(SIDES[BC], EXP);
        //Set cos array
        arrayCos[A] = (CA2 + AB2 - BC2)/(EXP * SIDES[CA] * SIDES[AB]);
        arrayCos[B] = (AB2 + BC2 - CA2)/(EXP * SIDES[AB] * SIDES[BC]);
        arrayCos[C] = (BC2 + CA2 - AB2)/(EXP * SIDES[BC] * SIDES[CA]);
        //Sin and tan arrays loop
        for (int i = 0; i < arrayCos.length; i++)
        {
            //By the Pythagorean identity cos^2(x) + sin^2(x) = 1
            arraySin[i] = Math.sqrt(1 - Math.pow(arrayCos[i], EXP));
            //By the arcsin(x) the angles are calculated
            arrayAngles[i] = Math.toDegrees(Math.asin(arraySin[i]));
            //Angles concatenation 
            sumAngles += arrayAngles[i];
            //By the Pythagorean identity tan^2(x) = sec^2(x) - 1
            arrayTan[i] = Math.sqrt(1 / (Math.pow(arraySin[i], EXP)) - 1);
        }
        //Atribution to the trigonometry matrix 
        matTrigo = new double [][]{arrayCos, arraySin, arrayTan, arrayAngles};
        return matTrigo;
    }
    
}
