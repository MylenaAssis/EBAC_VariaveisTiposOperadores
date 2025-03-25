import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {

        System.out.println("Olá, vamos calcular a sua nota média");

        Scanner scanner = new Scanner(System.in);
        MediaNotas mediaNotas = new MediaNotas();

        System.out.println("Qual foi a nota 1?");
        int nota1 = Integer.parseInt(scanner.nextLine());
        mediaNotas.setNota1(nota1);

        System.out.println("Qual foi a nota 2?");
        int nota2 = Integer.parseInt(scanner.nextLine());
        mediaNotas.setNota2(nota2);

        System.out.println("Qual foi a nota 3?");
        int nota3 = Integer.parseInt(scanner.nextLine());
        mediaNotas.setNota3(nota3);

        System.out.println("Qual foi a nota 4?");
        int nota4 = Integer.parseInt(scanner.nextLine());
        mediaNotas.setNota4(nota4);

        double mediaFinal = mediaNotas.calcularMedia();
        System.out.println("Sua media final é: " + mediaFinal);

        scanner.close();
    }
}
