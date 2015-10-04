/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author Gustavo
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      
      ArrayList<Alunos> a = new ArrayList<Alunos>();
      Alunos b = new Alunos();
      //Alunos a[] = new Alunos();
      int qnt = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de Alunos"));
      for (int i = 0; i <qnt;i++){
        
            String nome = JOptionPane.showInputDialog(null,"Nome");
            String sexo = JOptionPane.showInputDialog(null,"Sexo");
            int rgm     = Integer.parseInt(JOptionPane.showInputDialog(null,"RGM"));
            double n1   = Double.parseDouble(JOptionPane.showInputDialog(null,"primeira nota "));
            double n2   = Double.parseDouble(JOptionPane.showInputDialog(null,"Segunda nota "));
            double n3   = Double.parseDouble(JOptionPane.showInputDialog(null,"Terceira nota "));
            double n4   = Double.parseDouble(JOptionPane.showInputDialog(null,"Quarta nota "));      
            b = new Alunos(nome,sexo,rgm,n1,n2,n3,n4);
            a.add(b);  
            
      }
      for (Alunos u : a) {  
        System.out.println("Nome: "+ u.getNome()); 
        System.out.println("Nota 1:"+ u.getNotaA());
        //faz os outros prints
     }  
          
      
    }
    
}
