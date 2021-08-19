package aula.projeto_programacao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


 public class ModuloEscrita{
   
   public File arq;
   
   
 public void carregarArq(String nome){
     
     try {
       arq = new File (nome + ".txt");
       if (arq.exists()== false){
         arq.createNewFile();
       }
     }catch (Exception e){
       e.printStackTrace();
     }
   }
   
   public void Escrever_Arq(String cont){
     try{
       FileWriter f = new FileWriter(arq, true);
       BufferedWriter b = new BufferedWriter (f);
       b.append(cont+"\n");
       b.flush();
       b.close();
       
     }catch (Exception e){
       e.printStackTrace();
     }
     
     
     }
   }
   


