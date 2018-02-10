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
                       + "What do you want to play?\n"
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
     * Function to know if the player goes play again or not.
     * @return true if the player goes player again else false
     */
    public boolean gameOver()
    {
        //Object to read the yes or not
        read = new ReadInteger("0: NO and 1: YES.",
                               "The number isn't 0 or 1.");
        //Local variables
        boolean ok;
        showGame("GAME OVER", "Play again");
        // Atribution true or false to ok
        ok = read.yesOrNot();
        return ok;
    }
    
    public void showGame(String gameName, String question)
    {
        System.out.println("------------------------------------------------\n"
                        +  "                "+ gameName +     "\n"
                        +  "------------------------------------------------\n"
                        +  question + "?");
    }
    
    
  
    
    
  
    
    
}
    
    
    
    
    
    
    
    
    
    
   

