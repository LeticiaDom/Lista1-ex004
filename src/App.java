import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       double n1, n2, n3, n4, media; 

        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: "); 
        n2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        n3 = sc.nextDouble();
        System.out.print("Digite a quarta nota: ");
        n4 = sc.nextDouble(); 

        media = (n1+n2+n3+n4)/4; 
        sc.close();

        System.out.println("A média das 4 notas é: " + media);

        }
}
