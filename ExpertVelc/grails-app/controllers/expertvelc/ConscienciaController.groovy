package expertvelc



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ConscienciaController {
    def correlacaoService;

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Consciencia.list(params), model:[conscienciaInstanceCount: Consciencia.count()]
    }

    def show(Consciencia conscienciaInstance) {
        respond conscienciaInstance
    }

    def create() {
        respond new Consciencia(params)
    }

    @Transactional
    def save(Consciencia conscienciaInstance) {
        if (conscienciaInstance == null) {
            notFound()
            return
        }

        if (conscienciaInstance.hasErrors()) {
            respond conscienciaInstance.errors, view:'create'
            return
        }

        correlacaoService.calculoCorrelacao();

        println params.tempoOperacao

        conscienciaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'conscienciaInstance.label', default: 'Consciencia'), conscienciaInstance.id])
                redirect conscienciaInstance
            }
            '*' { respond conscienciaInstance, [status: CREATED] }
        }
    }

    def edit(Consciencia conscienciaInstance) {
        respond conscienciaInstance
    }

    @Transactional
    def update(Consciencia conscienciaInstance) {
        if (conscienciaInstance == null) {
            notFound()
            return
        }

        if (conscienciaInstance.hasErrors()) {
            respond conscienciaInstance.errors, view:'edit'
            return
        }

        conscienciaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Consciencia.label', default: 'Consciencia'), conscienciaInstance.id])
                redirect conscienciaInstance
            }
            '*'{ respond conscienciaInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Consciencia conscienciaInstance) {

        if (conscienciaInstance == null) {
            notFound()
            return
        }

        conscienciaInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Consciencia.label', default: 'Consciencia'), conscienciaInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'conscienciaInstance.label', default: 'Consciencia'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
