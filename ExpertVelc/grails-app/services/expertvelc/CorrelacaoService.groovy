package expertvelc

import grails.transaction.Transactional

@Transactional
class CorrelacaoService {

	 int tempo_correlacao = 3;

	 private double calculoCorrelacao(int tempo_correlacao){
		 double soma_ordenadas = 0;
		 double soma_abcissas = 0;
		 double soma_ordenadas_quadrado = 0;
		 double soma_abcissas_quadrado = 0;
		 double numero_abcissa;
		 double numero_ordenada;
		 double soma_X_vezes_Y = 0;
		 double numerador, denominador_1,denominador,correlacao;
		 double abertura, fechamento;

		for(int c=0; c<tempo_correlacao; c++){
		    numero_abcissa = 1; //Futura abertura
		    numero_ordenada = 1; //Futuro fechamento
		    soma_abcissas =   soma_abcissas + numero_abcissa;
		    soma_abcissas_quadrado = 1; //(soma_abcissas_quadrado) + (numero_abcissa)*(numero_abcissa);
		    soma_ordenadas = soma_ordenadas + numero_ordenada;
		    soma_ordenadas_quadrado = 1 ; //(soma_ordenadas_quadrado) + (numero_ordenada)*(numero_ordenada);
		    soma_X_vezes_Y = soma_X_vezes_Y + (numero_ordenada*numero_abcissa);
		 } 

		 numerador =((tempo_correlacao*soma_X_vezes_Y)-((soma_abcissas)*(soma_ordenadas)));
		 denominador_1 =((tempo_correlacao*soma_abcissas_quadrado)-(soma_abcissas*soma_abcissas))*
		 ((tempo_correlacao*soma_ordenadas_quadrado)-(soma_ordenadas*soma_ordenadas));	
		 denominador = 1; // MathPow(denominador_1,1.0/2.0); 

		correlacao = numerador/denominador;  

		return (correlacao);
	}      

    def serviceMethod() {

    }
}
