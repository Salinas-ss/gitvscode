import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num1, num2, suma, resta, producto, division, resto;
        Scanner s=new Scanner(System.in);
        System.out.print("Introduzca primer número: ");
        num1=s.nextInt();
        System.out.print("Introduzca segundo número: ");
        num2=s.nextInt();
        suma=num1+num2;
        System.out.println("La suma es "+suma);
        resta=num1-num2;
        System.out.println("La resta es "+resta);
        producto=num1*num2;
        System.out.println("El producto es "+producto);
        division=num1/num2;
        System.out.println("La división es "+division);
        resto=num1%num2;
        System.out.println("El resto es "+resto);//cambio
            }
}
