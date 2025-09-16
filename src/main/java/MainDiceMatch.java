import javax.swing.*;
import java.util.Random;

public class MainDiceMatch {
    public static void main(String[] args) {
        Random random = new Random();

        // Spelare 1
        String firstname1 = JOptionPane.showInputDialog("Spelare 1 - Förnamn : ");
        String lastname1 = JOptionPane.showInputDialog("Spelare 1 - Efternamn : ");
        Player player1 = new Player(firstname1, lastname1);

        // Spelare 2
        String firstname2 = JOptionPane.showInputDialog("Spelare 2 - Förnamn : ");
        String lastname2 = JOptionPane.showInputDialog("Spelare 2 - Efternamn : ");
        Player player2 = new Player(firstname2, lastname2);

        // Fråga om spelstart
        String command = JOptionPane.showInputDialog("Skriv 'play' för att starta matchen eller 'quit' för att avsluta:");
        // Stringbuilder gör så att man kan ändra i en sträng på ett effektivt sätt, tabort, lägg till eller ersätta delar.
        //String är oföränderlig.
        if (command.equalsIgnoreCase("play")) {
            StringBuilder resultat = new StringBuilder();

            for (int i = 1; i <= 2; i++) {
                int roll1 = random.nextInt(1, 7);
                int roll2 = random.nextInt(1, 7);
                player1.addToScore(roll1);
                player2.addToScore(roll2);

                resultat.append("Runda ").append(i).append(":\n");
                resultat.append(player1.getFullName()).append(" slog ").append(roll1).append("\n");
                resultat.append(player2.getFullName()).append(" slog ").append(roll2).append("\n\n");
            }

            resultat.append("Slutresultat:\n");
            resultat.append(player1.getFullName()).append(":").append(player1.getScore()).append("\n");
            resultat.append(player2.getFullName()).append(":").append(player2.getScore()).append("\n\n");

            if (player1.getScore() > player2.getScore()) {
                resultat.append("Vinnare: ").append(player1.getFullName());
            } else if (player2.getScore() > player1.getScore()) {
                resultat.append("Vinnare: ").append(player2.getFullName());
            } else {
                resultat.append("Det blev oavgjort!");
            }

            JOptionPane.showMessageDialog(null, resultat.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Programmet avslutas.");
        }
    }
}
