<%@page import="ar.com.educacionit.web.enums.ViewEnums"%>
<%@page import="ar.com.educacionit.web.enums.Enumerable"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ar.com.educacionit.web.enums.ViewKeysEnum"%>
<%@page import="ar.com.educacionit.domain.Articulos"%>
<%@page import="java.util.Collection"%>
<%	
	Collection<Articulos> articulosOk = (Collection<Articulos>)request.getAttribute(ViewKeysEnum.ARTICULOS_OKS.getParam());
	if(articulosOk == null) {
		articulosOk = new ArrayList<>();
	}
	Collection<Articulos> articulosFails = (Collection<Articulos>)session.getAttribute(ViewKeysEnum.ARTICULOS_FAILS.getParam());
	if(articulosFails == null) {
		articulosFails = new ArrayList<>();
	}
%>
<h2>Listado OK</h2>
<table class="table">
 	<thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">T�tulo</th>
      <th scope="col">C�digo</th>
      <th scope="col">Precio</th>
      <th scope="col">Stock</th>
      <th scope="col">Id Marca</th>
      <th scope="col">Id Categoria</th>
    </tr>
  </thead>
  <tbody>
	<% for(Articulos aux: articulosOk){%>
	    <tr>
	      <td scope="row"><%=aux.getTitulo() %>&nbsp;</td>
	      <td><%=aux.getTitulo() %></td>
	      <td><%=aux.getCodigo() %></td>
	      <td><%=aux.getPrecio() %></td>
	      <td><%=aux.getStock() %></td>
	      <td><%=aux.getMarcasId() %></td>
	      <td><%=aux.getCategoriasId() %></td>
	    </tr>
   	<%} %>				    
  </tbody>
</table>

<h2>Listado Fails</h2>
<table class="table">
 	<thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">T�tulo</th>
      <th scope="col">C�digo</th>
      <th scope="col">Precio</th>
      <th scope="col">Stock</th>
      <th scope="col">Id Marca</th>
      <th scope="col">Id Categoria</th>
    </tr>
  </thead>
  <tbody>
	<% for(Articulos aux: articulosFails){%>
	    <tr>
	      <td scope="row"><%=aux.getTitulo() %>&nbsp;</td>
	      <td><%=aux.getTitulo() %></td>
	      <td><%=aux.getCodigo() %></td>
	      <td><%=aux.getPrecio() %></td>
	      <td><%=aux.getStock() %></td>
	      <td><%=aux.getMarcasId() %></td>
	      <td><%=aux.getCategoriasId() %></td>
	    </tr>
   	<%} %>				    
  </tbody>
</table>
<div class="row">
	<div class="col-xs-12 col-md-6 col-lg-4">
		<form action="<%=request.getContextPath()%>/controllers/GenerarArchivoErrorSevlet" method="POST" target="_new">
			<div class="input-group mb-3">
				<select name="formato" class="form-select" aria-label="Default select example">
				  <option value="1" selected>CSV</option>
				  <option value="2">XSL</option>
				  <option value="3">PDF</option>
				</select>
				<a class="btn btn-primary" href="<%=request.getContextPath()%>/controllers/CargarProductosServlet" role="button">
					Generar Archivo de Errores
				</a>
			</div>
		</form>
		
	</div>
</div>	