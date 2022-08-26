package fernandaguerra_3_onservices;

import javax.swing.*;

public class FiguraGeometrica
{
    public static void main(String[] args) {

            String valor= JOptionPane.showInputDialog("Elija el numero de la figura\n1.-Circulo\n2.-Rectangulo\n3.-Cuadrado");
            int opcion=Integer.parseInt(valor);

            switch(opcion){

                case 1:{
                    valor=JOptionPane.showInputDialog("Radio");
                    double radio=Double.parseDouble(valor);
                    Circulo figura1 = new Circulo(radio);
                    System.out.println("El área del círculo es = " + figura1.calcularArea());
                    System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
                    System.out.println();
                }
                break;

                case 2:{
                    valor=JOptionPane.showInputDialog("Base");
                    double base=Double.parseDouble(valor);
                    valor=JOptionPane.showInputDialog("Altura");
                    double altura=Double.parseDouble(valor);
                    Rectangulo figura2 = new Rectangulo(base,altura);
                    System.out.println("El área del rectángulo es = " + figura2.calcularArea());
                    System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
                    System.out.println();
                }
                break;

                case 3:{
                    valor=JOptionPane.showInputDialog("lado");
                    double lado=Double.parseDouble(valor);
                    Cuadrado figura3 = new Cuadrado(lado);
                    System.out.println("El área del cuadrado es = " + figura3.calcularArea());
                    System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
                    System.out.println();
                }
                break;


                default:
                    System.out.println("Opción no validad");
            }

    }

}

