public class ClasePrincipal extends Thread{

    @Override
    public void run() {
        try {
            while (true) {
                for (int r = 1 ; r <=5; r++) {
                    System.out.println("ITERACIÓN "+r);
                    for (int i = 1; i <= 100; i++) {
                        System.out.println("El Hilo " + i + " ha dormido por " + numAleatorio() + "milisegundos");
                        sleep((int) numAleatorio());
                    }
                    notify();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public int numAleatorio(){
        int numa = (int) (Math.random()*8000 + 1000);
        return numa;
    }
}
