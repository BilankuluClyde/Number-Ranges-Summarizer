package src;

import numberrangesummarizer.NumberRangeSummarizer;
import java.util.ArrayList;
import java.util.Collection;


/**
 * @author Mpfuno Clyde Bilankulu
 * Class implements the NumberRangesSummarizer interface. The class contains methods
 * allowing it to obtain string or Collection<Integer> data from the user to use the 
 * summarizeCollection method to return a comma deliminated string of numbers. 
 * Sequential numbers are grouped in ranges.
 */

public class NumberSummary implements NumberRangeSummarizer
{
    // Global Variables

    // Constructors

     /*
      * Default constructor
      * Constructor to be used to initialize global variables to null values when 
      * an instance of the class is created without any data passed as parameters.
      */
     public NumberSummary()
     {
       
     }

    // Methods
    
    /**
     * Converts and returns user input given as a string into a Collection of Interger data.
     * 
     * @param input String in the form of a comma deliminated list of integers
     * @return A Collection<Integer> containing input string list of Integers after casting them to Integer
     * @Override
     */
    
    public Collection<Integer> collect(String input) 
    {
        // Simple solution
        // Assuming the list is provided already sorted
        Collection<Integer> intCollection = new ArrayList<Integer>();

        for(String number: input.split(","))
        {
            intCollection.add(Integer.parseInt(number));
        }

        return intCollection;
    }

    /**
     * Returns a summarized string of integers. Sequential numbers are grouped
     * in ranges, where as other non sequential numbers are comma deliminated.
     * <p>
     * This methods assumes that the provided input Collection of Integers does
     * not contain duplicated integers and is sorted in ascending order.
     * 
     * @param input A comma separated list of Integers represented as a Collection
     * @return A comma separated list of Integers with grouped ranges of sequential numbers
     * @Override
     */
    
    public String summarizeCollection(Collection<Integer> input)
    {
        String summarizedStr = "";
        boolean sequential = false;
        Integer previous = ((ArrayList<Integer>)input).get(0);
         
        for(Integer number : input)
        {
            /* If we add 1 to the previous number and the previous number is still less than the current 
             * number, then the previous number is obviously not sequential, thus we cant group it
             * We then just need to add the previous number and a comma for the next number.
             */
            if(previous + 1 < number)
            {
                sequential = false;
                summarizedStr += previous.toString() + ", ";
                previous = number; // Set previous to the value of the current number before incrementing.
            }
            /* Else if the numebers are equal after adding 1 to the previous number then the numbers are 
             * sequential 
             */
            else if (previous + 1 == number)
            {
                if (sequential)
                {
                    previous = number; // Change value of previous number to currrent number and continue with loop
                }
                else
                {
                    summarizedStr += previous + "-";
                    sequential =  true;
                    previous = number;
                }

            }
            /*
             * Else the previous number and the current number are the equal, therefore we do not have to do
             * anything but continue looping through the collection.
             */
        }
        return summarizedStr + previous.toString();
    }


    
}
