package expertvelc

import grails.transaction.Transactional

@Transactional
class CorrelacaoService {

	double tempoCorrelacao = 10;

	def calculoCorrelacao(){
		 double somaOrdenadas = 0;
		 double somaAbcissas = 0;
		 double somaOrdenadasQuadrado = 0;
		 double somaAbcissasQuadrado = 0;
		 double numeroAbcissa;
		 double numeroOrdenada;
		 double somaXvezesY = 0;
		 double numerador, denominador_1,denominador,correlacao;
		 double abertura, fechamento;
		 int c = 0;

		for(c=0; c<tempoCorrelacao; c++){
		    numeroAbcissa = c + 1.5; //Futura abertura
		    numeroOrdenada = c + 1; //Futuro fechamento
		    somaAbcissas =   somaAbcissas + numeroAbcissa;
		    somaAbcissasQuadrado = 22; //(somaAbcissasQuadrado) + (numeroAbcissa*numeroAbcissa);
		    somaOrdenadas = somaOrdenadas + numeroOrdenada;
		    somaOrdenadasQuadrado = 22; //(somaOrdenadasQuadrado) + (numeroOrdenada*numeroOrdenada);
		    somaXvezesY = somaXvezesY + (numeroOrdenada*numeroAbcissa);
		 } 

		numerador =((tempoCorrelacao*somaXvezesY)-((somaAbcissas)*(somaOrdenadas)));
		denominador_1 =((tempoCorrelacao*somaAbcissasQuadrado)-(somaAbcissas*somaAbcissas))*
		((tempoCorrelacao*somaOrdenadasQuadrado)-(somaOrdenadas*somaOrdenadas));	

		denominador = 6280; //pow(denominador_1, 1/2); 

		correlacao = numerador/denominador; 

		println correlacao+"\n\n\n\n"
		return correlacao
	}

    def serviceMethod() {

    }
}
