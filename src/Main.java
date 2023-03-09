import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keuzeLijst = "";
        String exit = "";

        ArrayList<Takenlijst> takenlijsts = new ArrayList<Takenlijst>();
        while (!exit.equals("0")) {
            while (!keuzeLijst.equals("1")) {
                System.out.println("Welke service wil je gebruiken?");
                System.out.println("1. ToDoList");
                System.out.println("2. Ik ga niks doen");

                System.out.print("Kies: ");
                keuzeLijst = scanner.nextLine();

                if (keuzeLijst.equals("1")) {
                    System.out.println();
                    System.out.println("Goede keuze!");
                } else if (keuzeLijst.equals("2")) {
                    System.out.println();
                    System.out.println("Je bent lacking man doe wat nuttigs!");
                    System.out.println("Probeer het opnieuw maar geef dit keer wat nuttigs mee als antwoord >:(");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("Wat is dit nou voor apengedrag je kunt niet eens tussen 1 of 2 kiezen");
                    System.out.println("Probeer het opnieuw aapje");
                    System.out.println();
                }
            }
            String keuzeLijst2 = "";
            while (!keuzeLijst2.equals("6")) {
                System.out.println("Wat wil je doen?");
                System.out.println("1. Taken lijst aanmaken");
                System.out.println("2. Taken lijst verwijderen");
                System.out.println("3. Taken lijsten bekijken");
                System.out.println("4. Taak toevoegen aan takenlijst");
                System.out.println("5. Taak verwijderen van takenlijst");
                System.out.println("6. Verlaat ToDoList");
                System.out.print("Kies: ");
                keuzeLijst2 = scanner.nextLine();

                if (keuzeLijst2.equals("1")) {
                    System.out.println("Hoe wil je de nieuwe takenlijst noemen?");
                    System.out.print("Vul in: ");
                    String naam = scanner.nextLine();
                    Takenlijst lijst = voegNieuweLijstToe(naam);
                    takenlijsts.add(lijst);
                    System.out.println("Takenlijst succesvol toegevoegd!");
                    System.out.println();
                }
                else if (keuzeLijst2.equals("2")) {

                }
                else if (keuzeLijst2.equals("3")){
                    System.out.println("Hier is je takenlijst");
                    int teller = 1;
                    for (Takenlijst doos : takenlijsts) {
                        System.out.println(teller +". " + doos.getNaam());
                        teller++;
                    }
                    System.out.println();
                    System.out.println("Kies 1 om terug te gaan");
                    System.out.print("Kies: ");
                    String terug1 = scanner.nextLine();
                    while (!terug1.equals("1")){
                        System.out.println("Ongeldig antwoord");
                        System.out.println("Probeer opnieuw");
                        terug1 = scanner.nextLine();
                    }
                }
                else if (keuzeLijst2.equals("4")){
                    for (Takenlijst doos : takenlijsts){
                        System.out.println(doos);
                    }
                }

                else if (keuzeLijst2.equals("5")) {

                }
                else if (keuzeLijst2.equals("6")){
                    keuzeLijst = "";
                    System.out.println();
                }
                else {
                    System.out.println("Geen geldig antwoord.");
                    System.out.println("Probeer opnieuw:");
                    System.out.println();
                }
            }
        }
    }
    public static Takenlijst voegNieuweLijstToe(String Steven){
        Takenlijst lijstNaam = new Takenlijst(Steven);
        return lijstNaam;
    }
}
