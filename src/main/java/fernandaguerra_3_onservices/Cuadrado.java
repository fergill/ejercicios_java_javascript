package fernandaguerra_3_onservices;

class Cuadrado extends FiguraGeometrica {
    Double lado;

    public Cuadrado(Double l){
        lado = l;
    }

    public Double calcularArea(){
        return (Math.pow(lado,2));
    }

    public Double calcularPerimetro(){
        return (4*lado);
    }
}