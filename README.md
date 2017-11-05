<div class="post_region_content note" id="view_quesiton_note">
        
<h1 data-pats="title_text" class="post_region_title">lab05 a54</h1>

<div class="post_region_text" id="questionText">Lab 05 (<strong>practice</strong> in-lab test)<br>Due tonight at midnight<br><br>Next week's lab, October 5th, we will have the first in-lab exam.<br><br><strong>Directions [IMPORTANT]</strong><br><br>This lab is just a practice in-lab exam, it will be graded as a lab under the lab category.<br><br>This lab will serve as practice for next week's in-lab programming test. In next week's test, you must use the <strong>lab machines</strong> and may <strong>not</strong> use the <strong>internet</strong> nor <strong>eclipse</strong>, only a text-editor and the command-line. You are strongly encouraged to try to complete this lab under such an environment, but of course you don't have to this week.<br>The format, and difficulty will be relatively similar to that of this week's lab. Keep in mind that next week's exam is <strong>in-lab</strong>, meaning you only have the 85 minutes to start and finish the exam.<br><br>All classes below go into the <code>lab05</code> package. Points deducted otherwise.<br><br>Submitting non-compiling code will be heavily penalized as we are unable to run (test) code that doesn't compile. If you're unable to get a particular piece of code to compile, comment it out such that your program compiles. Implement the classes and methods as is, do not change their names, or change the function signatures. Do not <em>add</em> any methods not asked for.<br><br>A Tester is provided to you at the bottom of the directions for you to run your attempts at. Be aware though that the tests are basic; passing all the tests does <strong>not</strong> imply a 100% grade. There are cases the Tester does not test that you are required to fulfill. Therefore, you are encouraged to add your own tests to the Tester to better test your solutions.<br><h1>Question 1</h1><br><ul><li>Create a class <code><span style="font-family:monospace">Division</span></code> with one private field: an <code><span style="font-family:monospace">ArrayList&lt;Double&gt;</span></code> named <code><span style="font-family:monospace">list</span></code>.<br><ul><li>Initialize <code>list</code> to an empty ArrayList in the declaration</li></ul>
</li><li>Create a constructor that takes in <code>double[] array</code> as a parameter and adds each double in <code>array</code> to <code>list</code><br><ul><li>if <code>array</code> is null or empty, throw an <code>IllegalArgumentException</code> with a message <code>"need to enter an array with at least one double"</code></li></ul>
</li><li>Create a method <code>public void removeZeroes()</code> which removes all zeroes from <code>list</code></li><li>Create a method <code>public void divide(int divisor)</code><br><ul><li>Replaces each entry in list with that entry divided by <code>divisor</code></li><li>if <code>divisor</code> is zero, throw an <code>IllegalArgumentException</code> with a message <code>"cannot divide by zero"</code></li><li>For example, if <code>list</code> is [1,2,3,4,5,6,7,8,9] and <code>divisor</code> is 2, after the call <code>list</code> will be [0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5]  </li></ul>
</li><li><br>Override the <code>toString</code> method that returns list.toString();<br><br></li></ul>
<h1>Question 2</h1><br><ul><li>Create a class <code>FunWithStrings</code> with no fields</li><li>Implement the method <code>public static void swapMaxes(ArrayList&lt;String&gt; list1, ArrayList&lt;String&gt; list2)</code><br><ul><li>you can assume <code>list1</code> and <code>list2</code> will not be null nor will they be empty</li><li>you can also assume that each non-null String in <code>list1</code> and <code>list2</code> will all have different lengths<br><ul><li>if a String contained in either ArrayList is null, ignore it and continue searching for the longest String</li></ul>
</li><li>find the longest String in <code>list1</code> (need a way to store the String and the index it is at)</li><li>find the longest String in <code>list2</code> (need a way to store the String and the index it is at)</li><li>swap the longest Strings between the two arrayLists</li><li>For Example, given ["to", "cellphone", "truck", "fire"] and ["delicious", "copper", "blue", "red"], after this method is called  <code>list1</code> will be ["to", "delicious", "truck", "fire"] and <code>list2</code> will be  ["cellphone", "copper", "blue", "red"]</li></ul>
</li></ul>
<h1>Question 3</h1><br><ul><li>Create a class <code>Zipper</code> with no fields.</li><li>Implement the method <code>public static int[] zip(int[] arr1, int[] arr2)</code><br><ul><li>If either <code>arr1</code> or <code>arr2</code> is null, or they do <em>not</em> have the same length, throw an <code>IllegalArgumentException</code> with a message <code>"bad input"</code></li><li>This method should return an array that alternates between the elements of <code>arr1</code> and <code>arr2</code> in the order they appear in their arrays.</li><li>For example, given {1, 3, 5, 7} and {2, 4, 6, 8}, {1, 2, 3, 4, 5, 6, 7, 8} should be returned</li><li>Return an empty array if empty arrays are given.</li></ul>
</li></ul>
<h1>Tester</h1><br>Below is a minimal <code>Tester</code> class, you can use as is. However, it only tests the most basic cases, you should add your own cases to make sure all aspects of your methods are correct.<br><pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">package</span><span class="pln"> lab05</span><span class="pun">;</span><span class="pln">

</span><span class="kwd">import</span><span class="pln"> java</span><span class="pun">.</span><span class="pln">util</span><span class="pun">.</span><span class="typ">Arrays</span><span class="pun">;</span><span class="pln">
</span><span class="kwd">import</span><span class="pln"> java</span><span class="pun">.</span><span class="pln">util</span><span class="pun">.</span><span class="typ">ArrayList</span><span class="pun">;</span><span class="pln">

</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">class</span><span class="pln"> </span><span class="typ">Tester</span><span class="pln"> </span><span class="pun">{</span><span class="pln">

    package lab05;

import java.util.Arrays;
import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
    	testDivision();
    	testFunWithStrings();
        testZipper();
    }

    public static void testDivision() {
        Division set = new Division(new double[]{1,2,3,0,4,5,0,6,0,7,8,9,0});
        set.removeZeroes();
        set.divide(2);
        System.out.println("Expecting [0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5]");
        System.out.println("Received  " + set + "\n");
        
    }

    public static void testFunWithStrings() {
    	ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("to", "cellphone", "truck", "fire"));
    	ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("delicious", "copper", "blue", "red"));
    	FunWithStrings.swapMaxes(list1, list2);
        System.out.println("Expecting [to, delicious, truck, fire] [cellphone, copper, blue, red]");
        System.out.println("Received  " + list1 + " " + list2 + "\n");
    }

    public static void testZipper() {
        int ret[] = Zipper.zip(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8});
        System.out.println("Expecting [1, 2, 3, 4, 5, 6, 7, 8]");
        System.out.println("Received  " + Arrays.toString(ret));
    }
}
</span><span class="pun">}</span></pre><br></div>
<div data-pats="folders" class="post_region_folders">
  <span>
    <span data-pats="folders_item"><a data-pats="link" href="#" class="tag folder" onclick="PEM.fire('filterFeed', {filter:'folder',folder:'lab5'});return false;">lab5</a></span><span data-pats="folders_item"><a data-pats="link" href="#" class="tag folder" onclick="PEM.fire('filterFeed', {filter:'folder',folder:'a54'});return false;">a54</a></span>
  </span>
</div>
<div class="attachments" style="display:none;">
  <div class="attachments_divider"></div>
  <div class="attachments_count">Attachments:</div>
  <table class="attachments_list">
    
  </table>
</div>
<div class="post_region_message_wrapper">
  <div id="endorse_text"></div>
  
  
  

     
