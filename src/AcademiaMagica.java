import java.util.ArrayList;

public class AcademiaMagica {
    private String nombre;
    private ArrayList<PersonajeMagico> personajesRegistrados;
    private ArrayList<PersonajeMagico> salaDeDuelos;

    public AcademiaMagica(String nombre) {
        this.nombre = nombre;
        this.personajesRegistrados = new ArrayList<>();
        this.salaDeDuelos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPersonaje(PersonajeMagico personaje) {
        // completar
    }

    public PersonajeMagico buscarPersonajePorNombre(String nombre) {
        // completar
        return null;
    }

    public void listarTodosLosPersonajes() {
        // completar
    }

    public void mostrarPersonajesActivos() {
        // completar
    }

    public void mostrarPersonajesFueraDeCombate() {
        // completar
    }

    public int contarPersonajesRegistrados() {
        // completar
        return 0;
    }

    public boolean inscribirEnSalaDeDuelos(String nombrePersonaje) {
        // completar
        return false;
    }

    public boolean retirarDeSalaDeDuelos(String nombrePersonaje) {
        // completar
        return false;
    }

    public boolean participaEnDuelo(String nombrePersonaje) {
        // completar
        return false;
    }

    public void mostrarSalaDeDuelos() {
        // completar
    }

    public PersonajeMagico buscarEnSalaDeDuelos(String nombrePersonaje) {
        // completar
        return null;
    }
}
