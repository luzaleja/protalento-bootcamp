<%@page import="ar.com.educacionit.web.enums.ViewKeysEnum"%>
<%
	String error = (String)request.getAttribute(ViewKeysEnum.ERROR_GENERAL.getParam());	
%>

<%
	if(error != null) {
%>
	<div class="alert alert-danger" role="alert">
		<%=error%>
	</div>
<%
	}
%>
