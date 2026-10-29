import java.util.LinkedList;
import java.util.Scanner;

public class week10_task5_MusicPlaylistLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> playlist = new LinkedList<>();

        int choice;

        do {
            System.out.println("\nMusic Playlist");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Display Playlist");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter song name: ");
                    String song = sc.nextLine();

                    playlist.add(song);

                    System.out.println("Song added!");
                    break;

                case 2:
                    System.out.print("Enter song to remove: ");
                    String removeSong = sc.nextLine();

                    if (playlist.remove(removeSong)) {
                        System.out.println("Song removed!");
                    } else {
                        System.out.println("Song not found!");
                    }
                    break;

                case 3:
                    System.out.println("Playlist: " + playlist);
                    break;

                case 4:
                    System.out.println("Exiting playlist...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}