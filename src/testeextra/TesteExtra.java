package testeextra;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class TesteExtra {

    public static void main(String[] args) {
           
        Janela Evento = new Janela(getSampleData());
        Evento.setSize(450, 300);
        Evento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Evento.setLocationRelativeTo(null);
        Evento.setVisible(true);
    }
    private static List<Evento> getSampleData()
        {
            Evento e1 = new Evento("Nome", "3.76", "2.77", "32-10-1996", "AAAAAAAAAAAAAAAA");
            List<Evento> evento = new ArrayList<>();
            evento.add(e1);
            return evento;
        }
    
}
