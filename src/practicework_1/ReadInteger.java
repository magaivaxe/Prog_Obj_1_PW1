/*
*
*/
package practicework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author eleves
 */
public class ReadInteger
{
    /**
     * @return the integer value entry on terminal
     */
    private int readInteger()
    {
        int entry = 0;
        while (entry != -1)
        {
            System.out.println("Enter a positive integer:");
            try
            {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                entry = Integer.parseInt(bufferedReader.readLine());
                return entry;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Ceci n'est pas un entier!");
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
     * @return The bool if ok = 1 0r 0
     */
    public boolean yesOrNot()
    {
        //
        int ok = readInteger();
        //
        if (ok != 0 || ok != 1) { yesOrNot(); }
        //
        else 
        {
            //
            return ok != 0;
        }
        return false;
    }
}
