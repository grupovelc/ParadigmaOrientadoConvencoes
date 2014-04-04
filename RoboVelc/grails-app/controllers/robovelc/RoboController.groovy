package robovelc

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Transactional(readOnly = true)
@Secured(['IS_AUTHENTICATED_FULLY'])
class RoboController {

    def scaffold = Robo

    def FatorKService, FatorMService, FatorHService 

    def selecaoCorrelacao(){

        if(params.tipoGrafico.toString() == "M1")
            FatorMService.calculoCorrelacao(params.quantidadeCandle.toDouble());

        else if(params.tipoGrafico.toString() == "M5")
            FatorKService.calculoCorrelacao(params.quantidadeCandle.toDouble());

        else if(params.tipoGrafico.toString() == "H1")
            FatorHService.calculoCorrelacao(params.quantidadeCandle.toDouble());
        else 
            print("Erro. Nenhuma correlacao instanciada! \n");

    }

     def ativarRobo(Robo roboInstance){

        def target ="criterioEntrada.txt"
        File wf = new File(target)

        flash.message = "Robô "+roboInstance.nomeRobo.toString()+" ativado com sucesso!"
                redirect action:"index"

        print roboInstance.getNomeRobo()
        print roboInstance.getTipoGrafico()
        print roboInstance.getAlavancagem()
        print roboInstance.getQuantidadeCandle()

        wf.write(roboInstance.getNomeRobo() )
        wf.write(roboInstance.getTipoGrafico() )
        wf.write(roboInstance.getAlavancagem().toString() )
        wf.write(roboInstance.getQuantidadeCandle().toString() )

    }

        @Transactional
    def save(Robo roboInstance) {

        selecaoCorrelacao()

        if (roboInstance == null) {
            notFound()
            return
        }

        if (roboInstance.hasErrors()) {
            respond roboInstance.errors, view:'create'
            return
        }

        roboInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'roboInstance.label', default: 'Robo'), roboInstance.id])
                redirect roboInstance
            }
            '*' { respond roboInstance, [status: CREATED] }
        }
    }
    
}
