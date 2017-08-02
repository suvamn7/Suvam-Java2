/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Scanner;

public class App {

    /**

     */
    public static void main(String[] args) {
        Market m = new Market();
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to either buy, sell, see gains, or quit? ");
        String userMarket = input.nextLine().toUpperCase();

        while (userMarket != "quit") {
                    System.out.print("Would you like to either buy, sell, see gains, or quit? ");
                    String userMarket2 = input.nextLine().toUpperCase();
            }

        }
    }

