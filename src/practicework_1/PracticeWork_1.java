/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicework_1;

/**
 *
 * @author Marcos Gomes Main function
 */
public class PracticeWork_1
{
    //----------- Global Variables -----------
    private static int SIZE, MAT_SIZE, COS, SIN, TAN, ANGLES;
    static int [] sides;
    static double [][] matTrigo;
    static double [] arrayAngles;
    //----------------------------------------

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //-------------- Variables assignement ---------------
        SIZE = 3; MAT_SIZE = 4; COS = 0; SIN = 1; TAN = 2; ANGLES = 3;
        sides = new int [SIZE];
        matTrigo = new double [SIZE][MAT_SIZE];
        //--------------- Objects declarations ---------------
        Messages messages;
        Triangle triangle;
        Types types;
        ReadInteger read;
        //----------------------------------------------------
        //Messages object atribution
        messages = new Messages(SIZE);
        //Sides values from user
        sides = messages.wellcome();
        //Triangle object stribution
        triangle = new Triangle(sides);
        //Area calculation
        triangle.getArea();
        //Triganometry values calculation
        matTrigo = triangle.setTrigonometry();
        //
        types = new Types(sides, matTrigo[ANGLES]);
        types.analyse();
        messages.gameOver(args);
    }
    
    /**
     * INSERER THE NUMBER OF TRIANGLES POUR COMPARER ET CHANGER LA CLASSE READINTEGER;
            * Coder avec des matrices puisque c'est possible d'entrer des nombre colonnes;
            * Le nombre des colonnes sera le nombre de triangles à comparer 
            * Le nombre de rangées sera constant parce que ce sont juste trois coté;
            * Changer la structure de la fonction wellcome pour entrer the nobre des
            * triangles et ses cotés;
     * SEPARER LA FONCTION ANALYSE FROM TRIANGLE AND CREER UNE SOUSCLASSE TRIANGLE TYPE;
            * Le constructor sera base sur les données da la classe triangle; 
     * CREER UNE SOUS CLASSE POUR COMPARER LES TRIANGLES LA COMPAHAISON PEUT ETRE FAIT PAR
     * DES BOUCLES EMBRIQUE;
            * La compahaison puet être fait pour des bucles embriqués problablement;
     * INSERER LE HUITIÉME ITEM QUI EST LA DRESCRIPTION DANS LA CLASSE MESSAGES;
     * CREATE A CONSTRUCTOR VIDE TO SIDES EQUALS TO 1.
     */
    
    
    
}
