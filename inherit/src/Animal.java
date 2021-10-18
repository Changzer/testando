public class Animal {
    private String classeTipo;
    private double peso;
    private String somEmitido;
    private String dieta;
    private boolean extincao;
    private boolean predador;

    public Animal() {
    }

    public Animal(String classeTipo, double peso, String somEmitido, String dieta, boolean extincao, boolean predador) {
        this.classeTipo = classeTipo;
        this.peso = peso;
        this.somEmitido = somEmitido;
        this.dieta = dieta;
        this.extincao = extincao;
        this.predador = predador;


    }

    public String getClasseTipo() {
        return classeTipo;
    }

    public void setClasseTipo(String classeTipo) {
        this.classeTipo = classeTipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSomEmitido() {
        return somEmitido;
    }

    public void setSomEmitido(String somEmitido) {
        this.somEmitido = somEmitido;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public boolean isExtincao() {
        return extincao;
    }

    public void setExtincao(boolean extincao) {
        this.extincao = extincao;
    }

    public boolean isPredador() {
        return predador;
    }

    public void setPredador(boolean predador) {
        this.predador = predador;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "classeTipo='" + classeTipo + '\'' +
                ", peso=" + peso +
                ", somEmitido='" + somEmitido + '\'' +
                ", dieta='" + dieta + '\'' +
                ", extincao=" + extincao +
                ", predador=" + predador +
                '}';
    }
}
