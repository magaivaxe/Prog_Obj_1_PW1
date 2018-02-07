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
    final int SIZE;
    //----------------------------------------
    /**
     * @param SIZE Sides array size that is used to save the sides triangle.
     */
    public Messages (final int SIZE) { this.SIZE = SIZE; }
    //-------- Objects declarations ----------
    ReadInteger read = new ReadInteger();
    //----------------------------------------
    /**
     * @return sides array values.
     */
    public int[] wellcome()
    {
        //Local variables
        int [] sides = new int [SIZE];
        final String [] SIDE_NAMES = {"AB", "BC", "CA"};
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
            int side = read.trueSide(SIZE);
            //Add side to array sides
            sides[i] = side;
        }
        return sides;
    }
    /**
     * 
     * @param args The arguments to play again
     */
    public void gameOver(String[] args)
    {
        //Local variables
        boolean ok;
        //
        System.out.println("------------------------------------------------\n"
                        +  "                    GAME OVER                   \n" +
                           "------------------------------------------------\n"
                        +  "Are you play again? 0 is not 1 is yes...\n");
        //
        ok = read.yesOrNot();
        //
        if (ok) { PracticeWork_1.main(args);
        }
        else {System.out.println("Good bye!"); }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
