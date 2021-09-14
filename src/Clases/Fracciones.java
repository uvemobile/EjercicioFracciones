/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;



/**
 *
 * @author uvemo
 */
public class Fracciones {
    
    
    private int numerador;
    private int denominador;
    
    //contructores
    public Fracciones() {
        this.numerador=0;
        this.denominador=1;
    }

    public Fracciones(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    //Setter and getters
    public void setNumerador(int numerador) {
        this.numerador=numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public double getDenominador() {
        return denominador;
    }
    
    public static Fracciones sumar(Fracciones fraccionA, Fracciones fraccionB){
        Fracciones fraccionC=new Fracciones();
        fraccionC.numerador=fraccionA.numerador+fraccionB.numerador;
        fraccionC.denominador=fraccionA.denominador+fraccionB.denominador;
        return fraccionC;
    }
    public static Fracciones restar(Fracciones fraccionA, Fracciones fraccionB){
        Fracciones fraccionC=new Fracciones();
        fraccionC.numerador=fraccionA.numerador-fraccionB.numerador;
        fraccionC.denominador=fraccionA.denominador-fraccionB.denominador;
        return fraccionC;
    }
    public static Fracciones multiplicar(Fracciones fraccionA, Fracciones fraccionB){
        Fracciones fraccionC=new Fracciones();
        fraccionC.numerador=fraccionA.numerador*fraccionB.numerador;
        fraccionC.denominador=fraccionA.denominador*fraccionB.denominador;
        return fraccionC;
    }
    public static Fracciones dividir(Fracciones fraccionA, Fracciones fraccionB){
        Fracciones fraccionC=new Fracciones();
        fraccionC.numerador=fraccionA.numerador*fraccionB.denominador;
        fraccionC.denominador=fraccionB.numerador*fraccionA.denominador;
        return fraccionC;
    }
    @Override
    public String toString() {
        return  numerador + "/" + denominador ;
    }
    
}
