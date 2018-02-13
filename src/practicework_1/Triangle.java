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
    int [] sides;
    private final int SIZE = 3;
    private final double EXP = 2;
    private final double TOTAL_SUM = 180;
    private double CA2, AB2, BC2;
    //Triangle's sides indexes and angles indexes
    final int AB = 0, BC = 1, CA = 2, A = 0, B = 1, C = 2;
    //----------- Class constructor -------------
    public Triangle(int [] sides) { this.sides = sides; }
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
    { return (sides[AB] < sides[BC] + sides[CA] &&
              sides[BC] < sides[AB] + sides[CA] &&
              sides[CA] < sides[AB] + sides[BC]); }
    /**
     * @return Perimeter that have the side array sum value
     */
    public double getPerimeter()
    {
        //Local variables
        double perimeter = 0.0;
        //Loop to perimeter concatenation
        for (int i = 0; i < sides.length; i++)
        {
            perimeter += (double) sides[i];
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
        AREA = Math.sqrt(P * (P - sides[AB]) * (P - sides[BC]) * (P - sides[CA]));
        return AREA;
    }
    
    /**
     * 
     * @return The Cos, Sin, Tan array with precision +-0.0001 
     * and Angles arrays with precision +-00.1 by a matrix respectively
     */
    public double [][] setTrigonometry()
    {
        //Local declarations and variables
        arrayCos = new double [SIZE];
        arraySin = new double [SIZE];
        arrayTan = new double [SIZE];
        arrayAngles = new double [SIZE];
        //Sides powered by 2
        CA2 = Math.pow(sides[CA], EXP);
        AB2 = Math.pow(sides[AB], EXP);
        BC2 = Math.pow(sides[BC], EXP);
        //Set cos array
        arrayCos[A] = (CA2 + AB2 - BC2)/(EXP * sides[CA] * sides[AB]);
        arrayCos[B] = (AB2 + BC2 - CA2)/(EXP * sides[AB] * sides[BC]);
        arrayCos[C] = (BC2 + CA2 - AB2)/(EXP * sides[BC] * sides[CA]);
        //Sin and tan arrays loop
        for (int i = 0; i < arrayCos.length; i++)
        {
            //By the Pythagorean identity cos^2(x) + sin^2(x) = 1
            arraySin[i] = Math.sqrt(1 - Math.pow(arrayCos[i], EXP));
            //By the arcsin(x) the angles are calculated
            arrayAngles[i] = Math.round(Math.toDegrees(Math.asin(arraySin[i]))* 10) / 10;
            //Angles concatenation 
            sumAngles += arrayAngles[i];
            //By the Pythagorean identity tan^2(x) = sec^2(x) - 1
            arrayTan[i] = Math.sqrt(1 / (Math.pow(arraySin[i], EXP)) - 1);
        }
        //Atribution to the trigonometry matrix 
        matTrigo = new double [][]{arrayCos, arraySin, arrayTan, arrayAngles};
        return matTrigo;
    }
    /**
     * 
     * @param arrayAngles
     * @param theSide
     * @return 
     */
    public double [][] setPartialTrigonometry(double [] arrayAngles, int theSide)
    {
        //Variables locaux and declarations
        double [] arraySides = new double [SIZE];
        arrayCos = new double[SIZE];
        arraySin = new double[SIZE];
        //Array converted to double
        arraySides = convertIntToDouble(sides);
        //Sides powered by 2
        CA2 = Math.pow(arrayAngles[CA], EXP);
        AB2 = Math.pow(arrayAngles[AB], EXP);
        BC2 = Math.pow(arrayAngles[BC], EXP);
        //Calculate cos(B) and sin(B)
        arrayCos[B] = Math.cos(arrayAngles[B]);
        arraySin[B] = Math.sin(arrayAngles[B]);
        //Choice the side to calculate AB = 0; BC = 1; CA = 2
        switch(theSide)
        {
            //Calculate side AB
            case 0:
                //Calculus sin(A) from triangle height relationship
                arraySin[A] = arraySin[B] * arraySides[BC] / arraySides[CA];
                //Calculus cos(A) from trigonometric identity
                arrayCos[A] = Math.sqrt(1 - Math.pow(arraySin[A], EXP));
                //Angle A from arcsin(A)
                arrayAngles[A] = Math.asin(arraySin[A]);
                //Angle C from triangle's law: A + B + C = 180
                arrayAngles[C] = TOTAL_SUM - arrayAngles[B] - arrayAngles[A];
                //Cos calculus from angle C
                arrayCos[C] = Math.cos(arrayAngles[C]);
                //Sin(C) calculus from cos(C)
                arraySin[C] = Math.sqrt(1 - Math.pow(arrayCos[C], EXP));
                //Side AB calculus
                arraySides[AB] = Math.sqrt(BC2 + CA2 - 2 * sides[BC] * sides[CA] * arrayCos[C]);
                break;
            //Calculat side BC
            case 1:
                //Calculus sin(C) from triangle height relationship
                arraySin[C] = arraySin[B] * arraySides[AB] / arraySides[CA];
                //Cos(C) calculus from sin(C)
                arrayCos[C] = Math.sqrt(1 - Math.pow(arraySin[C], EXP));
                //Angle C from arcsin(C)
                arrayAngles[C] = Math.asin(arraySin[C]);
                //Angle A from triangle's law: A + B + C = 180
                arrayAngles[A] = TOTAL_SUM - arrayAngles[B] - arrayAngles[C];
                //Calculate cos(A) from angle A
                arrayCos[A] = Math.cos(arrayAngles[A]);
                //Sin(A) calculus from cos(A)
                arraySin[A] = Math.sqrt(1 - Math.pow(arrayCos[A], EXP));
                //Calculate side BC by cos law
                arraySides[BC] = Math.sqrt(CA2 + AB2 - 2 * sides[CA] * sides[AB] * arrayCos[A]);
                break;
            //Calculate side CA
            case 2:
                //Side CA calculus
                arraySides[CA] = Math.sqrt(AB2 + BC2 - 2 * sides[AB] * sides[BC] * arrayCos[B]);
                //With all sides, cos calculus
                arrayCos[A] = (CA2 + AB2 - BC2)/(EXP * arraySides[CA] * arraySides[AB]);
                arrayCos[C] = (BC2 + CA2 - AB2)/(EXP * arraySides[BC] * arraySides[CA]);
                //
                arraySin[A] = Math.sqrt(1 - Math.pow(arrayCos[A], EXP));
                arraySin[C] = Math.sqrt(1 - Math.pow(arrayCos[C], EXP));
                //
                arrayAngles[A] = Math.asin(arraySin[A]);
                arrayAngles[C] = Math.asin(arraySin[C]);
                
                break;
        }
        //Atribution to the trigonometry matrix 
        matTrigo = new double [][]{arrayCos, arraySin, arraySides, arrayAngles};
       
        return matTrigo;
    }
    /**
     * Function used to convert an array int to double
     * @param arrayToConvert array type int to convert
     * @return array type double
     */
    private double [] convertIntToDouble(int [] arrayToConvert)
    {
        //Variables locaux
        double [] arrayToReturn = new double [SIZE];
        //loop to convert double to int
        for (int i = 0; i < SIZE; i++)
        {
            arrayToReturn[i] = (double) arrayToConvert[i];
        }
        return arrayToReturn;
    }
    /**
     * 
     * @param arraySides
     * @return 
     */
    public int rechercheSide(int [] arraySides)
    {
        //
        int sideToReturn = 0;
        for (int i = 0; i < arraySides.length; i++) 
        {
            if (arraySides[i] == 0)
            {
                return i;
            }
        }
        return sideToReturn;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
