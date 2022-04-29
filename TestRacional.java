package practicoexperimental1;
import java.util.Scanner; 
public class TestRacional {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int d; 
        System.out.print(" - Ingrese un númerador: ");
        int n = sc.nextInt(); 
        do{
            System.out.print(" - Ingrese un denominador distinto y mayor de 0: ");
            while(! sc.hasNextInt()){
                System.out.println("Ingrese un entero mayora 0");
                System.out.print("Ingrese un denominador: ");
                sc.next(); 
            }
            d = sc.nextInt(); 
        }while(d <= 0);
        Racional racional = new Racional(n,d);
        System.out.println(" Su número en racional es: " + racional.toTexto());
        System.out.println(" El número en real es: " + racional.toReal()); 
        System.out.println(" El número simplficado es: " + racional.euclides(
        n,d)); 
          
        
        
    }
        
}
