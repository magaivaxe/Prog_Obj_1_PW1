/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicework_1;

/**
 * @author eleves
 */
public class Messages
{
    //----------- Global Variables -----------
    private final int size;
    //----------------------------------------
    
    //------------- Constructors -------------s
    /**
     * @param size
     */
    public Messages (int size) { this.size = size; }
    
    //-------- Objects declarations ----------
    ReadInteger read;
    //----------------------------------------
    /**
     * @return sides array values.
     */
    public int[] wellcome()
    {
        //Local variables
        int [] sides = new int [size];
        final String [] SIDE_NAMES = {"AB", "BC", "CA"};
        //Object to read sides
        read = new ReadInteger("Enter the triangle side:",
                               "This isn't a triangle side");
        //
        System.out.println("------------------------------------------------\n"
                        +  "              Triangle calculation              \n" +
                           "------------------------------------------------\n"
                        +  "Enter the sides!\n");
        //Loop to set sides 
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Side " + (SIDE_NAMES[i]) + ": ");
            //Side is > 0 else side = 1
            int side = read.trueSide(size);
            //Add side to array sides
            sides[i] = side;
        }
        //Triangle object to call the function triangle inequality
        Triangle triangleMsg = new Triangle(sides);
        //If true return the sides, else return wellcome to recall
        if (triangleMsg.triangleInequality()) { return sides; }
        else 
        {
            System.out.print("Triangle inequality don't respected.\n");
            //
            return wellcome();
        }
    }
    /**
     * Function to know if the player goes play again or not.
     * @return true if the player goes player again else false
     */
    public boolean gameOver()
    {
        //Object to read the yes or not
        read = new ReadInteger("0 to don't play and 1 to play.",
                               "The number isn't 0 or 1.");
        //Local variables
        boolean ok;
        System.out.println("\n------------------------------------------------\n"
                        +  "                    GAME OVER                   \n" +
                           "------------------------------------------------\n"
                        +  "Are you play again?\n");
        // Atribution true or false to ok
        ok = read.yesOrNot();
        return ok;
    }
    /**
     * 
     * @param type
     * @param matTrigo
     */
    public void getDescription(String type, final double [][] matTrigo)
    { 
        //
        final int COS, SIN, TAN, ANGLES;
        COS = 0; SIN = 1; TAN = 2; ANGLES = 3;
        // 0 <= i < 4. i: cos, sin, tan, angles
        for (int i = 0; i < matTrigo[ANGLES].length; i++)
        {
            //
            switch (i) 
            {
            //
                case 0:
                    //
                    System.out.print("The triangle is a " + type +" and has:\n");
                    //
                    for (int j = 0; j < matTrigo[ANGLES].length; j++)
                    {
                        System.out.print("cos(" + matTrigo[ANGLES][j] + ") = " + matTrigo[COS][j] + "\t");
                    }  
                    break;
            //
                case 1:
                    //
                    System.out.print("\n");
                    //
                    for (int j = 0; j < matTrigo[ANGLES].length; j++)
                    {
                        System.out.print("sin(" + matTrigo[ANGLES][j] + ") = " + matTrigo[SIN][j] + "\t");
                    }   
                    break;
                case 2:
                    //
                    System.out.print("\n");
                    //
                    for (int j = 0; j < matTrigo[ANGLES].length; j++)
                    {
                        System.out.print("tan(" + matTrigo[ANGLES][j] + ") = " + matTrigo[TAN][j] + "\t");
                    }   
                    break;
                default:
                    //
                    System.out.print("\n");
                    return;
            }
            
        }
        
    }

  
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
   

