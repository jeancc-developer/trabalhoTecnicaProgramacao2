package aula.projeto_programacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ModuloLeitura {

  public File arq;
  
  public void CarregarArq(String nome){
    
    try{
      arq = new File(nome+".txt");
      if(arq.exists()==false){
        System.out.print("esse arquivo nao existe!");
        
      }
    }catch (Exception e){
      e.printStackTrace();
    }
  }
  

 public String ler_arq(){
     try{
       
       FileReader leitor = new FileReader(arq);
       BufferedReader leitorBuf = new BufferedReader(leitor);
       
       String texto = "";
       
       String lin = leitorBuf.readLine();
       
       while (lin != null){
         texto += lin + "\n";
         lin = leitorBuf.readLine();
         
       }
     }catch (Exception e){
       e.printStackTrace();
     }
     return null;
    }
   }


