/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicework_1;

/**
 *
 * @author eleves
 */
public class Types extends Triangle
{
    //Global variables
    private final double [] ANGLES;
    private boolean isEquilateral, isIsoceles, isScalene, isRetangle;
    
    /**
     * 
     * @param SIDES sides array from superclass 
     * @param ANGLES
     */
    public Types(int [] SIDES, double [] ANGLES)
    {
        super(SIDES);
        this.ANGLES = ANGLES;
    }
    
    /**
     * @return The triangles types: Equilateral; Retangle; Isoceles; Scalene.
     */
    public String analyse()
    {     
        // Equilateral triangle-----------------------------------
        isEquilateral = itsEquilateral();
        // Equilateral condition
        if (isEquilateral) { return "equilateral triangle"; }
        // Rectangle triangle------------------------------------
        isRetangle = itsRetangle();
        // Retangle condition
        if (isRetangle)
        {
            String textA = "retangle triangle";
            //Isoceles triangle
            isIsoceles = itsIsoceles();
            //Isoceles condition
            if (isIsoceles) { String textB = "isoceles "; return textB + textA; }
            //Scalene triangle condition
            else { String textC = "scalene "; return textC + textA; }
        }
        //Isoceles triangle---------------------------------------
        isIsoceles = itsIsoceles();
        //Isoceles condition
        if (isIsoceles && !isEquilateral) { return "isoceles triangle"; }
        // Scalene triangle---------------------------------------
        isScalene = itsScalene();
        if(isScalene) { return "scalene triangle"; }
        else {return "This is not a triangle.";}
    }
    /**
     * @return true if the triangle is equilateral.
     */
    private boolean itsEquilateral()
    {return (SIDES[super.AB] == SIDES[super.BC] &&
             SIDES[super.BC] == SIDES[super.CA] &&
             SIDES[super.AB] == SIDES[super.CA]); }
    /**
     * @return true if any angle value is 90
     */
    private boolean itsRetangle()
    {return (ANGLES[super.A] == 90 ||
             ANGLES[super.B] == 90 ||
             ANGLES[super.C] == 90);}
    /**
     * @return True if two sides are equals
     */
    private boolean itsIsoceles()
    { return (SIDES[super.AB] == SIDES[super.BC] ||
              SIDES[super.BC] == SIDES[super.CA] ||
              SIDES[super.AB] == SIDES[super.CA]); }
    /**
     * @return True if all sides are differents
     */
    private boolean itsScalene()
    { return (SIDES[super.AB] != SIDES[super.BC] &&
              SIDES[super.BC] != SIDES[super.CA] &&
              SIDES[super.AB] != SIDES[super.CA]); }   
    
    
    
}
