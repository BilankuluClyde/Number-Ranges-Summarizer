package src;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberSummaryTest {


   


   
   @Test public void collectionMethodTest() {
      assertEquals(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)), new NumberSummary().collect("1,2,3,4,5"));
   }
}
