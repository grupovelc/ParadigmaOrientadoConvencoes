package robovelc

class Robo {

	String nomeRobo
	String tipoGrafico
	double alavancagem
	double quantidadeCandle
	static String nomeRoboAtivado = "Nenhum"

    static constraints = {
    	nomeRobo(maxSize: 30)
    	tipoGrafico(blank:false, inList:["M1", "M5", "H1"] )
    }
}

