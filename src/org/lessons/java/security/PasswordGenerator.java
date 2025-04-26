package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
public static void main(String[] args) {
    String firstName;
    String lastName;
    String favouriteColor;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;
    int passwordNumber;

Scanner input = new Scanner(System.in);

System.out.print("Inserisci il tuo nome:");
firstName = input.nextLine();
System.out.print("Inserisci il tuo cognome:");
lastName = input.nextLine();
System.out.print("Inserisci il tuo colore preferito:");
favouriteColor = input.nextLine();
System.out.print("Inserisci il giorno di nascita:");
dayOfBirth = input.nextInt();
System.out.print("Inserisci il mese di nascita:");
monthOfBirth = input.nextInt();
System.out.print("Inserisci l'anno di nascita:");
yearOfBirth = input.nextInt();

String leftNumberDay = String.format("%02d", dayOfBirth);
String leftNumberMonth = String.format("%02d", monthOfBirth);
String leftNumberYear = String.format("%04d", yearOfBirth);

passwordNumber = dayOfBirth + monthOfBirth + yearOfBirth;

    System.out.println("Ho un utente che si chiama " + firstName + " " + lastName + ", nato il " + leftNumberDay + "/" + leftNumberMonth + "/" + leftNumberYear + ", il cui colore preferito è il " + favouriteColor + ". La sua password sarà " + firstName + "-" + lastName + "-" + favouriteColor + "-" + passwordNumber);
}
}
