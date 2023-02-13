package convertorMoneda;


import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */


public class principal {
    public static void main (String[] arg){
        
        funciones funcion = new funciones();
        
        String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu ", 
                JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de monedas", " Extra"}, "Seleccion")).toString();
        int ciclo=0;
        do {
            
            switch (opciones) {
            case "Conversor de monedas": 
                
                String input=JOptionPane.showInputDialog("Por favor ingrese el valor a convertir: ");
                
                try {
                    NumberFormat formatiar = NumberFormat.getInstance();
                    formatiar.parse(input);
                    double valorRecibido=Double.parseDouble(input);
                    funcion.conversorMoneda(valorRecibido);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingresar un valor valido");
                    break;
                } 
                
               /*     if(input.matches("[0-9]")){
                        double valorRecibido=Double.parseDouble(input);
                        funcion.conversorMoneda(valorRecibido);
                         
                    }else {
                        JOptionPane.showInputDialog("Por favor ingrese el valor a convertir: ");
                    } */
                                  
                   
                int seleccion=JOptionPane.showConfirmDialog(null, "Desea realizar otra Conversión");
                    ciclo=seleccion;
                if (JOptionPane.OK_OPTION != ciclo) {
                   // System.out.println("Selección afirmativa");
                           JOptionPane.showMessageDialog(null, "Programa Terminado");              
                }else {
                   // JOptionPane.showMessageDialog(null, "Programa Terminado");
                     
                }
                break;
                
               
            default:
                throw new AssertionError();
        }
            
        } while (ciclo!=1);
        
    }
    
}
