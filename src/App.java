import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4, media;
        Scanner teclado = new Scanner(System.in);

        System.out.print("1° bimestre - ");
        nota1 = teclado.nextDouble();
        System.out.print("2° bimestre - ");
        nota2 = teclado.nextDouble();
        System.out.print("3° bimestre - ");
        nota3 = teclado.nextDouble();
        System.out.print("4° bimestre - ");
        nota4 = teclado.nextDouble();
        
        System.out.print("Média = ");
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print(media);
    }
    
}