/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicework_1;
/**
 *
 * @author Marcos Gomes Practice work 1
 */
public class PracticeWork_1
{
    //----------- Global Variables -----------
    private static int option;
    private static boolean again = true;
    //----------------------------------------
    
    //-------- Objects declarations ----------
    static Messages messages;
    static TrigoCalculation trigo;
    static EqualsOrSimilars equalsOrSimilars;
    //----------------------------------------
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        while (again)
        {
        // Objects atributions
        messages = new Messages();
        trigo = new TrigoCalculation();
        equalsOrSimilars = new EqualsOrSimilars();
        //
        option = messages.wellcome();
        //Options game
        switch (option)
        {
            case 1: trigo.mainGame();
                break;
            case 2: equalsOrSimilars.mainEqualsOrSimilars();
                break;
            case 3:
                break;
        }
        //Play again: true or false
        again = messages.gameOver();
        }
    }
    
    
    /**
     * 
     *
     * 
     */
    
    
    
}
