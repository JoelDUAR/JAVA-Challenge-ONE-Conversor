package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesTemperaturas {

	ConvertirTemperatura opciones = new ConvertirTemperatura();
	
	public void ConvertirTemperaturas(double valor) {
		String opcionesTemperaturas = JOptionPane.showInputDialog(null, "Elige una opción de temperatura", "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Celcius a Fahrenheit", "De Celcius a Kelvin", "De Fahrenheit a Celcius", "De Fahrenheit a Kelvin", "De Kelvin a Celcius", "De Kelvin a Fahrenheit"}, "Selección").toString();
		
		switch(opcionesTemperaturas) {
			case "De Celcius a Fahrenheit":
				opciones.ConvertirCelciusAFahrenheit(valor);
				break;
				
			case "De Celcius a Kelvin":
				opciones.ConvertirCelciusAkelvin(valor);
				break;
				
			case "De Fahrenheit a Celcius":
				opciones.ConvertirFahrenheitACelcius(valor);
				break;
				
			case "De Fahrenheit a Kelvin":
				opciones.ConvertirFahrenheitAKelvin(valor);
				break;
				
			case "De Kelvin a Celcius":
				opciones.ConvertirKelvinACelcius(valor);
				break;
				
			case "De Kelvin a Fahrenheit":
				opciones.ConvertirKelvinAFahrenheit(valor);
				break;
		}
		
	}
}
