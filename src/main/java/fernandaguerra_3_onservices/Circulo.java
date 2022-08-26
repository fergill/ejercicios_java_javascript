package fernandaguerra_3_onservices;

class Circulo extends Figura {
    Double radio;

    public Circulo(Double r){
        radio = r;
    }

    public Double calcularArea(){
        return (Math.PI * Math.pow(radio, 2));
    }

    public Double calcularPerimetro(){
        return (2*Math.PI*radio);
    }
}