public class Cachorro extends Mamifero{
    public Cachorro() {
        super("canino", 12, "latido", "onivoro", false, true, 4);
    }

    public String raca;

    @Override
    public String toString() {
        return
                "Cachorro{" +
                "raca='" + raca + '\'' +
                        "dieta= " + getDieta() +
                '}';
    }

    @Override
    public String getDieta() {
        return super.getDieta();
    }
}
