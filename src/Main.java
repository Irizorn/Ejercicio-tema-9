import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Maitane");
        cliente.setEdad(25);
        cliente.setnTelefono(999999999);
        cliente.setCredito(358.24);

        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getnTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Ramon");
        trabajador.setEdad(54);
        trabajador.setnTelefono(555555555);
        trabajador.setSalario(1258.23);

        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getnTelefono());
        System.out.println(trabajador.getSalario());

    }
}


class Persona{
    private String nombre;
    private int edad;
    private int nTelefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(int nTelefono) {
        this.nTelefono = nTelefono;
    }
}
class Cliente extends Persona {
    private double Credito;

    public double getCredito() {
        return Credito;
    }

    public void setCredito(double credito) {
        Credito = credito;
    }
}

class Trabajador extends Persona{
        private double Salario;

        public double getSalario() {
            return Salario;
        }
        public void setSalario(double salario) {
            Salario = salario;
        }
    }

