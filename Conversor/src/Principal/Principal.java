package Principal;

import javax.swing.*;

import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesTemperaturas;

public class Principal {
	
	public static void main(String[] args) {
		OpcionesConversion opcionesConversion = new OpcionesConversion();
		OpcionesTemperaturas opcionesTemperaturas = new OpcionesTemperaturas();
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción", "Menú Principal", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Monedas", "Conversor de Temperaturas"}, "Elegir").toString();
			
			switch(opciones) {
			case "Conversor de Monedas":
				String inputMoneda = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibidoMoneda = Double.parseDouble(inputMoneda);
				opcionesConversion.ConvertirMonedas(valorRecibidoMoneda);
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Continuar");
				}else {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					System.exit(0);
				}
				break;
			case "Conversor de Temperaturas":
				String inputTemperatura = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibidoTemperatura = Double.parseDouble(inputTemperatura);
				opcionesTemperaturas.ConvertirTemperaturas(valorRecibidoTemperatura);
				int respuesta2 = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
				if(JOptionPane.OK_OPTION == respuesta2) {
					System.out.println("Continuar");
				}else {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					System.exit(0);
				}
				break;
					
			}
		}
		
	}
	
}
