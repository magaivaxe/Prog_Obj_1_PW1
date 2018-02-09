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
    private final int SIZE;
    private int [] sides;
    //----------------------------------------
    
    //------------- Constructors -------------
    /**
     * @param size of size array to add the data sides
     */
    public Messages (int size, int [] sides) 
    {
        this.SIZE = size; this.sides = sides;
    }
    
    //-------- Objects declarations ----------
    ReadInteger read;
    SetTriangles setTriangles;
    Triangle triangle;
    //----------------------------------------
    /**
     * @return sides array values.
     */
    public int[] wellcome()
    {
        System.out.println("------------------------------------------------\n"
                        +  "              Triangle calculation              \n" +
                           "------------------------------------------------\n");
        //
        setTriangles = new SetTriangles(SIZE);
        //
        sides = setTriangles.setSides();
        //Triangle object to call the function triangle inequality
        triangle = new Triangle(sides);
        //If true return the sides, else return wellcome to recall
        if (triangle.triangleInequality()) { return sides; }
        else 
        {
            System.out.print("Triangle inequality don't respected.\n");
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
        System.out.print("\n------------------------------------------------\n"
                      +  "                    GAME OVER                   \n" +
                         "------------------------------------------------\n"
                      +  "Are you play again?\n");
        // Atribution true or false to ok
        ok = read.yesOrNot();
        return ok;
    }
    /**
     * 
     * @param type the triangle type calculated by the class Types
     * @param matTrigo the matrix that have trigo values: cos, sin, tan and angles
     */
    public void getDescription(String type, final double [][] matTrigo)
    { 
        //Local variables
        final int COS, SIN, TAN, ANGLES;
        COS = 0; SIN = 1; TAN = 2; ANGLES = 3;
        //
        System.out.print("The triangle is a " + type +" and has:\n");
        // 0 <= i < 4. i: cos, sin, tan, angles
        for (int i = 0; i < matTrigo[ANGLES].length; i++)
        {
            //
            switch (i) 
            {
            //
                case 0:
                    System.out.print("------------------------------\n");
                    //
                    for (int j = 0; j < matTrigo[ANGLES].length; j++)
                    {
                        System.out.print("cos(" + matTrigo[ANGLES][j] + ") = " + matTrigo[COS][j] + "\n");
                    }  
                    break;
            //
                case 1:
                    System.out.print("------------------------------\n");
                    //
                    for (int j = 0; j < matTrigo[ANGLES].length; j++)
                    {
                        System.out.print("sin(" + matTrigo[ANGLES][j] + ") = " + matTrigo[SIN][j] + "\n");
                    }   
                    break;
                case 2:
                    System.out.print("------------------------------\n");
                    //
                    for (int j = 0; j < matTrigo[ANGLES].length; j++)
                    {
                        System.out.print("tan(" + matTrigo[ANGLES][j] + ") = " + matTrigo[TAN][j] + "\n");
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
    
    
    
    
    
    
    
    
    
    
   

