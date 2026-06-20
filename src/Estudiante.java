public class Estudiante extends PersonajeMagico implements LanzadorDeHechizos {

    public Estudiante(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void lanzarHechizo(PersonajeMagico objetivo) {
        int costoMana = 15;
        int danio = 18;

        if (estaFueraDeCombate()) {
            System.out.println(getNombre() + " está fuera de combate y no puede lanzar hechizos.");
        } else if (objetivo == null) {
            System.out.println("El objetivo no existe.");
        } else if (objetivo.estaFueraDeCombate()) {
            System.out.println("El objetivo ya está fuera de combate.");
        } else if (!tieneManaSuficiente(costoMana)) {
            System.out.println(getNombre() + " no tiene mana suficiente.");
        } else {
            gastarMana(costoMana);
            objetivo.recibirDanio(danio);
            System.out.println(getNombre() + " lanzó un hechizo básico.");
            System.out.println("Daño causado: " + danio);
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Estudiante");
    }
}
