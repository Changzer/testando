public class Aquatico extends Animal{
    private String agua;

    public Aquatico() {
    }

    public Aquatico(String classeTipo, double peso, String somEmitido, String dieta, boolean extincao, boolean predador, String agua) {
        super(classeTipo, peso, somEmitido, dieta, extincao, predador);
        this.agua = agua;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Aquatico{" +
                "agua='" + agua + '\'' +
                '}';
    }
}
