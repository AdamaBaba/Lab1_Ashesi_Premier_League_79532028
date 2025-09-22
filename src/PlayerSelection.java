// Adama Baba
// Ashesi Premier League
// Making decisions about players legibility
// 22nd September, 2025

import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {
        // declare variables
        String name;
        int age;
        float height;
        double weight;
        int jersey;
        // take inputs for players details
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the players name");
        name = input.next();
        System.out.println("Enter the players age");
        age = input.nextInt();
        System.out.println("Enter the players height in meters");
        height = input.nextFloat();
        System.out.println("Enter the players weight in pounds");
        weight = input.nextDouble();
        System.out.println("Enter the players jersey number");
        jersey = input.nextInt();
        final double POUND = 0.45359237;
        final int METER = 100;
        height = height * METER;
        weight = weight * POUND;
        int final_weight = (int) weight;

        // Decrement and increment
        age = ++age;
        jersey = --jersey;

        // Checking eligibility status
        String eligibility = "";
        if (age >= 18 && age <= 35 && final_weight <= 90) {
            eligibility = "Eligible";
        }
        else{
            eligibility = "Not Eligible";
        }
        if (age < 18 || final_weight > 90) {
            eligibility = "Player has a problem (either too young or too heavy)";
        }

        // Checking if attacker
        String attacker = "";
        if (jersey == 7 || jersey == 9 || jersey == 10 || jersey == 11){
           attacker = "Yes";
        }
        else{
            attacker = "No";
        }

        // Checking the category of player
        String category = "";
        if (age < 20) {
            category = "Rising star";
        }
        else if (age >= 20 && age <= 30) {
            category = "Prime Player";
        }
        else if (age > 30) {
            category = "Veteran";
        }
        // Checking the position of a player
        String position = "";
        switch (jersey) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position = "Mildfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playermaker";
                break;
            default:
                position = "Player position not known";
        }
        // Making decision for a player
        String decision = "";
        if (category.equals("Prime Player")) {
            if (final_weight < 80) {
                decision = "Starting lineup";
            }
            else{
                decision = "Bench";
            }
        }
        else
            decision = "Bench";
        // Making final decision
        String status =  (age >= 18 && age <= 35 && final_weight <= 90) ? "Play" : "Rest";

// printing the outputs of players status
        System.out.println("Player: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "cm");
        System.out.println("Weight: " + final_weight + "Kg");
        System.out.println("Jersey: " + jersey);
        System.out.println("Description: " + category);
        System.out.println("Position: " + position);
        System.out.println("Attacker: " + attacker);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Lineup Decision: " + decision);
        System.out.println("Final Decision: " + status);
    }
}



