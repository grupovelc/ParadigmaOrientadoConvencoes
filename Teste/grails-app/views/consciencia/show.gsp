
<%@ page import="teste.Consciencia" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'consciencia.label', default: 'Consciencia')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-consciencia" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-consciencia" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list consciencia">
			
				<g:if test="${conscienciaInstance?.nomeConfiguracao}">
				<li class="fieldcontain">
					<span id="nomeConfiguracao-label" class="property-label"><g:message code="consciencia.nomeConfiguracao.label" default="Nome Configuracao" /></span>
					
						<span class="property-value" aria-labelledby="nomeConfiguracao-label"><g:fieldValue bean="${conscienciaInstance}" field="nomeConfiguracao"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${conscienciaInstance?.quantidadeBarras}">
				<li class="fieldcontain">
					<span id="quantidadeBarras-label" class="property-label"><g:message code="consciencia.quantidadeBarras.label" default="Quantidade Barras" /></span>
					
						<span class="property-value" aria-labelledby="quantidadeBarras-label"><g:fieldValue bean="${conscienciaInstance}" field="quantidadeBarras"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${conscienciaInstance?.tempoOperacao}">
				<li class="fieldcontain">
					<span id="tempoOperacao-label" class="property-label"><g:message code="consciencia.tempoOperacao.label" default="Tempo Operacao" /></span>
					
						<span class="property-value" aria-labelledby="tempoOperacao-label"><g:fieldValue bean="${conscienciaInstance}" field="tempoOperacao"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:conscienciaInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${conscienciaInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
