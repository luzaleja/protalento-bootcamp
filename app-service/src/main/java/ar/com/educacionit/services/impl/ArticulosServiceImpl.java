package ar.com.educacionit.services.impl;

import ar.com.educacionit.dao.CategoriaDao;
import ar.com.educacionit.dao.MarcasDao;
import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.dao.impl.ArticuloDaoImpl;
import ar.com.educacionit.dao.impl.CategoriaDaoImpl;
import ar.com.educacionit.dao.impl.MarcasDaoImpl;
import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.domain.Categorias;
import ar.com.educacionit.domain.Marcas;
import ar.com.educacionit.services.ArticulosService;
import ar.com.educacionit.services.exceptions.ServiceException;

public class ArticulosServiceImpl extends AbstractBaseService<Articulos> implements ArticulosService {

	//usar otros daos
	private CategoriaDao categoriaDao;
	private MarcasDao marcasDao;

	public ArticulosServiceImpl() {
		super(new ArticuloDaoImpl());
		this.categoriaDao = new CategoriaDaoImpl();
		this.marcasDao = new MarcasDaoImpl();		
	}

	@Override
	public Articulos getOne(Long id) throws ServiceException {
		try {
			Articulos articulo = this.genericDao.getOne(id);
			Marcas marcaDelArticulo = this.marcasDao.getOne(articulo.getMarcasId());
			Categorias categoriaDelArticulo = this.categoriaDao.getOne(articulo.getCategoriasId());

			articulo.setMarca(marcaDelArticulo);
			articulo.setCategoria(categoriaDelArticulo);
			return articulo;
		} catch (GenericException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

}
