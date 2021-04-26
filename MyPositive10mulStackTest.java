//package com.company;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

  //  public class MyPositive10mulStackTest {

  /*      // positive flows

        //    void push(int item);
        //    int pop();
        //    int peek();
        //    void clear();
        //    int count();

        // atomic test
        @Test
        public void test_MyPositive10mulStack_push_pos1() {
            MyPositive10mulStack stack = new MyPositive10mulStack();
            stack.push(10);
            // non atomic
            //  assertEquals(1, stack.count());
            //  assertEquals(10, stack.peek());

            // atomic
            // how to check the push without using the interface!
            // stack.m_items -> size == 1
            // stack.m_items -> get(0) == 10
            // reflection
            try {
                // reflection in order to get the m_items.....
                ArrayList<Integer> m_items = null; // m_items
                Field privateStringField = null;
                privateStringField = MyPositive10mulStack.class.
                        getDeclaredField("m_items");
                ((Field) privateStringField).setAccessible(true);
                m_items = (ArrayList<Integer>) privateStringField.get(stack);
                // i got the m_items

                // assert
                //System.out.println("m_items = " + fieldValue.get(0));
                assertEquals(m_items.size(), 1);
                assertEquals((int) m_items.get(0), 10);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        public void test_MyPositive10mulStack_peek_pos1()
        {
            MyPositive10mulStack stack = new MyPositive10mulStack();
            stack.push(10);
            stack.push(30);
            int item = stack.peek();

           // non atomic
           // assertEquals(2,item);
           //assertEquals(10, stack.peek() );

            // atomic
            try {
                // reflection in order to get the m_items.....
                ArrayList<Integer> m_items = null; // m_items
                Field privateStringField = null;
                privateStringField = MyPositive10mulStack.class.
                        getDeclaredField("m_items");
                ((Field) privateStringField).setAccessible(true);
                m_items = (ArrayList<Integer>) privateStringField.get(stack);
                // i got the m_items

                // assert
                //System.out.println("m_items = " + fieldValue.get(0));
                assertEquals(m_items.size(), 1);
                assertEquals((int) m_items.get(0), 10);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        public void test_MyPositive10mulStack_pop_pos1()
        {
            MyPositive10mulStack stack = new MyPositive10mulStack();
            stack.push(10);
            stack.push(20);
            int item = stack.pop();

            // non atomic
            assertEquals(1, item);
            assertEquals(10, item);

        }
        public void test_MyPositive10mulStack_clear_pos1()
        {
            MyPositive10mulStack stack = new MyPositive10mulStack();
            stack.push(3);
            stack.clear();

            // non atomic
            assertEquals(0,stack.count() );
            //assertEquals(stack.peek(),0);

        }
        public void test_MyPositive10mulStack_count_pos1() {
            MyPositive10mulStack stack = new MyPositive10mulStack();
            stack.push(10);
            stack.push(3);
            stack.push(6);
            int counter = stack.count();

            // non atomic
            assertEquals(3,stack.count());
        }


        // negative flows
*/
 //   }
