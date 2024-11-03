package objeto;

class Quadrado extends ObjetoGeometrico {
    private double lado;

    public Quadrado(double l) {
        this.lado = l;
        this.area = lado * lado;
        setPerimetro(4 * lado);
    }
}
