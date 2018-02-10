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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        while (again == true)
        {
        //--------------- Objects declarations ---------------
        Messages messages = new Messages();
        TrigoCalculation trigo = new TrigoCalculation();
        //----------------------------------------------------
        option = messages.wellcome();
        //Options game
        switch (option)
        {
            case 1: trigo.mainGame();
                break;
            case 2:
                break;
            case 3:
                break;
        }
        //Play again: true or false
        again = messages.gameOver();
        }
    }
    
    
    /**
     * INSERER THE NUMBER OF TRIANGLES POUR COMPARER;
            * Coder avec des matrices puisque c'est possible d'entrer des nombre colonnes;
            * Le nombre des colonnes sera le nombre de triangles à comparer 
            * Le nombre de rangées sera constant parce que ce sont juste trois coté;
            * Changer la structure de la fonction wellcome pour entrer the nobre des
            * triangles et ses cotés;
     * CREER UNE SOUS CLASSE POUR COMPARER LES TRIANGLES LA COMPAHAISON PEUT ETRE FAIT PAR
     * DES BOUCLES EMBRIQUE;
            * La compahaison puet être fait pour des bucles embriqués problablement;
     * Faire une méthode description game pour une description des jeux;
     */
    
    
    
}
