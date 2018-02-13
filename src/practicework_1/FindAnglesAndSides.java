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
public class FindAnglesAndSides
{
    //----------- Global Variables -----------
    private final int SIZE, MAT_SIZE, AB, BC, CA, A, B, C, ONE, TWO;
    private int [] sides;
    private double [] angles;
    private double [][] matTrigo;
    //----------------------------------------
    
    public FindAnglesAndSides()
    {
        SIZE = 3; MAT_SIZE = 4; AB = 0; BC = 1; CA = 2;
        A = 0; B = 1; C = 2; ONE = 1; TWO = 2;
        sides =  new int [SIZE]; angles = new double[SIZE];
        matTrigo = new double[SIZE][MAT_SIZE];
    }
    
    //--------- Objects declarations ---------
    Messages messages;
    SetTriangles setTriangles;
    Triangle partialTriangle;
    //----------------------------------------
    
    /**
     * 
     */
    public void mainFindAnglesAndSides()
    {
        //
        messages = new Messages();
        setTriangles = new SetTriangles();
        //
        messages.showGame("FIND ANGLES OR SIDES", "What do you have");
        //
        switch (messages.wellcomeAnglesSides())
        {
            //Two sides one angle
            case 0:
                sides = setTriangles.setPartialSides(TWO);
                angles = setTriangles.setPartialAngles(ONE);
                partialTriangle = new Triangle(sides);
                int theSide1 = partialTriangle.rechercheSide(sides);
                matTrigo = partialTriangle.setPartialTrigonometry(angles, theSide1);
                break;
            //One side two angles
            case 1:
                sides = setTriangles.setPartialSides(ONE);
                angles = setTriangles.setPartialAngles(TWO);
                partialTriangle = new Triangle(sides);
                int theSide2 = partialTriangle.rechercheSide(sides);
                matTrigo = partialTriangle.setPartialTrigonometry(angles, theSide2);
                break;
        }
       
    }
}
