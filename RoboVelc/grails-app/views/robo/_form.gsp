<%@ page import="robovelc.Robo" %>



<div class="fieldcontain ${hasErrors(bean: roboInstance, field: 'nomeRobo', 'error')} ">
	<label for="nomeRobo">
		<g:message code="robo.nomeRobo.label" default="Nome Robo" />
		
	</label>
	<g:textField name="nomeRobo" maxlength="30" value="${roboInstance?.nomeRobo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: roboInstance, field: 'alavancagem', 'error')} required">
	<label for="alavancagem">
		<g:message code="robo.alavancagem.label" default="Alavancagem" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="alavancagem" value="${fieldValue(bean: roboInstance, field: 'alavancagem')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: roboInstance, field: 'quantidadeCandle', 'error')} required">
	<label for="quantidadeCandle">
		<g:message code="robo.quantidadeCandle.label" default="Quantidade Candle" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="quantidadeCandle" value="${fieldValue(bean: roboInstance, field: 'quantidadeCandle')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: roboInstance, field: 'tipoGrafico', 'error')} ">
	<label for="tipoGrafico">
		<g:message code="robo.tipoGrafico.label" default="Tipo Grafico" />
		
	</label>
	<g:textField name="tipoGrafico" value="${roboInstance?.tipoGrafico}"/>

</div>

