package terreno;

import javax.swing.JOptionPane;

public class appPrincipal {
    public static void main(String[] args) {
        Terreno terreno = new Terreno();

        float baseDoTerreno = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a largura do terreno: "));
        terreno.setBase(baseDoTerreno);

        float alturaDoTerreno = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do terreno: "));
        terreno.setAltura(alturaDoTerreno);

        JOptionPane.showMessageDialog(null, "A largura do terreno é: " + terreno.getBase() + "\nA altura do terreno é: "
                + terreno.getAltura() + "\nA area do terreno é: " + terreno.areaDoTerreno());

        System.exit(0);
    }
}