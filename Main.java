import java.util.Scanner;
/**
 * Inputs a bunch of numbers then says the largest
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user Inputs
    Scanner input = new Scanner(System.in);

    // ask the user to input 10 integers into an array
    System.out.println("Please enter in 10 integers to put into the array");

    // create a constant for number of integers
    final int NUM_INT = 10;

    // create an array with 10 spots
    int[] integer = new int[NUM_INT];

    // put integers into an array using a loop
    for(int i = 0; i < NUM_INT; i++){
      integer[i] = input.nextInt();
    }
    // create a variable for search
    int searchBig = integer[0];

    // use for loop to go through index to search for biggest number 
    for( int i = 0; i < NUM_INT; i++){
      if(searchBig < integer[i]){
        searchBig = integer[i];
      }
    }  
    // tell use
    System.out.println("The largest number is " + searchBig);
  
    

    
  }
}
