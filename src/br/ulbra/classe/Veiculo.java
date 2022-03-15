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
public class Veiculo {
    private String modelo;
    private String marca;
    private int anoMod;
    private int anoFab;
    private double valor;
    private double potencia;
    private boolean ipvaPago;
    private boolean quitado;   
    
    public Veiculo(){
        
    }
    
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setAnoMod(int anoMod){
        this.anoMod = anoMod;
    }
    public int getAnoMod(){
        return anoMod;
    }
    public void setAnoFab(int anoFab){
        this.anoFab = anoFab;
    }
    public int getAnoFab(){
        return anoFab;
    }
    public void isValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }
    public void isPotencia(double potencia){
        this.potencia = potencia;
    }
    public double getPotencia(){
        return potencia;
    }
    public void isIpvaPago(boolean ipvaPago){
        this.ipvaPago = ipvaPago;
    }
    public boolean isIpvaPago(){
        return ipvaPago;
    }
    public void setQuitado(boolean quitado){
        this.quitado = quitado;
    }
    public boolean getQuitado(){
        return quitado;
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
