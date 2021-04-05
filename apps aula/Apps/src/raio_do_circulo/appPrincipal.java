package raio_do_circulo;

import javax.swing.JOptionPane;

public class appPrincipal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        float raioDoCirculo = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o raio do circulo: "));
        circulo.setRaio(raioDoCirculo);

        JOptionPane.showMessageDialog(null,
                "O raio do circulo é: " + circulo.getRaio() + "\nA area desse circulo é: " + circulo.areaDoCirculo()
                        + "\nO diametro desse circulo é: " + circulo.diametroDoCirculo()
                        + "\nE o perimetro do circulo é: " + circulo.perimetroDoCirculo());

        System.exit(0);
    }
}