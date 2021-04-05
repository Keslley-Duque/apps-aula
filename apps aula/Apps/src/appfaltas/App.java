package appfaltas;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // criação do objeto
        Disciplina disciplina = new Disciplina();
        // solicitação de informações ao usuario
        String nomeDisciplina = JOptionPane.showInputDialog(null, "Digite o nome da Disciplina: ", "appFaltas",
                JOptionPane.QUESTION_MESSAGE);
        // associa o nome da disciplina ao atributo "nome"
        disciplina.setNome(nomeDisciplina);
        // solicitação da carga horaria ao usuario
        int cargaHoras = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Iforme a carga horaria da disciplina: " + disciplina.getNome()));
        // associa a caraga horaria ao atributo "cargaHoraria"
        disciplina.setCargaHoraria(cargaHoras);

        JOptionPane.showMessageDialog(null,
                "Na disciplina " + disciplina.getNome() + " são permitidas " + disciplina.totalDeFaltas() + " faltas.");

        System.exit(0); // encerra o programa
    }
}
