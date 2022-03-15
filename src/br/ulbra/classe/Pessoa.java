/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.classe;

import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Pessoa {
    /*public, private, protected, package*/private String nome;
    /*public*/private int anoNasc;
    
    public Pessoa(){
        //Construtor
    }
    public void mostrarIdade(){
        System.out.println("A idade de "+nome+" é "+(2022-anoNasc) +" anos.");
    }
    public void setNome(String nome){
        //if(nome.length()>=10){
           this.nome = nome;         
    /*}else{
           this.nome = "----------";
        }*/
    }
    public void setAnoNasc(int anoNasc){
        //if(anoNasc >= 1980 && anoNasc <= 2022){
            this.anoNasc = anoNasc; 
        //}else{
            /*JOptionPane.showMessageDialog(null, "Apenas nascidos entre 1980 até"
                    + " 2022");
            this.anoNasc = 2022;*/
        }
        public String getNome(){
            return nome;
    }
        public int getAnoNasc(){
            return anoNasc;
        }
        
        
}
