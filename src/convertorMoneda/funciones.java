package convertorMoneda;


import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */


public class funciones {
    
    conversor moneda= new conversor();
    
    public void conversorMoneda(double ValorRecibido){
        
        String opciones = (JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero ", "Monedas ", 
                JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
                "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
                "De Won Coreano a Pesos"}, 
                "Seleccion")).toString();
        
        switch (opciones) {
            case "De Pesos a Dólar":
                moneda.convertirPesosColombianosaDolar(ValorRecibido);
                break;
            
            case "De Pesos a Euro":
                moneda.convertirPesosColombianosaEuro(ValorRecibido);
                break;
                
            case "De Pesos a Libras":
                moneda.convertirPesosColombianosaLibras(ValorRecibido);
                break;
                
            case "De Pesos a Yen":
                moneda.convertirPesosColombianosaYen(ValorRecibido);
                break;
                
            case "De Pesos a Won Coreano":
                moneda.convertirPesosColombianosaWonCoreano(ValorRecibido);
                break;
                
            case "De Dólar a Pesos":
                moneda.convertirDolarAPesosColombianos(ValorRecibido);
                break;
            
            case "De Euro a Pesos":
                moneda.convertirEuroAPesosColombianos(ValorRecibido);
                break;
                
            case "De Libras a Pesos":
                moneda.convertirLibrasAPesosColombianos(ValorRecibido);
                break;
                
            case "De Yen a Pesos":
                moneda.converYenAPesosColombianos(ValorRecibido);
                break;
                
            case "De Won Coreano a Pesos":
                moneda.convertirWonCoreanosAPesosColombianos(ValorRecibido);
                break;
                                

            default:
                throw new AssertionError();
        }

}
    
    
    
}
