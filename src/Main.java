import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Auto a=new Auto();
        System.out.println("Caracteristicas Vehiculo:\n color: "+a.getColor()+"\n modelo: "+a.getTipo()+"\n marca: "+ a.getMarca());
        System.out.println();
    }

}