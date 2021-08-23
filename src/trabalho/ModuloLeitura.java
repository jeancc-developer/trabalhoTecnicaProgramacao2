package trabalho;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class ModuloLeitura {

    public File arquivo;

    public void carregarArq(String nome) {
        try {
            arquivo = new File(nome + ".txt");
            if (arquivo.exists() == false) {
                JOptionPane.showMessageDialog(null, "O arquivo não existe!!!", "Tente Novamente!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }

    public String lerArquivo() {
        try {
            FileReader leitor = new FileReader(arquivo);
            BufferedReader leitorBuf = new BufferedReader(leitor);
            String texto = "";
            String linha = leitorBuf.readLine();

            while (linha != null) {
                texto += linha + "\n";
                linha = leitorBuf.readLine();
            }
            return texto;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
