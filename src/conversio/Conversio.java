
package conversio;

import java.util.Scanner;


public class Conversio {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 0.86d;
        System.out.println(valor_euros + " eur0s (€) acatualmentt ewuivalen a" + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");


    }
    
}
