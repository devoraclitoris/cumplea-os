package cumpleañospa;
import java.util.Scanner;
public class Cumpleañospa 
{
    public static void main(String[] args) 
    {
       Scanner Teclado = new Scanner(System.in);
        velitas bebe = new velitas();
        int edad;
        System.out.println("TORTICA DE CUMPLEAÑOS");     
        System.out.print("\ndigite la edad del cumpleañero: ");
        edad = Teclado.nextInt();
        bebe.setVelas(edad);
        bebe.AlturaV();
        bebe.ImpAlturaV();
        bebe.ApagarVelas();
        
    }
}