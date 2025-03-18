import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMusic Library Menu:");
            System.out.println("1. Add a new song");
            System.out.println("2. Remove a song");
            System.out.println("3. Print all songs");
            System.out.println("4. Print songs by play count");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter play count: ");
                    int playCount = scanner.nextInt();
                    library.addSong(title, artist, playCount);
                    break;

                case 2:
                    System.out.print("Enter the song title to remove: ");
                    String removeTitle = scanner.nextLine();
                    library.removeSong(removeTitle);
                    break;

                case 3:
                    System.out.println("\nAll Songs:");
                    library.printAllSongs();
                    break;

                case 4:
                    System.out.print("Enter minimum play count: ");
                    int minPlays = scanner.nextInt();
                    System.out.println("\nSongs with at least " + minPlays + " plays:");
                    library.printSongsByPlayCount(minPlays);
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
