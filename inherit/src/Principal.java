public class Principal {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro();
        dog.raca = "bulldog";
        System.out.println(dog.toString());

        Aquatico peixe = new Aquatico("peixe",6,"nenhum","plankton",false,true,"salgada");
        System.out.println(peixe.toString());

    }
}
