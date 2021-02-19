import java.util.*;

public class UserInterface {
    Scanner sc;
    NameStorage nameStorage;

    public UserInterface(NameStorage nameStorage) {
        this.sc = new Scanner(System.in);
        this.nameStorage = nameStorage;
    }

    public void start() {
        System.out.println("Welcome to use Name Application 3000!");
        System.out.println("Give me some names to store. You can type \"END\" and press ENTER to stop storing names.");

        while (true) {
            List<String> names = nameStorage.getNames();

            System.out.print("Name (type \"END\" and press ENTER to stop): ");
            String askInput = this.sc.nextLine();

            if (askInput.toLowerCase().equals("end")) {
                for (int i = 0; i < names.size(); i++) {
                    System.out.println((i + 1) + " " + names.get(i));
                }

                System.out.println(
                        "Now you can search for names in the storage by giving small parts of searched names. You can type \"QUIT\" and press ENTER to stop searching names and quit Name Application 3000.");

                while (true) {
                    System.out.print("Name (type \"QUIT\" and press ENTER to stop and quit): ");
                    String searchInput = this.sc.nextLine().toLowerCase();

                    if (searchInput.toLowerCase().equals("quit")) {
                        break;
                    }

                    for (int i = 0; i < names.size(); i++) {
                        if (names.get(i).toLowerCase().contains(searchInput)) {
                            System.out.println((i + 1) + " " + names.get(i));
                        }
                    }
                }
            }

            names.add(askInput);
        }
    }
}
