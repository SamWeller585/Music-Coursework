import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        library.addSong("Iris", "The Goo Goo Doll", 223046958);
        library.addSong("Naive", "The Kooks", 727480216);
        library.addSong("Everybody Wants To Rule The World", "Tears For Fears", 2000294339);
        library.addSong("Use Sombody", "Kings of Leon", 996082201);
        library.addSong("People Watching", "Sam Fender", 32654739);
        library.addSong("Not Like Us", "Kendrick Lamar", 1312422564);
        library.addSong("On The Back Burner", "The Reytons", 41646195);
        library.addSong("Beaches", "beabadoobee", 43418225);
        library.addSong("Colourblind", "Loyle Carner", 4831214);
        library.addSong("Logos/The Matrix Main Title", "Don Davis", 2378904);

        System.out.println("Library loaded!");

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Sam's Music Library!");
        System.out.println("Press Enter to start...");
        scanner.nextLine(); // Wait for the user to press Enter
        
        boolean running = true;

        while (running) {
            System.out.println("\nSam's Music Library Menu:");
            System.out.println("1. Add a new song");
            System.out.println("2. Remove a song");
            System.out.println("3. Print all of Sam's songs");
            System.out.println("4. Print songs by play count");
            System.out.println("5. Exit the Library");
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
