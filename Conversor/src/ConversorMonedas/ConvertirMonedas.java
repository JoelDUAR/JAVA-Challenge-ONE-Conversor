package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor/138.03;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + monedaDolar + " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor/137.60;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + monedaEuro + " Euros");
	}
	
	public void ConvertirPesosALibrasEsterlinas(double valor) {
		double monedaLibraEsterlina = valor/161.97;
		monedaLibraEsterlina = (double) Math.round(monedaLibraEsterlina *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + monedaLibraEsterlina + " Libras Esterlinas");
	}
	
	public void ConvertirPesosAYem(double valor) {
		double monedaYen = valor/1;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + monedaYen + " Yenes");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double monedaWonSurCoreano = valor/9.69;
		monedaWonSurCoreano = (double) Math.round(monedaWonSurCoreano *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + monedaWonSurCoreano + " Wones");
	}
	
	public void ConvertirDolaresAPesos(double valor) {
		double monedaPesos = 138.03*valor;
		monedaPesos = (double) Math.round(monedaPesos *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + monedaPesos + " Pesos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaPesos = 137.60*valor;
		monedaPesos = (double) Math.round(monedaPesos *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + monedaPesos + " Pesos");
	}
	
	public void ConvertirDLibrasEsterlinasAPesos(double valor) {
		double monedaPesos = 161.97*valor;
		monedaPesos = (double) Math.round(monedaPesos *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + monedaPesos + " Pesos");
	}
	
	public void ConvertirWonesAPesos(double valor) {
		double monedaPesos = 9.69*valor;
		monedaPesos = (double) Math.round(monedaPesos *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + monedaPesos + " Pesos");
	}
	
	public void ConvertirYenesAPesos(double valor) {
		double monedaPesos = 1*valor;
		monedaPesos = (double) Math.round(monedaPesos *100d)/100;
		JOptionPane.showMessageDialog(null, "Valor: " + monedaPesos + " Pesos");
	}

}
