
public class Auror {

    private int vida;
    private int mana;

    public Auror() {
        this.vida = 100;
        this.mana = 100;
    }

    public void lanzarHechizo() {
        if (vida <= 0) {
            System.out.println("El Auror está fuera de combate.");
            return;
        }

        if (mana >= 20) {
            mana -= 20;
            System.out.println("El Auror lanzó un hechizo.");
            System.out.println("Daño causado: 25 puntos.");
            System.out.println("Maná restante: " + mana);
        } else {
            System.out.println("No hay suficiente maná para lanzar el hechizo.");
        }
    }

    public void defenderse() {
        if (vida <= 0) {
            System.out.println("El Auror está fuera de combate y no puede defenderse.");
            return;
        }

        vida += 15;

        if (vida > 100) {
            vida = 100;
        }

        System.out.println("El Auror se defendió.");
        System.out.println("Vida actual: " + vida);
    }

    public void recibirDanio(int danio) {
        vida -= danio;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println("El Auror recibió " + danio + " puntos de daño.");
        System.out.println("Vida restante: " + vida);
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }
}