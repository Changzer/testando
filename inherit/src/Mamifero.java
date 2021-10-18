public class Mamifero extends Animal {
    private int patas;

    public Mamifero() {
    }

    public Mamifero(int patas) {
        this.patas = patas;
    }

    public Mamifero(String classeTipo, double peso, String somEmitido, String dieta, boolean extincao, boolean predador, int patas) {
       super(classeTipo, peso, somEmitido, dieta, extincao, predador);
        this.patas = patas;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {

        return   super.toString() +
                "Mamifero{" +
                "patas=" + patas +
                '}';
    }
}
