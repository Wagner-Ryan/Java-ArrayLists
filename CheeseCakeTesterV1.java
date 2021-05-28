import java.util.ArrayList;
/**
 * 2/22/2021
 * Ryan Wagner
 * Print out arraylist values
 */

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declaring an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
        
        CheeseCakeV1 cake1 = new CheeseCakeV1("Blueberry", 5);
        CheeseCakeV1 cake2 = new CheeseCakeV1("Strawberry", 6);
        CheeseCakeV1 cake3 = new CheeseCakeV1("Cherry", 4);
        CheeseCakeV1 cake4 = new CheeseCakeV1("Jalapeno", 1);
        CheeseCakeV1 cake5 = new CheeseCakeV1("Dill Pickle", 2);
        CheeseCakeV1 cake6 = new CheeseCakeV1("Fig", 3);

        // add CheeseCake to the ArrayList
        cake.add(cake1);
        cake.add(cake2);
        cake.add(cake3);
        cake.add(cake4);
        cake.add(cake5);
        cake.add(cake6);
        
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
            dataRecord.calcSugar();
        }
        
        //printing the format of the table
        System.out.println(" |       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println(" |-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;
        
        //using a for loop to print out the objects' data
        for(CheeseCakeV1 cc: cake)
        {
            System.out.println("     " + cake.indexOf(cc) + "        " + cc);
        }
    }
}
