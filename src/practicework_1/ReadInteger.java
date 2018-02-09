/*
*
*/
package practicework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Rebecca and modified by your student Marcos Paulo Salgado Gomes
 */
public class ReadInteger
{
    //------- Contructor variables ---------
    private final String RIGTH_TEXT, WRONG_TEXT;
    //--------------------------------------
    
    public ReadInteger(String rigthText, String wrongText)
    {
        this.RIGTH_TEXT = rigthText;
        this.WRONG_TEXT = wrongText;
    }
    
    /**
     * @return the integer value entry on terminal
     */
    private int readInteger()
    {
        int entry = 0;
        while (entry != -1)
        {
            System.out.println(RIGTH_TEXT);
            try
            {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                entry = Integer.parseInt(bufferedReader.readLine());
                return entry;
            }
            catch (NumberFormatException e)
            {
                System.out.println(WRONG_TEXT);
            }
            catch (IOException e)
            {
                e.printStackTrace();
                return entry;
            }
        }
        return entry;
    }
    /**
     * 
     * @return The values 1 to trigo, 2 to equals or similars, 3 angles and sides calculus
     */
    public int playOptions()
    {
        int op = readInteger();
        //Conditions to assign op
        if (op == 1 || op == 2 || op == 3) {}
        else {playOptions();}
        return op;
    }
    /**
     * @param side the triangle side value
     * @return true if side is greater than 0
     */
    public int trueSide(int side)
    {
        //
        side = readInteger();
        //
        if (side > 0) { return side;}
        //
        else {side = 1; return side;}
    }
    /**
     * 
     * @return true if ok = 1 else false to ok = 0
     */
    public boolean yesOrNot()
    {
        //Receive the value from readInteger
        int ok = readInteger();
        //Condition to read 1 and 0
        if (ok == 1 || ok == 0) {} else { yesOrNot();}
        return ok == 1;
    }
}
