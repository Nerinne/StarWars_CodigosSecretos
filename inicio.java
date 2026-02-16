import java.util.Scanner;

public class inicio{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n
    Hace mucho tiempo, en una galaxia muy, muy lejana… La Princesa Leia, Luke
    Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada
    en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio
    está construyendo para destruirla. (Presiona Intro para continuar)");
    String intro = sc.nextLine();
    if(intro.equals("")){
      nivel1.main(new String[]{});
    }
}
