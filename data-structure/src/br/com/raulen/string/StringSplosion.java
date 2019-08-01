package br.com.raulen.string;

/* 
 * Solve all problems with the less lines possible, remember the SOLID Principles
 * 
 * Create a function that, given any non-empty string, returns a string where each character is concocted with each of the preceding characters.
 * 
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
*
*
* stringSplosion("Code") → "CCoCodCode"
* stringSplosion("abc") → "aababc"
* stringSplosion("ab") → "aab" */

public class StringSplosion {

    public static void main(String[] args) {

        splosion("Elefante do João");

    }

    private static void splosion(String word) {
        String result = "";

        //While the word have lenght bigger than 0, continue de loop
        while (word.length() > 0) {

            //Give the value for result, concocted value On Each Interation of loop
            result = result + word.concat(result.replace(" ", ""));

            //Remove the last character while loop is executing
            //Its necessary new attribution, because String ia final class
            word = word.substring(0, word.length() - 1);
        }

        //Print the result
        System.out.println(result);
    }

}
