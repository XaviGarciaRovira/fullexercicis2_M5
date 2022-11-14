package conversio;

import java.util.Scanner;

public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.println("Escull una opció: ");

            System.out.println("1. Passar de € a £");
            System.out.println("2. Passar de £ a €");
            System.out.println("3. Sortir");

            System.out.println("->");
            num = sc.nextInt();

            switch(num){
            
                case 1:
                    System.out.println("Introdueix en €");
                    int valor_euros = sc.nextInt();

                    double tipus_de_canvi = 0.86d;
                    System.out.println(valor_euros + " euros € acatualment equivalen a " + (valor_euros * tipus_de_canvi) + " lliures esterlines £");
                    
                    System.out.println("Prem RETURN per torar al MENU");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                    
                case 2:
                    
                    System.out.println("Introdueix en €");
                    int valor_lliures = sc.nextInt();

                    double tipus_canvi = 1.14d;
                    System.out.println(valor_lliures + " lliures esterlines £ acatualment equivalen a " + (valor_lliures * tipus_canvi) + " euros €");
                    
                    System.out.println("Prem RETURN per torar al MENU");
                    sc.nextLine();
                    sc.nextLine();
                    break;
            }
            
            
        }while (num < 3);

        }
    

    }
