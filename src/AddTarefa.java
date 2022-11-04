import javax.swing.*;
import java.awt.*;

public class AddTarefa extends JFrame {

    public AddTarefa(){
        setTitle("Adiconar nova Tarefa");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
    }

    public void configurarJanela(){

        JPanel painel = new JPanel();
        GroupLayout JanelaLayout = new GroupLayout(painel);
        painel.setLayout(JanelaLayout);
        JanelaLayout.setAutoCreateGaps(true);
        JanelaLayout.setAutoCreateContainerGaps(true);


        JLabel lbl_tarefa = new JLabel("Tarefa");
        JTextArea txa_tarefa = new JTextArea(5,5);
        txa_tarefa.setBorder(BorderFactory.createLineBorder(Color.black));


        JLabel lbl_prioridade = new JLabel("Prioridade");
        String[] strings = {"Alta", "Media", "Baixa"};
        JComboBox cbb_prioridade = new JComboBox(strings);
        cbb_prioridade.setSelectedIndex(2);


        JCheckBox chb_prioridade = new JCheckBox("Finalizado");


        JButton BotaoCancelar = new JButton("Cancelar");
        JButton BotaoSalvar = new JButton("Salvar");



        //* Configurar posição dos aspectos do programa*/
        JanelaLayout.setVerticalGroup(
                JanelaLayout.createSequentialGroup()
                        .addComponent(lbl_tarefa)
                        .addComponent(txa_tarefa)
                        .addComponent(lbl_prioridade)
                        .addComponent(cbb_prioridade)
                        .addComponent(chb_prioridade)
                        .addGroup(JanelaLayout.createParallelGroup()
                                .addComponent(BotaoCancelar)
                                .addComponent(BotaoSalvar))
        );
        JanelaLayout.setHorizontalGroup(
                JanelaLayout.createParallelGroup()
                        .addComponent(lbl_tarefa)
                        .addComponent(txa_tarefa)
                        .addComponent(lbl_prioridade)
                        .addComponent(cbb_prioridade)
                        .addComponent(chb_prioridade)
                        .addGroup(JanelaLayout.createSequentialGroup()
                                .addComponent(BotaoCancelar)
                                .addComponent(BotaoSalvar))
        );
        add(painel);
    }
}
