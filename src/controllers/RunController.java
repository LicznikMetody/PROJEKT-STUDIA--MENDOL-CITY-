package controllers;

import interfaces.KorposzczurInterface;
import models.UlicznyDzieciak;
import models.Korposzczur;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class RunController
 */
public class RunController {
    /**
     * Class to run program
     */
    public void run() {
        System.out.println("Stajesz przed wejściem do magicznego Kreatora Postaci - miejscu,");
        System.out.println("gdzie twoje marzenia o przygodach i sukcesach w mieście stają się rzeczywistością.");
        System.out.println("Tutaj, każdy szczegół twojej postaci może zadecydować o przyszłych losach,");
        System.out.println("powodzeniu i prestiżu, które zdobędziesz na tutejszych ulicach.");
        System.out.println("Jesteś twórcą postaci. Wybierz jedną z dostępnych ścieżek życia:");
        System.out.println("- Uliczny Dzieciak");
        System.out.println("- Korposzczur");
        System.out.println("Podaj nazwę ścieżki życia: ");

        Scanner scanner = new Scanner(System.in);
        String decision = scanner.nextLine();

        switch (decision) {
            case "Uliczny Dzieciak" -> {
                UlicznyDzieciak ulicznyDzieciak = new UlicznyDzieciak();
                ulicznyDzieciak.welcome(decision);
                ulicznyDzieciak.breakLine();
                System.out.println("Podaj imię postaci");
                ulicznyDzieciak.setName(scanner.nextLine());
                System.out.println("Podaj wiek postaci (18-30)");
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 18 || age > 30) {
                    System.out.println("Nieprawidłowy wiek. Tworzenie postaci anulowane.");
                    return;
                }
                ulicznyDzieciak.setType(scanner.nextLine());
                System.out.println("Podaj budowę ciała (atletyczna, szczupła, umięśniona, ulana)");
                String bodyBuild = scanner.nextLine();
                if (!isValidBodyBuild(bodyBuild)) {
                    System.out.println("Nieprawidłowa budowa ciała. Tworzenie postaci anulowane.");
                    return;
                }
                ulicznyDzieciak.setBodyBuild(bodyBuild);
                System.out.println("Podaj kolor włosów (czarny, blond, rudy, niebieskie, zielone, fioletowe, siwe, białe)");
                String hairColor = scanner.nextLine();
                if (!isValidHairColor(hairColor)) {
                    System.out.println("Nieprawidłowy kolor włosów. Tworzenie postaci anulowane.");
                    return;
                }
                ulicznyDzieciak.setHairColor(hairColor);
                System.out.println("Podaj kolor oczu (czerwone, pomarańczowe, tęczowe, białe, czarne, zielone, fioletowe)");
                String eyeColor = scanner.nextLine();
                if (!isValidEyeColor(eyeColor)) {
                    System.out.println("Nieprawidłowy kolor oczu. Tworzenie postaci anulowane.");
                    return;
                }
                ulicznyDzieciak.setEyeColor(eyeColor);
                System.out.println("Czy ma tatuaż? (tak / nie)");
                String hasTattoo = scanner.nextLine();
                if (!isValidTattoo(hasTattoo)) {
                    System.out.println("Nieprawidłowa odpowiedź. Tworzenie postaci anulowane.");
                    return;
                }
                ulicznyDzieciak.setHasTattoo(hasTattoo);
                System.out.println("Czy chcesz stworzyć postać? (tak / nie)");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("tak")) {
                    System.out.println(Arrays.toString(ulicznyDzieciak.UlicznyDzieciakData()));
                } else {
                    System.out.println("Tworzenie postaci anulowane");
                }
            }
            case "Korposzczur" -> {
                Korposzczur korposzczur = new Korposzczur();
                korposzczur.welcome(decision);
                korposzczur.breakLine();
                System.out.println("Podaj imię postaci");
                korposzczur.setName(scanner.nextLine());
                System.out.println("Podaj wiek postaci (18-30)");
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 18 || age > 30) {
                    System.out.println("Nieprawidłowy wiek. Tworzenie postaci anulowane.");
                    return;
                }
                korposzczur.setType(scanner.nextLine());
                System.out.println("Podaj budowę ciała (atletyczna, szczupła, umięśniona, ulana)");
                String bodyBuild = scanner.nextLine();
                if (!isValidBodyBuild(bodyBuild)) {
                    System.out.println("Nieprawidłowa budowa ciała. Tworzenie postaci anulowane.");
                    return;
                }
                korposzczur.setBodyBuild(bodyBuild);
                System.out.println("Podaj kolor włosów (czarny, blond, rudy, niebieskie, zielone, fioletowe, siwe, białe)");
                String hairColor = scanner.nextLine();
                if (!isValidHairColor(hairColor)) {
                    System.out.println("Nieprawidłowy kolor włosów. Tworzenie postaci anulowane.");
                    return;
                }
                korposzczur.setHairColor(hairColor);
                System.out.println("Podaj kolor oczu (czerwone, pomarańczowe, tęczowe, białe, czarne, zielone, fioletowe)");
                String eyeColor = scanner.nextLine();
                if (!isValidEyeColor(eyeColor)) {
                    System.out.println("Nieprawidłowy kolor oczu. Tworzenie postaci anulowane.");
                    return;
                }
                korposzczur.setEyeColor(eyeColor);
                System.out.println("Czy ma tatuaż? (tak / nie)");
                String hasTattoo = scanner.nextLine();
                if (!isValidTattoo(hasTattoo)) {
                    System.out.println("Nieprawidłowa odpowiedź. Tworzenie postaci anulowane.");
                    return;
                }
                korposzczur.setHasTattoo(hasTattoo);
                System.out.println("Czy chcesz stworzyć postać? (tak / nie)");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("tak")) {
                    System.out.println(Arrays.toString(korposzczur.KorposzczurData()));
                } else {
                    System.out.println("Tworzenie postaci anulowane");
                }
            }
            default -> {
                System.out.println("Błędny wybór");
                this.run();
            }
        }
        this.breakLine();
        System.out.println("Zakończono Tworzenie Postaci Witamy w Mendol City ");
    }

    private boolean isValidHairColor(String hairColor) {
        // Add your validation logic for hair color here
        // Return true if hair color is valid, false otherwise
        String[] validHairColors = {"czarny", "blond", "rudy", "niebieskie", "zielone", "fioletowe", "siwe", "białe"};
        return Arrays.asList(validHairColors).contains(hairColor);
    }

    private boolean isValidBodyBuild(String bodyBuild) {
        // Add your validation logic for body build here
        // Return true if body build is valid, false otherwise
        String[] validBodyBuilds = {"atletyczna", "szczupła", "umięśniona", "ulana"};
        return Arrays.asList(validBodyBuilds).contains(bodyBuild);
    }

    private boolean isValidEyeColor(String eyeColor) {
        // Add your validation logic for eye color here
        // Return true if eye color is valid, false otherwise
        String[] validEyeColors = {"czerwone", "pomarańczowe", "tęczowe", "białe", "czarne", "zielone", "fioletowe"};
        return Arrays.asList(validEyeColors).contains(eyeColor);
    }

    private boolean isValidTattoo(String hasTattoo) {
        // Add your validation logic for tattoo here
        // Return true if tattoo value is valid, false otherwise
        return hasTattoo.equalsIgnoreCase("tak") || hasTattoo.equalsIgnoreCase("nie");
    }

    private void breakLine() {
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        RunController controller = new RunController();
        controller.run();
    }
}