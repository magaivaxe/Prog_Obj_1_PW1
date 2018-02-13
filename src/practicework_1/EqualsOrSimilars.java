/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicework_1;

/**
 *
 * @author sire_marcos
 */
public class EqualsOrSimilars
{
    //----------- Global Variables -----------
    private final int TRI_N, TRIANGLE1, TRIANGLE2, SIZE, MAT_SIZE, ANGLES;
    private int [][] trianglesSides;
    private double [][] matTrigo1, matTrigo2;
    //----------------------------------------
    
    /**
     * Constrtuctor from Equals ans Similars
     */
    public EqualsOrSimilars()
    {
        TRI_N = 2; TRIANGLE1 = 0; TRIANGLE2 = 1;
        SIZE = 3; MAT_SIZE = 4; ANGLES = 3;
        trianglesSides = new int[SIZE][TRI_N];
        matTrigo1 = new double[SIZE][MAT_SIZE];
        matTrigo2 = new double[SIZE][MAT_SIZE];
    }
    
    
    //--------- Objects declarations ---------
    private Triangle triangle1, triangle2;
    private Messages messages;
    private SetTriangles setTriangles;
    private Descriptions describe;
    //----------------------------------------
    
    /**
     * 
     */
    public void mainEqualsOrSimilars()
    {
        //Objects atributions
        setTriangles = new SetTriangles();
        messages = new Messages();
        describe = new Descriptions();
        //Game announce
        messages.showGame("EQUALS OR SIMILARS", "Set sides of triangles?");
        //Set the triangles 1 and 2
        trianglesSides[TRIANGLE1] = setTriangles.triangleSides("First - 0: NO and 1: YES.");
        trianglesSides[TRIANGLE2] = setTriangles.triangleSides("Second - 0: NO and 1: YES.");
        //Triangles objects atributions
        triangle1 = new Triangle(trianglesSides[TRIANGLE1]);
        triangle2 = new Triangle(trianglesSides[TRIANGLE2]);
        //Triangles trigonometries values calculation
        matTrigo1 = triangle1.setTrigonometry();
        matTrigo2 = triangle2.setTrigonometry();
        //
        boolean equals = theyAreEquals(trianglesSides[TRIANGLE1], trianglesSides[TRIANGLE2]);
        //
        boolean similars = theyAreSimilars(matTrigo1[ANGLES], matTrigo2[ANGLES]);
        //
        if (equals)
        {
            describe.descriptionEqOrSim("They are equals.");
        } 
        else if (!equals && similars) 
        {
            describe.descriptionEqOrSim("They are similars.");
        }
        else { describe.descriptionEqOrSim("They are not equals or similars."); }
    }
    /**
     * This method will compare all triangles sides. If any side
     * are equal it will be = 0 and it will not be counted again. 
     * @return true if the three sides of triangles are equals.
     */
    private boolean theyAreEquals(int [] sides1, int [] sides2)
    {
        //Counter to count the equals sides
        int count = 0;
        //Bricked loop for check if are equals
        for (int i = 0; i < sides1.length; i++)
        {
            for (int j = 0; j < sides2.length; j++)
            {
                if (sides1[i] == sides2[j] &&
                    sides1[i] != 0 && sides2[j] != 0)
                {
                    sides1[i] = 0; sides2[j] = 0;
                    count++;
                }
            }
        }
        return count == 3;
    }
    /**
     * This method will compare all triangles angles. If any side
     * are equal it will be = 0 and it will not be counted again.
     * @return true if the three angles of triangles are equals.
     */
    private boolean theyAreSimilars(double [] angles1, double [] angles2)
    {
        //Counter to count equals angles
        int count = 0;
        //
        for (int i = 0; i < angles1.length; i++) 
        {
            for (int j = 0; j < angles2.length; j++)
            {
                if (angles1[i] == angles2[j] &&
                    angles1[i] != 0 && angles2[j] != 0) 
                {
                    angles1[i] = 0; angles2[j] = 0;
                    count++;
                }
            }  
        }
        return count == 3;
    }
}
