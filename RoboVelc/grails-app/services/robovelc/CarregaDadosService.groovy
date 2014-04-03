package robovelc

import grails.transaction.Transactional

@Transactional
class CarregaDadosService {

	List cotacoesFatorK = new File("tabela5Minutos.csv").readLines()
	List cotacoesFatorM = new File("tabela5Minutos.csv").readLines()
	List cotacoesFatorH = new File("tabela5Minutos.csv").readLines()

	String aberturaFatorK = cotacoesFatorK[0]
	String fechamentoFatorK = cotacoesFatorK[0]

}
