package robovelc

class RoboAtivoController {

	//def target ="criterioEntrada.txt"
	Robo roboInstance

	//File af = new File(target)

	def gravaCriterioEntrada(){

		print roboInstance.getNomeRobo()
        print roboInstance.getTipoGrafico()
        print roboInstance.getAlavancagem()
        print roboInstance.getQuantidadeCandle()

        //af.append("I have all of your base")
	}

	def nada(){

		print "nada"
	}

}
