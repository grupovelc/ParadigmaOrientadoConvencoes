package expertvelc

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(CorrelacaoService)
class CorrelacaoServiceSpec extends Specification {
	CorrelacaoService correlacaoServiceTest;

    def setup() {
    	correlacaoServiceTest = new CorrelacaoService();
    }

    def cleanup() {
    	//super.cleanup();
    }

    void testCalculoCorrelacao() {
    	assertEquals 1, correlacaoServiceTest.testCalculoCorrelacao();
    }
}
