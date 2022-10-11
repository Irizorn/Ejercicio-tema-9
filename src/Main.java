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
    private Integer edad;
    private Integer nTelefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(Integer nTelefono) {
        this.nTelefono = nTelefono;
    }
}
class Cliente extends Persona {
    private Double Credito;

    public Double getCredito() {
        return Credito;
    }

    public void setCredito(Double credito) {
        Credito = credito;
    }
}

class Trabajador extends Persona{
        private Double Salario;

        public Double getSalario() {
            return Salario;
        }
        public void setSalario(Double salario) {
            Salario = salario;
        }
    }

