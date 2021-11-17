public class Portao {
    private double medida1;
    private double medida2;

    public double getMedida1() {
        return medida1;
    }

    public void setMedida1(double medida1) {
        this.medida1 = medida1;
    }

    public double getMedida2() {
        return medida2;
    }

    public void setMedida2(double medida2) {
        this.medida2 = medida2;
    }

    public double calcularNota() {
        return Ferraria.calcularNota(this.medida1, this.medida2);
    }
}
