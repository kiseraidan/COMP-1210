import java.util.Comparator;

/**
* Class FlavorComparator implements the Comparator interface for BakedItem
* objects in order to find ordering of objects by flavor.
*
* Project 11
* @author Aidan Kiser - COMP1210 - 001
* @version 17 November 2022
*/
public class FlavorComparator implements Comparator<BakedItem> {

    /**
    * compare accepts two parameters: two different BakedItem objects. Then
    * defines the ordering from lowest to highest based on the flavor of the
    * baked item, and returns an int representing the order of the objects.
    *
    * @param b1 The first BakedItem object being compared.
    * @param b2 The second BakedItem object being compared.
    * @return The int that represents the order of the objects being compared.
    */
   public int compare(BakedItem b1, BakedItem b2) {
   
      return (b1.getFlavor().compareTo(b2.getFlavor()));
   }
}