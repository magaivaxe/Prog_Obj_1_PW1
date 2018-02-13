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
    
    //----------------------------------------
    
    //------------- Constructors -------------
    /**
     * Constructor void
     */
    public Messages () { }
    
    //-------- Objects declarations ----------
    private ReadInteger read;
    //----------------------------------------
    /**
     * 
     * @return The option value to main
     */
    public int wellcome()
    {
        int option;
        System.out.print("Wellcome to TRIANGLE'S GAME!!!\n"
                       + "Choice your destiny:\n"
                       + "1 - Trigo Calculation;\n"
                       + "2 - Equals or Similars;\n"
                       + "3 - Find angles or sides;\n"
                       + "4 - Games descriptions.\n");
        //
        read = new ReadInteger("Enter your option:", 
                               "It doesn't an option.");
        return option = read.playOptions();
    }
    /**
     * 
     * @return 0 if choose "Two sides and one angle" and
     * return 1 if choose "One side and two angles".
     */
    public int wellcomeAnglesSides()
    {
        //Local variables
        int twoSidesOneSide = 0; int oneSideTwoAngles = 1;
        //Object to read the options
        read = new ReadInteger("Enter 0 or 1:", "It isn't 0 or 1.");
        //
        boolean option;
        System.out.print("0 - Two sides and one angle;\n"
                       + "1 - One side and two angles;\n");
        //
        option = read.yesOrNot(oneSideTwoAngles, twoSidesOneSide);
        //
        if (option) { return oneSideTwoAngles;}
        else { return twoSidesOneSide; }
    }
    /**
     * Function to know if the player goes play again or not.
     * @return true if the player goes player again else false
     */
    public boolean gameOver()
    {
        //
        int op1 = 1; int op2 = 0;
        //Object to read the yes or not
        read = new ReadInteger("0: NO and 1: YES.",
                               "It isn't 0 or 1.");
        //Local variables
        boolean ok;
        showGame("GAME OVER", "Play again");
        // Atribution true or false to ok
        ok = read.yesOrNot( op1, op2);
        return ok;
    }
    
    public void showGame(String gameName, String question)
    {
        System.out.print("------------------------------------------------\n"
                        +  "                "+ gameName +     "\n"
                        +  "------------------------------------------------\n"
                        +  question + "\n");
    }
    /**
     * 
     */
    public void gameDescriptions()
    {
        //
        showGame("GAMES DESCRIPTIONS", "");
        //
        System.out.println(
                "TRIGO CALCULATION:\n\n"
                        + "\tCalculate each angle trigonometric parameters\n"
                        + "as sin, cos, tan and geometric parameters as the\n"
                        + " perimeter and area.\n\n"
                + "EQUALS OR SIMILARS:\n\n"
                        + "\tCompare two triangles to know if they are \n"
                        + "mathematically equals or similars.\n\n"
                + "ANGLES OR SIDES:\n\n"
                        + "\tCalculate the triangle trigonometric parameters\n"
                        + "from two sides and one angle orfrom one side \n"
                        + "and two angles.\n");
    }
  
    
    
  
    
    
}
    
    
    
    
    
    
    
    
    
    
   

