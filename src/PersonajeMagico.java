public class PersonajeMagico {
    private String nombre;
    private int vida;
    private int mana;
    private int nivel;

    public PersonajeMagico(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = 100;
        this.mana = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public int getNivel() {
        return nivel;
    }

    public boolean estaFueraDeCombate() {
        return vida <= 0;
    }

    public boolean tieneManaSuficiente(int costo) {
        return mana >= costo;
    }

    public void recibirDanio(int danio) {
        if (danio > 0) {
            vida -= danio;
            if (vida < 0) {
                vida = 0;
            }
        }
    }

    public void gastarMana(int costo) {
        if (costo > 0) {
            mana -= costo;
            if (mana < 0) {
                mana = 0;
            }
        }
    }

    public void recuperarVida(int cantidad) {
        if (cantidad > 0) {
            vida += cantidad;
            if (vida > 100) {
                vida = 100;
            }
        }
    }

    public void recuperarMana(int cantidad) {
        if (cantidad > 0) {
            mana += cantidad;
            if (mana > 100) {
                mana = 100;
            }
        }
    }

    public void subirNivel() {
        nivel++;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("Estado: " + (estaFueraDeCombate() ? "Fuera de combate" : "Activo"));
    }
}
