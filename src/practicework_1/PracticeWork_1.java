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
    static boolean again = true;
    //----------------------------------------

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        while (again == true)
        {
        //----------- Global variables assignement -----------
        SIZE = 3; MAT_SIZE = 4; COS = 0; SIN = 1; TAN = 2; ANGLES = 3;
        sides = new int [SIZE];
        matTrigo = new double [SIZE][MAT_SIZE];
        //-------------- Variables assignement ---------------
        String analyse;
        //--------------- Objects declarations ---------------
        Messages messages;
        Triangle triangle;
        Types types;
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
        //Constructor types for analyse of triangles
        types = new Types(sides, matTrigo[ANGLES]);
        analyse = types.analyse();
        //
        //prinTest(analyse);
        //printestMatrix(matTrigo);
        //
        messages.getDescription(analyse, matTrigo);
        //
        again = messages.gameOver();
        }
    }
    /**
     * @param type String to print
     */
    private static void prinTest(String test)
    { System.out.println(test); }
    private static void printestMatrix(double [][] matrix)
    {
        for(int i = 0; i < 4; i++)
        {
            System.out.print("------------\n");
            for(int j = 0; j < 3; j++)
            {
                System.out.print(matrix[i][j] + "\n");
            }
        }
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
