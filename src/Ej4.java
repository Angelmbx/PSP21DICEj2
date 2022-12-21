public class Ej4 extends Thread{

    int inicio=0;
    int fin =100;
    String nombre;

    public Ej4(int inicio, int fin, String nombre) {
        super(nombre);
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(nombre + " comenzando.....");

        for (int i=inicio; i<fin; i++){
            System.out.println(getName() +" "+ i);
        }
        System.out.println(nombre+" ha finalizado.");
    }

    public static void main(String[] args) {
        Ej4 h1 = new Ej4(1,10,"HiloA");
        Ej4 h2 = new Ej4(20, 30, "HiloB");

        System.out.println("Iniciando los hilos.");
        System.out.println("Hilos inicializados.");

        h1.start();
        h2.start();

        System.out.println("Programa principal terminado.");

    }

}
