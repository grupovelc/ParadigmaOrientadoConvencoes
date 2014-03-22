package expertvelc

class Consciencia {
	
	String nomeConfiguracao;
	double tempoOperacao;
	double quantidadeBarras;

    static constraints = {
    	nomeConfiguracao(maxSize: 20);

    }
}

