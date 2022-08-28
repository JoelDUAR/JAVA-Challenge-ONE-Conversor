package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

	public void ConvertirCelciusAFahrenheit(double valor) {
		double valorTemperatura =(1.8*valor)+32;
		valorTemperatura = (double) Math.round(valorTemperatura *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + valorTemperatura + "° Fahrenheit");
	}
	
	public void ConvertirCelciusAkelvin(double valor) {
		double valorTemperatura = valor+273;
		valorTemperatura = (double) Math.round(valorTemperatura *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + valorTemperatura + "° Kelvin");
	}

	public void ConvertirFahrenheitACelcius(double valor) {
		double valorTemperatura = 0.55*(valor-32);
		valorTemperatura = (double) Math.round(valorTemperatura *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + valorTemperatura + "° Celcius");
	}
	
	public void ConvertirFahrenheitAKelvin(double valor) {
		double valorTemperatura = (0.55*(valor-32))+273;
		valorTemperatura = (double) Math.round(valorTemperatura *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + valorTemperatura + "° Kelvin");
	}
	
	public void ConvertirKelvinAFahrenheit(double valor) {
		double valorTemperatura = (1.8*(valor-273))+32;
		valorTemperatura = (double) Math.round(valorTemperatura *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + valorTemperatura + "° Fahrenheit");
	}
	
	public void ConvertirKelvinACelcius(double valor) {
		double valorTemperatura = valor-273;
		valorTemperatura = (double) Math.round(valorTemperatura *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + valorTemperatura + "° Celcius");
	}	

}
