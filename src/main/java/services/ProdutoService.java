package services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.BaseDAO;
import dao.ProdutoDAO;
import domain.Produto;

@Named
@RequestScoped
@SuppressWarnings({"rawtypes"})
public class ProdutoService extends ApplicationServiceImpl<Produto> {
	

	@Inject
	private ProdutoDAO produtoDao;
	

	@Override
	public BaseDAO getDao() {
		return produtoDao;
	}
	
	
}
