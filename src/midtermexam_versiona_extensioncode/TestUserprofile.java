package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Choose your favourite genre:");

        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        System.out.print("Enter a number from 1 to 4: ");
        int choice = input.nextInt();

        String favouriteGenre = genres[choice - 1];

        UserProfile profile = new UserProfile(name, favouriteGenre);

        System.out.println("UserProfile created.");
        System.out.println("User ID: " + profile.getUserID());
        System.out.println("Favourite genre: " + profile.getGenre());

        input.close();
    }
}