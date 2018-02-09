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
     * @param size Size array to add the data sides
     * @param sides Array to add the sides values
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
     * 
     * @return The option value to main
     */
    public int wellcome()
    {
        int option;
        System.out.print("Wellcome to TRIANGLE'S GAME!!!"
                       + "What do you want to play?"
                       + "1 - Trigo Calculation."
                       + "2 - Equals or Similars."
                       + "3 - Find angles or sides");
        //
        read = new ReadInteger("Enter the options.", "It doesn't the option.");
        return option = read.playOptions();
    }
    /**
     * @return sides array values.
     */
    public int [] trigoCalculation()
    {
        System.out.println("------------------------------------------------\n"
                        +  "                Trigo calculation               \n" +
                           "------------------------------------------------\n"
                         + "Do you want set triangle sides?");
        //
        read = new ReadInteger("0 to not and 1 to yes.", "Enter 0 or 1 values.");
        //If true set triangle sides else sides equals to 1
        if(read.yesOrNot()){} 
        else { return sides = new int []{1,1,1}; }
        //Object atribution
        setTriangles = new SetTriangles(SIZE);
        //Set the sides triangle
        sides = setTriangles.setSides();
        //Triangle object to call the function triangle inequality
        triangle = new Triangle(sides);
        //If true return the sides, else return wellcome to recall
        if (triangle.triangleInequality()) { return sides; }
        else 
        {
            System.out.print("Triangle inequality don't respected.\n");
            return trigoCalculation();
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
     * @param area the triangle area claculated by the class Triangle
     * @param matTrigo the matrix that have trigo values: cos, sin, tan and angles
     */
    public void getDescription(String type, double area, final double [][] matTrigo)
    { 
        //Local variables
        final int COS, SIN, TAN, ANGLES;
        COS = 0; SIN = 1; TAN = 2; ANGLES = 3;
        //
        System.out.print("The " + type + " has area = "+ area +""
                       + "and trigonometrics datas:\n");
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
    
    
    
    
    
    
    
    
    
    
   

