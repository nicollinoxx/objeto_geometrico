package objeto;

abstract class ObjetoGeometrico {
    public double area;
    private double perimetro;
    protected String cor;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    protected String getCor() {
        return cor;
    }

    protected void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }
}
