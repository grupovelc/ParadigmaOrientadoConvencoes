package teste

class Consciencia {
	String nomeConfiguracao;
	double tempoOperacao, quantidadeBarras;

    static constraints = {
    	nomeConfiguracao(maxSize: 20);

    }
}
