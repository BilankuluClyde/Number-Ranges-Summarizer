import java.util.ArrayList;
import java.util.Collection;
import numberrangesummarizer.NumberRangeSummarizer;


public class NumberSummary implements NumberRangeSummarizer
{
    @Override
    public Collection<Integer> collect(String input) 
    {
        // Simple solution
        // Assuming the list is provided already sorted
        ArrayList<Integer> intCollection = new ArrayList<Integer>();

        for(String number: input.split(","))
        {
            intCollection.add(Integer.parseInt(number));
        }

        return intCollection;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) 
    // Method will receive collection : {1,3,6,7,8,12,13,14,15,21,22,23,24,31}
    {
        String summarizedStr = "Resutlt: ";
        boolean sequential = false, withinRange = false;
        Integer previous = input.
        for(Integer number : input)
        {
            if(number == previous)
            {
                continue;
            }
        }
        return summarizedStr;
        // Output must be in the form : {1, 3, 6-8, 12-15, 21-24, 31}
    }

    public static void main(String[] args) 
    {
        
    }

    
}
