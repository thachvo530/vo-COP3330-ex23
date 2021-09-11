

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String choice = scan.next();

        if (choice.equals("y")) {

            System.out.print("Are the battery terminals corroded? ");
            choice = scan.next();

            if (choice.equals("y")) {

                System.out.print("Clean terminals and try starting again.");
            }

            else {
                System.out.print("Replace cables and try again.");

            }
        }

        else {

            System.out.print("Does the car make a slicking noise? ");
            choice = scan.next();

            if (choice.equals("y")) {

                System.out.print("Replace the battery.");
            }

            else {

                System.out.print("Does the engine start and then die? ");
                choice = scan.next();

                if (choice.equals("y")) {

                    System.out.print("Does your car have fuel injection? ");
                    choice = scan.next();

                    if (choice.equals("y")) {

                        System.out.print("Get it in for service.");

                    }

                    else {

                        System.out.print("Check to ensure the choke is opening and closing.");
                }

                }

                else {
                    System.out.print("This should not be possible.");
                }
            }
        }
    }
}
