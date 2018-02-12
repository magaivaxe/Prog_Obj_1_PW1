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
    private final int SIZE;
    //----------------------------------------
    
    //------------- Constructors -------------
    /**
     * @param size of size array to add the data sides
     */
    public SetTriangles (int size) { this.SIZE = size; }
    
    //-------- Objects declarations ----------
    ReadInteger read;
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
        read = new ReadInteger(msg, "Enter 0 or 1 values!");
        //If true set triangle sides else sides equals to 1
        if(read.yesOrNot()){} 
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
        final String [] SIDE_NAMES = {"AB", "BC", "CA"};
        //Object atribution
        read = new ReadInteger("Enter the triangle side:",
                               "This isn't a triangle side");
        //Loop to set sides 
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Side " + (SIDE_NAMES[i]) + ": ");
            //Side is > 0 else side = 1
            int side = read.trueSide(SIZE);
            //Add side to array sides
            sides[i] = side;
        }
        return sides;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
