package convertorMoneda;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oscar
 */


public class conversor {
    
    public static void convertirPesosColombianosaDolar(double valorRecibido){
        double conversorDolar=valorRecibido/4795.65;
        conversorDolar=(double) Math.round(conversorDolar * 100d)/100;
        
        JOptionPane.showMessageDialog(null, "Tienes $"+conversorDolar+" Dolares");
    }
    
    public static void convertirPesosColombianosaEuro(double valorRecibido){
        double conversorEuro=valorRecibido/5081.63;
        conversorEuro=(double) Math.round(conversorEuro * 100d)/100;
        
        JOptionPane.showMessageDialog(null, "Tienes $"+conversorEuro+" Euros");
    }
    
     public static void convertirPesosColombianosaLibras(double valorRecibido){
        double conversorLibras=valorRecibido/5798.69;
        conversorLibras=(double) Math.round(conversorLibras* 100d)/100;
        
        JOptionPane.showMessageDialog(null, "Tienes $"+conversorLibras+" Libras");
    }
     
    public static void convertirPesosColombianosaYen(double valorRecibido){
        double conversorYenes=valorRecibido/36.99;
        conversorYenes=(double) Math.round(conversorYenes * 100d)/100;
        
        JOptionPane.showMessageDialog(null, "Tienes $"+conversorYenes+" Yenes");
    }
    
     public static void convertirPesosColombianosaWonCoreano(double valorRecibido){
        double conversorWonCoreano=valorRecibido/3.91;
        conversorWonCoreano=(double) Math.round(conversorWonCoreano * 100d)/100;
        
        JOptionPane.showMessageDialog(null, "Tienes $"+conversorWonCoreano+" Won Coreanos");
    }
    
     public static void convertirDolarAPesosColombianos(double valorRecibido){
        double conversorPesosColombianos=valorRecibido*4795.65;        //0.21
        conversorPesosColombianos=(double) Math.round(conversorPesosColombianos * 100d)/100;
        
        JOptionPane.showMessageDialog(null, "Tienes $"+conversorPesosColombianos+" Pesos Colombianos");
    }
     
     public static void convertirEuroAPesosColombianos(double valorRecibido){
        double conversorPesosColombianos=valorRecibido*5081.63;
        conversorPesosColombianos=(double) Math.round(conversorPesosColombianos * 100d)/100;
        
        JOptionPane.showMessageDialog(null, "Tienes $"+conversorPesosColombianos+" Pesos Colombianos");
    }
    
     public static void convertirLibrasAPesosColombianos(double valorRecibido){
        double conversorPesosColombianos=valorRecibido*5798.69;
        conversorPesosColombianos=(double) Math.round(conversorPesosColombianos * 100d)/100;
        
        JOptionPane.showMessageDialog(null, "Tienes $"+conversorPesosColombianos+" Pesos Colombianos");
    }
    
    public static void converYenAPesosColombianos(double valorRecibido){
        double conversorPesosColombianos=valorRecibido*36.99;
        conversorPesosColombianos=(double) Math.round(conversorPesosColombianos * 100d)/100;
        
        JOptionPane.showMessageDialog(null, "Tienes $"+conversorPesosColombianos+" Pesos Colombianos");
    }
    
    public static void convertirWonCoreanosAPesosColombianos(double valorRecibido){
        double conversorPesosColombianos=valorRecibido*3.91;
        conversorPesosColombianos=(double) Math.round(conversorPesosColombianos * 100d)/100;
        
        JOptionPane.showMessageDialog(null, "Tienes $"+conversorPesosColombianos+" Pesos Colombianos");
    }
    
   
    
    
}
