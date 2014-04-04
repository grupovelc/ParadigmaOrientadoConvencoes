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

        def arquivo ="criterioEntrada.txt"
        File limpaArquivo = new File(arquivo)
        File gravaArquivo = new File(arquivo)

        flash.message = "Robô "+roboInstance.nomeRobo.toString()+" ativado com sucesso!"
                redirect action:"index"

        limpaArquivo.write("")
        gravaArquivo.append(roboInstance.getNomeRobo())
        gravaArquivo.append(" ")
        gravaArquivo.append(roboInstance.getTipoGrafico())
        gravaArquivo.append(" ")
        gravaArquivo.append(roboInstance.getAlavancagem())
        gravaArquivo.append(" ")
        gravaArquivo.append(roboInstance.getQuantidadeCandle())

        if(roboInstance.nomeRoboAtivado() == null)

            roboInstance.nomeRoboAtivado = "Nenhum"
        else
            roboInstance.nomeRoboAtivado = roboInstance.getNomeRobo()

        print roboInstance.nomeRoboAtivado 
     
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
