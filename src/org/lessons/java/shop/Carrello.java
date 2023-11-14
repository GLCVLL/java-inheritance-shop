package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
    	
    	
        Scanner in = new Scanner(System.in);
        
        // TESSERA FEDELTà
        System.out.println("Possiedi una tessera fedeltà? (sì/no): ");
    	String answerCard = in.nextLine();
    	boolean card = answerCard.equals("sì");
    	
    	
        Prodotto[] carrello = new Prodotto[10];
        int productsNumber = 0;

        for (int x = 0; x < carrello.length; x++) {
            System.out.println("Vuoi inserire un elemento nel carrello? (sì/no): ");
            String answer = in.nextLine();

            if (answer.equals("no")) {
                if (productsNumber > 0) {
                    System.out.println(Arrays.asList(carrello));
                } else {
                    System.out.println("Non ci sono elementi nel carrello.");
                }
                break;
            } else {
                System.out.println("Che elemento vuoi inserire? (telefono/televisore/cuffie): ");
                String element = in.nextLine();

                if (element.equals("telefono")) {
                    carrello[productsNumber] = creaSmartphone(in);
                } else if (element.equals("televisore")) {
                    carrello[productsNumber] = creaTelevisore(in);
                } else if (element.equals("cuffie")) {
                    carrello[productsNumber] = creaCuffie(in);
                } else {
                    System.out.println("Tipo di elemento non riconosciuto. Riprova.");
                    x--;
                }
                
               productsNumber++;
               
               if (carrello[x] != null) {
                   double priceOff = carrello[x].generatedPriceOff(card);
                   System.out.println("Prezzo scontato: " + priceOff);
               }
            }
        }
    }
    private static Smartphone creaSmartphone(Scanner in) {
        System.out.println("Inserisci il nome dello smartphone: ");
        String nome = in.nextLine();

        System.out.println("Inserisci la descrizione dello smartphone: ");
        String descrizione = in.nextLine();

        System.out.println("Inserisci il prezzo dello smartphone: ");
        double prezzo = in.nextDouble();

        System.out.println("Inserisci l'aliquota IVA dello smartphone: ");
        double iva = in.nextDouble();

        in.nextLine();

        System.out.println("Inserisci il codice IMEI dello smartphone: ");
        String imei = in.nextLine();

        System.out.println("Inserisci la quantità di memoria dello smartphone: ");
        int memoria = in.nextInt();

        return new Smartphone(nome, descrizione, prezzo, iva, imei, memoria);
    }
    
    private static Televisore creaTelevisore(Scanner in) {
        System.out.println("Inserisci il nome del televisore: ");
        String nome = in.nextLine();

        System.out.println("Inserisci la descrizione del televisore: ");
        String descrizione = in.nextLine();

        System.out.println("Inserisci il prezzo del televisore: ");
        double prezzo = in.nextDouble();

        System.out.println("Inserisci l'aliquota IVA del televisore: ");
        double iva = in.nextDouble();

        in.nextLine();

        System.out.println("Inserisci le dimensioni del televisore: ");
        int dimensioni = in.nextInt();

        System.out.println("Il televisore è smart? (true/false): ");
        boolean smart = in.nextBoolean();

        return new Televisore(nome, descrizione, prezzo, iva, dimensioni, smart);
    }

    private static Cuffie creaCuffie(Scanner in) {
        System.out.println("Inserisci il nome delle cuffie: ");
        String nome = in.nextLine();

        System.out.println("Inserisci la descrizione delle cuffie: ");
        String descrizione = in.nextLine();

        System.out.println("Inserisci il prezzo delle cuffie: ");
        double prezzo = in.nextDouble();

        System.out.println("Inserisci l'aliquota IVA delle cuffie: ");
        double iva = in.nextDouble();

        in.nextLine();

        System.out.println("Inserisci il colore delle cuffie: ");
        String colore = in.nextLine();

        System.out.println("Le cuffie sono wireless? (true/false): ");
        boolean wireless = in.nextBoolean();

        return new Cuffie(nome, descrizione, prezzo, iva, colore, wireless);
    }
}