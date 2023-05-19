package src;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Collection;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberSummaryTest {

   @Test
   public void collectionMethodTest() {
      assertEquals(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)), new NumberSummary().collect("1,2,3,4,5"));
   }
   
   @Test
   public void collectionMethodTest2()
   {
      // Generating a string of numbers from 1 to 100 with a random choice of whether to include
      // the number as the string input or not
      String input = "";
      ArrayList<Integer> arrayList = new ArrayList<Integer>();
      boolean include = new Random().nextBoolean();
      for(int i = 1; i < 100; i++)
      {
         if(include)
         {
            arrayList.add(i);
            input += i + ","; 
         }
         include = new Random().nextBoolean();
      }
      arrayList.add(100);
      input += 100;
      assertEquals(arrayList, new NumberSummary().collect(input));
   }
   
   
   @Test
   public void collectionMethodTest3()
   {
      // Generating a string of numbers from 1 to 100 with a random choice of whether to include
      // the number as the string input or not
      String input = "";
      ArrayList<Integer> arrayList = new ArrayList<Integer>();
      boolean include = new Random().nextBoolean();
      for(int i = 1; i < 100; i++)
      {
         if(include)
         {
            arrayList.add(i);
            input += i + ","; 
         }
         include = new Random().nextBoolean();
      }
      arrayList.add(100);
      input += 100;
      assertEquals(arrayList.get(0), ((ArrayList) (new NumberSummary().collect(input))).get(0));
   }

   @Test
   public void summarizeCollectionTest()
   {
      NumberSummary test = new NumberSummary();
      assertEquals("1-5",  test.summarizeCollection(test.collect("1,2,3,4,5")));
   }
   
   @Test
   public void summarizeCollectionTest2()
   {
      NumberSummary test = new NumberSummary();
      assertEquals("1, 3, 6-8, 12-15, 21-24, 31",
      test.summarizeCollection(test.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31")));
   }
   
   @Test
   public void summarizeCollectionTest3()
   {
      NumberSummary test = new NumberSummary();
      assertEquals("1, 21-24, 31",
      test.summarizeCollection(test.collect("1,1,1,1,1,21,22,23,24,31")));
   }


}
