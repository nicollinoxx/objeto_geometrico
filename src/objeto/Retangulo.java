package objeto;

class Retangulo extends ObjetoGeometrico {
    private double comprimento;
    private double altura;

    public Retangulo(double c, double a) {
        this.comprimento = c;
        this.altura      = a;
        this.area        = comprimento * altura;
        setPerimetro(2 * (comprimento + altura));
    }
}
