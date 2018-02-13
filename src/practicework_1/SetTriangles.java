/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicework_1;

/**
 *
 * @author sire_marcos
 */
public class SetTriangles 
{
    //----------- Global Variables -----------
    private final int SIZE, OP_YES, OP_NOT, A, B, C;
    final String [] SIDE_NAME, ANGLE_NAME;
    //----------------------------------------
    
    //------------- Constructors -------------
    /**
     * @param size of size array to add the data sides
     */
    public SetTriangles () 
    { 
        SIZE = 3; OP_NOT = 0; OP_YES = 1; A = 0; B = 1; C = 2;
        SIDE_NAME = new String [] {"AB", "BC", "CA"};
        ANGLE_NAME = new String [] {"A", "B", "C"};
    }
    
    //-------- Objects declarations ----------
    ReadInteger readYesOrNot;
    ReadInteger readSides;
    ReadInteger readAngles;
    Triangle triangle;
    //----------------------------------------
    
    /**
     * This function calculate the side values of one triangle.
     * @param msg String passed to show messages for enter numbers
     * @return The triangle sides values array.
     */
    public int [] triangleSides(String msg)
    {
        //Local variables
        int [] sidesToReturn; String msgReturn = msg;
        //
        readYesOrNot = new ReadInteger(msg, "Enter 0 or 1 values!");
        //If true set triangle sides else sides equals to 1
        if(readYesOrNot.yesOrNot(OP_YES, OP_NOT)){} 
        else { sidesToReturn = new int []{1,1,1}; return sidesToReturn; }
        //Set the sides triangle
        sidesToReturn = setSides();
        //Triangle object to call the function triangle inequality
        triangle = new Triangle(sidesToReturn);
        //If true return the sides, else return function to reset
        if (triangle.triangleInequality()) { return sidesToReturn; }
        else 
        {
            System.out.print("Triangle inequality don't respected.\n");
            return triangleSides(msgReturn);
        }
    }
    /**
     * 
     * @return 
     */
    public int [] setSides()
    {
        //Local variables
        int [] sides = new int [SIZE];
        //Object atribution
        readSides = new ReadInteger("Enter triangle side:",
                               "It isn't a side");
        //Loop to set sides 
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Side " + (SIDE_NAME[i]) + ": ");
            //Add side to array sides
            sides[i] = readSides.trueSide();
        }
        return sides;
    }
    /**
     * 
     * @param nSides
     * @return 
     */
    public double [] setPartialSides(int nSides)
    {
        //local variables
        double [] sides = new double [SIZE]; int count = 0;
        //Object atribution
        readYesOrNot = new ReadInteger("0: Not or 1: Yes", "It isn't 0 ot 1.");
        readSides = new ReadInteger("Enter triangle side:",
                               "It isn't a side");
        //Loop question
        int i = 0; while (i < SIZE)
        {            
            System.out.println(
                    "Enter the side" + SIDE_NAME[i] + "?");
            boolean yes = readYesOrNot.yesOrNot(OP_YES, OP_NOT);
            if(yes)
            {
                System.out.println("Side " + (SIDE_NAME[i]) + ": ");
                //Side is > 0 else side = 1
                sides[i] = readSides.trueSide();
                count++;
            }
            else 
            {
                sides[i] = 0;
            }
            i++;
        }
        //if don't return the correct number of sides recall the function
        if (count == nSides) { return sides; }
        else 
        { 
            System.out.println("Enter " + nSides + " sides!");
            return setPartialSides(nSides);
        }
    }
    /**
     * 
     * @param nAngles Number of angles that the function will return
     * @return the angles array with B value and A = 0 and C = 0
     * or A and B values and C = 0
     */
    public double [] setPartialAngles(int nAngles)
    {
        double [] angles = new double[SIZE];
        //
        readAngles = new ReadInteger("Enter triangle angle:",
                               "It isn't a angle");
        //
        if (nAngles == 2)
        {
            for (int i = 0; i < nAngles; i++) 
            {
                System.out.println("Angle " + (ANGLE_NAME[i]) + ": ");
                //Side is > 0 else side = 1
                angles[i] = (double)readAngles.trueSide();
            }
            angles[C] = 0;
        } 
        else 
        {
            System.out.println("Angle " + (ANGLE_NAME[B]) + ": ");
            //Side is > 0 else side = 1
            angles[B] = (double)readAngles.trueSide();
            angles[A] = 0; angles[C] = 0;
        }
        return angles;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
