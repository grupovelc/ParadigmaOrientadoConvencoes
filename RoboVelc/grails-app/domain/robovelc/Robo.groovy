package robovelc

class Robo {

	String nomeRobo
	String tipoGrafico
	double alavancagem
	double quantidadeCandle

    static constraints = {
    	nomeRobo(maxSize: 30)
    }
}
