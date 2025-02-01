package Vista;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class Vista {
    private final Scanner scanner = new Scanner(System.in);
    
    public void mostrarMensaje(String msg){
        System.out.println(msg);
    }
    
    public String solicitarEntrada(String msg){
        System.out.println(msg + ": ");
        return scanner.nextLine();
    }
    
    public int solicitarEntradaInt(String msg){
        System.out.println(msg+": ");
        return Integer.parseInt(scanner.nextLine());
    }
    
    public double solicitarEntradaDouble(String msg){
        System.out.println(msg + ": ");
        return Double.parseDouble(scanner.nextLine());
    }
    
}
