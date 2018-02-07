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
     * Function to analyse the triangle types
     */
    public void analyse()
    {     
        // Equilateral triangle-----------------------------------
        isEquilateral = itsEquilateral();
        // Equilateral condition
        if (isEquilateral) { answer("Equilateral triangle."); return; }
        // Rectangle triangle------------------------------------
        isRetangle = itsRetangle();
        // Retangle condition
        if (isRetangle)
        {
            answer("Triangle retangle");
            //Isoceles triangle
            isIsoceles = itsIsoceles();
            //Isoceles condition
            if (isIsoceles) { answer(" and isoceles too."); }
            //Scalene triangle condition
            else { answer(" and scalene too."); }
            return;
        }
        //Isoceles triangle---------------------------------------
        isIsoceles = itsIsoceles();
        //Isoceles condition
        if (isIsoceles && !isEquilateral) { answer(" It is isoceles."); }
        // Scalene triangle---------------------------------------
        isScalene = itsScalene();
        if (isScalene) { answer("Scalene triangle."); }
        
    }
    /**
     * @param type String to print
     */
    private void answer(String type)
    { System.out.println(type); }
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
    {
        for (int i = 0; i < ANGLES.length; i++)
        { return ANGLES[i] == 90; }
        return false;     
    }
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
