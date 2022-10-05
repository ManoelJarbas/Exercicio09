import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em °F: ");
        double temp1 = sc.nextDouble();
        
        double temp2;
        temp2 = 5 * ((temp1-32) / 9);
        System.out.println("A temperatura informada corresponde a " + temp2 + " °C.");
        
    }
}
