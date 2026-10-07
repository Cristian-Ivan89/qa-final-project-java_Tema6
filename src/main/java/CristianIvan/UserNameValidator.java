package CristianIvan;

import java.util.Scanner;

public class UserNameValidator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username;
        boolean valid;

        do {
            valid = false;
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            // Regula 1: lungimea intre 6 si 12 caractere, inclusiv
            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                System.out.println();
                continue;
            }


            // Regulile 2 si 3: parcurgem caracterele
            boolean hasSpace = false;
            boolean hasDigit = false;

            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if (c == ' ') {
                    hasSpace = true;
                    break; // nu mai verificam restul pentru inputul curent
                }
                if (c >= '0' && c <= '9') {
                    hasDigit = true;
                }
            }

            if (hasSpace) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                System.out.println();
            } else if (!hasDigit) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                System.out.println();
            } else {
                valid = true;
            }
        } while (!valid);

        System.out.println("Username acceptat: " + username);
        scanner.close();

    }
}
