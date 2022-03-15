/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.classe;

/**
 *
 * @author 
 */
public class Principal {
    //psvm + tab
    public static void main(String[] args) {
        Pessoa objeto = new Pessoa();
        objeto.setNome("Fandangos da Humildade");
        objeto.setAnoNasc(1999);
        objeto.mostrarIdade();
        System.out.println(objeto.getNome()+" você nasceu em "+objeto.getAnoNasc());
    }
 
}
