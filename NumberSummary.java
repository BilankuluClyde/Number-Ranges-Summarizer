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
    {
        String summarizedStr = "";
        
        return summarizedStr;
    }

    public static void main(String[] args) 
    {
        
    }

    
}
