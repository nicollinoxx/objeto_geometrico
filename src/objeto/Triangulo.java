package objeto;

class Triangulo extends ObjetoGeometrico {
    public double base;
    public double altura;

    public Triangulo(double b, double a) {
        this.base   = b;
        this.altura = a;
        this.area   = (base * altura) / 2;
        setPerimetro(3 * base);
    }
}
