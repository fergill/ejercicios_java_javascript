package fernandaguerra_3_onservices;

class Rectangulo extends FiguraGeometrica {
    Double base;
    Double altura;

    public Rectangulo(double b, double h){
        base = b;
        altura = h;
    }

    public Double calcularArea(){
        return (base * altura);
    }

    public Double calcularPerimetro(){
        return (2*base + 2*altura);
    }
}