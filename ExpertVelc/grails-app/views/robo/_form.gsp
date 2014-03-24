<%@ page import="expertvelc.Robo" %>



<div class="fieldcontain ${hasErrors(bean: roboInstance, field: 'nomeConfiguracao', 'error')} ">
	<label for="nomeConfiguracao">
		<g:message code="robo.nomeConfiguracao.label" default="Nome Configuracao" />
		
	</label>
	<g:textField name="nomeConfiguracao" maxlength="30" value="${roboInstance?.nomeConfiguracao}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: roboInstance, field: 'alavancagem', 'error')} required">
	<label for="alavancagem">
		<g:message code="robo.alavancagem.label" default="Alavancagem" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="alavancagem" value="${fieldValue(bean: roboInstance, field: 'alavancagem')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: roboInstance, field: 'quantidadeCandles', 'error')} required">
	<label for="quantidadeCandles">
		<g:message code="robo.quantidadeCandles.label" default="Quantidade Candles" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="quantidadeCandles" value="${fieldValue(bean: roboInstance, field: 'quantidadeCandles')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: roboInstance, field: 'tipoGrafico', 'error')} ">
	<label for="tipoGrafico">
		<g:message code="robo.tipoGrafico.label" default="Tipo Grafico" />
		
	</label>
	<g:textField name="tipoGrafico" value="${roboInstance?.tipoGrafico}"/>

</div>

