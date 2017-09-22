package testeextra;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Janela extends JFrame{

    private final List<Evento> eventos;
    private final JPanel j = new JPanel();
    private final JList<Evento> lstEvento = new JList<>(new DefaultListModel<>());
    private final JLabel latitude = new JLabel("Latitude");
    private final JTextField Latitude = new JTextField();
    private final JLabel longitude = new JLabel("Longitude");
    private final JTextField Longitude = new JTextField();
    private final JLabel Datahora = new JLabel("Data e Hora");
    private final JTextField dataHora = new JTextField();
    private final JLabel Descricao = new JLabel("Descrição");
    private final JTextArea descricao = new JTextArea(3, 10);
    private final JButton criarEvento = new JButton("Salvar Evento");
    private final JButton excluirEvento = new JButton("Excluir Evento");
    
    public Janela(List<Evento> sampleData) throws HeadlessException {
        super("Eventos");
        setMinimumSize(new Dimension(500, 300));
        this.eventos = sampleData;
        lstEvento.setModel(new EventosListModel(eventos));
        add(new JScrollPane(lstEvento), BorderLayout.WEST);
        Box vertical = Box.createVerticalBox();
        JPanel botoes = new JPanel(new GridLayout(3, 1));
        add(botoes, BorderLayout.SOUTH);
        botoes.add(criarEvento);
        botoes.add(excluirEvento);
        vertical.add(latitude);
        vertical.add(Latitude);
        vertical.add(longitude);
        vertical.add(Longitude);
        vertical.add(Datahora);
        vertical.add(dataHora);
        vertical.add(new JScrollPane (Descricao));
        vertical.add(descricao);
        add(vertical);
        pack();
        lstEvento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstEvento.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Evento selecionado = lstEvento.getSelectedValue();
                if (selecionado != null)
                {
                    Latitude.setText(selecionado.getLatitude());
                    Longitude.setText(selecionado.getLongitude());
                    dataHora.setText(selecionado.getDataHora());
                    descricao.setText(selecionado.getDesc());
                }
            }
        });
        criarEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeEvento = JOptionPane.showInputDialog("Nome do evento");
                if (nomeEvento != null && !nomeEvento.isEmpty())
                {
                    Evento ev = new Evento(nomeEvento);
                    eventos.add(ev);
                    lstEvento.updateUI();
                }
            }
        });
        
        excluirEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        

    }
    
}
