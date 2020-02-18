/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passgenjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TechCogs
 */
public class Passgenjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String VERSION = "1.0";
        var in = new Scanner(System.in);
        var rand = new Random();
        int length = 0;
        int charType = 0;
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] symbols = {"@", "^"};
        String password = "";
        System.out.println("PassGenJava v" + VERSION);
        System.out.print("Enter length of desired password>");
        try {
            length = Integer.parseInt(in.nextLine());
        }
        catch(Exception e) {
            System.out.println("Usage:  Enter a number");
            System.exit(1);
        }
        for(int l = 0; l < length; l++) {
            charType = rand.nextInt(100);
            if (charType < 25) {
                password += numbers[rand.nextInt(numbers.length)];
            }
            else if (charType >= 25 && charType < 50) {
                password += symbols[rand.nextInt(symbols.length)];
            }
            else {
                String c = letters[rand.nextInt(letters.length)];
                if (rand.nextInt(100) < 50) {
                    c = c.toUpperCase();
                }
                password += c;
            }
        }
        System.out.println("New password:  " + password);
    }
    
}
