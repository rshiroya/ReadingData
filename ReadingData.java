//write the two imports needed
import java.util.*;
import java.io.*;
/**
 *  This class has one method that
 *    asks the user to enter the name of an input data file
 *    opens that data file using a Scanner
 *    loops through the data file reading
 *       name of a product (can contain spaces)
 *       the number of items on hand of that product
 *       the cost of one item of that product
 *    the loop will count how many unique products there are
 *    the loop will accumulate the total worth of the inventory
 *    oune loops exits when all the data is read the program
 *    will print to the screen the values of the counter and the accumulator
 */

public class ReadingData
{
    //complete the main heading so main( ) can use a file
    public static void main(String[ ] args) throws IOException
    {
       
        
        //declare a reference for a Scanner to be used to read data from the keyboard
        Scanner keyboard;
        //declare a second reference for a Scanner to be used read data from a file
        Scanner read;
        //Declare a String reference variable to hold data
        //for the name of a file
        String inputFile;
        //Declare another String variable to read another 
        //String to hold a product name
        String productName;
        //declare an int variable to hold data for a quantity
        int quantity;
        //declare a double variable to hold data for a price
        double price;
        //declare variables for counters and accumulators
        int numberOfDistinctProducts;
        double totalWorth;
        //create a Scanner object for keyboard input
        keyboard = new Scanner(System.in);
        //ask user to enter the name of a file and store
        //the name of that variable in your String reference
        //variable
        System.out.print("Enter the name ofthe file: ");
        inputFile = keyboard.nextLine();
        //create the Scanner for file input using the file name the
        //user entered in the statement above
        read = new Scanner(new File(inputFile));
        //initialize counter and accumulator
        numberOfDistinctProducts = 0;
        totalWorth = 0;
        //write the while loop header that runs as long as
        //the Scanner has more data to read
        while(read.hasNext())
        {
            //read the value of the item name
            productName = read.nextLine();
            //read the value of the quantity
            quantity = read.nextInt();
            //read the value of the cost
            price = read.nextDouble();
            
           //update the counter of distinct products
           numberOfDistinctProducts = numberOfDistinctProducts + 1;
           //update the accumulator of total inventory worth
           totalWorth = totalWorth + (quantity * price);
        }
        //print the number of different products and total worth
        System.out.print("The number of different products are: " + numberOfDistinctProducts);
        System.out.print("\nThe total worth of the products are: " + totalWorth);    
            
        //close the data file stream
            read.close();
  }//end of main
        
}//end of ReadingFile class
