package expertvelc

class Robo {
	String nomeConfiguracao
	double tipoGrafico
	double alavancagem
	double quantidadeCandles

    static constraints = {
    	nomeConfiguracao(maxSize: 30)
    }
}
