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
public class TrigoCalculation 
{
    //----------- Global Variables -----------
    private final int SIZE, MAT_SIZE, ANGLES;
    private double area;
    private int [] sides;
    private double [][] matTrigo;
    private String analyse;
    //----------------------------------------
    
    //------------ Constructors --------------
    public TrigoCalculation()
    {
        SIZE = 3; MAT_SIZE = 4; ANGLES = 3;
        sides = new int [SIZE];
        matTrigo = new double [SIZE][MAT_SIZE];
    }
    //----------------------------------------
    
    //--------- Objects declarations ---------
    private Triangle triangle;
    private Types types;
    private Messages messages = new Messages();
    private ReadInteger read;
    private SetTriangles setTriangles;
    private Descriptions describe = new Descriptions();
    //----------------------------------------
    /**
     * Trigo calculation game
     */
    public void mainGame()
    {
        sides = triangleSides();
        //Triangle object stribution
        triangle = new Triangle(sides);
        //Area calculation
        area = triangle.getArea();
        //Triganometry values calculation
        matTrigo = triangle.setTrigonometry();
        //Constructor types for analyse of triangles
        types = new Types(sides, matTrigo[ANGLES]);
        analyse = types.analyse();
        //
        describe.getDescription(analyse, area, matTrigo);
    }
    
    /**
     * This function calculate the side values of one triangle.
     * @return The triangle sides values array.
     */
    private int [] triangleSides()
    {
        //Local variables
        int [] sidesToReturn;
        //Game announce
        messages.showGame("TRIGO CALCULATION", "Set sides");
        //
        read = new ReadInteger("0: NO and 1: YES.", "Enter 0 or 1 values!");
        //If true set triangle sides else sides equals to 1
        if(read.yesOrNot()){} 
        else { sidesToReturn = new int []{1,1,1}; return sidesToReturn; }
        //Object atribution
        setTriangles = new SetTriangles(SIZE);
        //Set the sides triangle
        sidesToReturn = setTriangles.setSides();
        //Triangle object to call the function triangle inequality
        triangle = new Triangle(sidesToReturn);
        //If true return the sides, else return function to reset
        if (triangle.triangleInequality()) { return sidesToReturn; }
        else 
        {
            System.out.print("Triangle inequality don't respected.\n");
            return triangleSides();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
