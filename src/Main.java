import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Auto a=new Auto();
        System.out.println("Caracteristicas Vehiculo:\n color: "+a.getColor()+"\n modelo: "+a.getTipo()+"\n marca: "+ a.getMarca());
        System.out.println("Probando ");
        Rama r=new Rama();
        System.out.println("Caracteristicas Vehiculo:\n color: "+r.getColor()+"\n modelo: "+r.getTipo()+"\n marca: "+ r.getMarca());

    }

}