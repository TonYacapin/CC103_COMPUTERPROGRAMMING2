package CaseStudy;

import java.util.Scanner;

public class CaseStudy7_1 {

  public static void main(String[] args) {

    char repeat = 'Y';
    Scanner s = new Scanner(System.in);

    try {

      do {
    	  
        int categoryChoice, min = 0, max = 9,tries = 0, triesLimit = 5;
        boolean iterated = false;
        String temp = "", holder = "", finalGuess = "", Category = null;


        String[] Animals = new String[] {
          "Axolotl",
          "Zebra",
          "Kangaroo",
          "Giraffe",
          "Elephant",
          "Turtle",
          "Lizard",
          "Hummingbird",
          "Armadillo",
          "Gecko"
        };
        String[] MovieTitle = new String[] {
          "Jigsaw",
          "Me Before You",
          "Fifty Shades of Grey",
          "Butterfly Effect",
          "Logan",
          "Avatar",
          "The Shining",
          "Ratatouille",
          "Star Wars",
          "Jaws"
        };
        String[] Fruits = new String[] {
          "Dragon Fruit",
          "Pomegranate",
          "Cantaloupe",
          "Blueberries",
          "Watermelons",
          "Papaya",
          "Guava",
          "Strawberries",
          "Grapes",
          "Oranges"
        };
        String[] Actors = new String[] {
          "Liza Soberano",
          "Andrea Brillantes",
          "Coco Martin",
          "Babalu",
          "Dolphy",
          "Redford White",
          "Julia Montes",
          "Julia Barreto",
          "Nash Aquas",
          "Kuya Jobert"
        };
//LETS THE USER CHOOSE A CATEGORY, THE PROGRAM CHOOSE ONE WORD FROM THE CATEGORY 
        System.out.print("Welcome to Guess the Word Game!");
        System.out.print("\nCatergory\n[1] Animals\n[2] Movie Title\n[3] Fruits\n[4] Actor");
        System.out.print("\nChoose a category: ");
        categoryChoice = s.nextInt();

        int rand = (int) Math.floor(Math.random() * (max - min + 1) + min);
        
        if (categoryChoice == 1) {
        	
          Category = Animals[rand].toLowerCase();
          System.out.println("The category is Animals");
        } else if (categoryChoice == 2) {
          Category = MovieTitle[rand].toLowerCase();
          System.out.println("The category is MovieTitle");
        } else if (categoryChoice == 3) {
          Category = Fruits[rand].toLowerCase();
          System.out.println("The category is Fruits");
        } else if (categoryChoice == 4) {
          Category = Actors[rand].toLowerCase();
          System.out.println("The category is Actors");
        } else {
          System.out.println("Category Does Not Exist!");

        }

        System.out.println("Hidden Word:");
        for (int i = 0; i < Category.length(); i++) {
          System.out.print("_ ");
        }

        do {
//LETS THE USER INPUT A LETTER 5 TIMES, THE PROGRAM SHOW WHETHER THE LETTER IS EXISTING ON THE WORD OR NOT
          System.out.print("\nEnter Letter: ");
          String letterGuess = s.next().toLowerCase();

          for (int i = 0; i < Category.length(); i++) {
            if (letterGuess.equals(Character.toString(Category.charAt(i)))) {
              if (!iterated)
                temp += Character.toString(Category.charAt(i));
              else {
                holder = Character.toString(temp.charAt(i)).replace("_", letterGuess);
                temp = temp.substring(0, i) + holder + temp.substring(i + 1, temp.length());
              }
            } else {
              if (!iterated) {
                temp += ("_");
              }
            }
          }

          tries++;
          iterated = true;
          for (int j = 0; j < temp.length(); j++) {

            System.out.print(temp.charAt(j) + " ");
          }

        } while (tries < triesLimit);
// LETS THE USER INPUT FINAL GUESS
        System.out.print("\nEnter your guess word: ");
        finalGuess = s.next().toLowerCase();
        if (finalGuess.equals(Category)) {
          System.out.println("You guessed correctly!");
        } else {
          System.out.println("Sorry! You're answer is not correct.");
        }

        System.out.println("Try Again? [Y/N]");
        repeat = s.next().charAt(0);
      } while (repeat == 'Y' || repeat == 'y');
    } catch (Exception e) {
      System.out.println("ERROR!");
    }

  }
}