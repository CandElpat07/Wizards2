public class Auror extends PersonajeMagico implements LanzadorDeHechizos {


    public Auror(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void lanzarHechizo(PersonajeMagico objetivo) {

        int costoMana = 20;
        int danio = 25;

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
            System.out.println(getNombre() + " lanzó un hechizo de combate como Auror.");
            System.out.println("Daño causado: " + danio + " puntos.");
        }
    }

    public void defenderse() {
        if (estaFueraDeCombate()) {
            System.out.println(getNombre() + " está fuera de combate y no puede defenderse.");
            return;
        }


        recuperarVida(15);

        System.out.println(getNombre() + " se defendió.");
        System.out.println("Vida actual: " + getVida());
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo: Auror");
    }
}

