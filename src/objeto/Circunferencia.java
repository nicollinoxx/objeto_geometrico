package objeto;

class Circunferencia extends ObjetoGeometrico {
    private static final double PI = 3.141618;
    private double raio;

    public Circunferencia(double r) {
        this.raio = r;
        this.area = PI * raio * raio;
        setPerimetro(2 * PI * raio);
    }
}