<%@ page import="expertvelc.Consciencia" %>



<div class="fieldcontain ${hasErrors(bean: conscienciaInstance, field: 'nomeConfiguracao', 'error')} ">
	<label for="nomeConfiguracao">
		<g:message code="consciencia.nomeConfiguracao.label" default="Nome Configuracao" />
		
	</label>
	<g:textField name="nomeConfiguracao" maxlength="20" value="${conscienciaInstance?.nomeConfiguracao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: conscienciaInstance, field: 'quantidadeBarras', 'error')} required">
	<label for="quantidadeBarras">
		<g:message code="consciencia.quantidadeBarras.label" default="Quantidade Barras" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="quantidadeBarras" value="${fieldValue(bean: conscienciaInstance, field: 'quantidadeBarras')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: conscienciaInstance, field: 'tempoOperacao', 'error')} required">
	<label for="tempoOperacao">
		<g:message code="consciencia.tempoOperacao.label" default="Tempo Operacao" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="tempoOperacao" value="${fieldValue(bean: conscienciaInstance, field: 'tempoOperacao')}" required=""/>

</div>

