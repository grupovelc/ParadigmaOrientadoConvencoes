
<%@ page import="expertvelc.Consciencia" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'consciencia.label', default: 'Consciencia')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-consciencia" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-consciencia" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="nomeConfiguracao" title="${message(code: 'consciencia.nomeConfiguracao.label', default: 'Nome Configuracao')}" />
					
						<g:sortableColumn property="quantidadeBarras" title="${message(code: 'consciencia.quantidadeBarras.label', default: 'Quantidade Barras')}" />
					
						<g:sortableColumn property="tempoOperacao" title="${message(code: 'consciencia.tempoOperacao.label', default: 'Tempo Operacao')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${conscienciaInstanceList}" status="i" var="conscienciaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${conscienciaInstance.id}">${fieldValue(bean: conscienciaInstance, field: "nomeConfiguracao")}</g:link></td>
					
						<td>${fieldValue(bean: conscienciaInstance, field: "quantidadeBarras")}</td>
					
						<td>${fieldValue(bean: conscienciaInstance, field: "tempoOperacao")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${conscienciaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
