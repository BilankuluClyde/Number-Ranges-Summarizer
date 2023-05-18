import java.util.ArrayList;
import java.util.Collection;
import numberrangesummarizer.NumberRangeSummarizer;


public class NumberSummary implements NumberRangeSummarizer
{
    /*
     * Global Variables
     */

     // Constructors

     /*
      * Default constructor
      * Constructor to be used to initialize global variables to null values when 
      * an instance of the class is created without any data passed as parameters.
      */
     public NumberSummary()
     {

     }

    /*
    * Methods
    */
    @Override
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
     * @param input A comma separated list of Integers represented as a Collection
     * @return A comma separated list of Integers with grouped ranges of sequential numbers
     */
    @Override
    public String summarizeCollection(Collection<Integer> input) 
    // Method will receive collection : {1,3,6,7,8,12,13,14,15,21,22,23,24,31}
    {
        String summarizedStr = "Resutlt: ";
        boolean sequential = false, notInRange = true;
        Integer previous = ((ArrayList<Integer>)input).get(0);
        for(Integer number : input)
        {
            /* If we add 1 to the previous number and the previous number is still less than the current 
             * number, then the previous number is obviously not sequential, thus we cant group it
             * We then just need to add the previous number and a comma for the next number.
             */
            if(previous + 1 < number)
            {
                notInRange = true;
                sequential = false;
                summarizedStr = previous.toString() + ", ";
                previous = number; // Set previous to the value of the current number before incrementing.
            }
            /* Else if the numebers are equal after adding 1 to the previous number then the numbers are 
             * sequential 
             */
            else if (previous + 1 == number)
            {
                if (sequential)
                {
                    previous = number;
                    continue;
                }
                else
                {
                    summarizedStr += previous + "-";
                    sequential =  true;
                    previous = number;
                }

            }
            else if(previous == number && !sequential)
            {
                continue;
            }
            
            summarizedStr += "o" + number.toString();

            summarizedStr += ", ";
        }
        return summarizedStr;
        // Output must be in the form : {1, 3, 6-8, 12-15, 21-24, 31}
    }


    
}
