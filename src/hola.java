import java.util.Scanner;
public class hola {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       /* System.out.println("Ingrese su altura en metros:");
        double altura=sc.nextDouble();
        System.out.println("Ingrese su peso en kilogramos:");
        double peso=sc.nextDouble();
        double IMC=peso/(Math.pow(altura,2));
        System.out.println(IMC);
*/Persona p= new Persona();
        System.out.println("Nombre: "+p.name);
        System.out.println("Edad:"+p.edad);
        p.setEdad(23);
        System.out.println("Edad: "+p.edad);
        Persona q=new Persona();
        System.out.println("Nombre Q: "+q.getName());
        System.out.println("Edad Q: "+q.getEdad());
        System.out.println("Nombre: ");
        q.setName(sc.next());
        System.out.println("name: "+q.getName());
    }
}
