package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
		String opciones = JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos a Dólar", "De Pesos a Euros", "De Pesos a Libras Esterlinas", "De Pesos a Yen", "De Pesos a Won", "De Dolares a Pesos", "De Euros a Pesos", "De Libras Esterlinas a Pesos", "De Yenes a Pesos", "De Wones a Pesos"}, "Selección").toString();
		switch (opciones) {
		case "De Pesos a Dólar":
			monedas.ConvertirPesosADolares(valor);	
			break;
					
		case "De Pesos a Euros": 
			monedas.ConvertirPesosAEuros(valor);
			break;

		case "De Pesos a Libras Esterlinas": 
			monedas.ConvertirPesosALibrasEsterlinas(valor);
			break;
			
		case "De Pesos a Yen": 
			monedas.ConvertirPesosAYem(valor);
			break;
			
		case "De Pesos a Won": 
			monedas.ConvertirPesosAWon(valor);
			break;
			
		case "De Dolares a Pesos": 
			monedas.ConvertirDolaresAPesos(valor);
			break;
			
		case "De Euros a Pesos": 
			monedas.ConvertirEurosAPesos(valor);
			break;
		
		case "De Libras Esterlinas a Pesos":
			monedas.ConvertirDLibrasEsterlinasAPesos(valor);
			break;
		
		case "De Yenes a Pesos":
			monedas.ConvertirYenesAPesos(valor);
			break;
		
		case "De Wones a Pesos":
			monedas.ConvertirWonesAPesos(valor);
			break;
		}
	
	}

}
