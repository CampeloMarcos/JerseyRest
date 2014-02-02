package services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.ProdutoDAO;
import domain.Produto;

@Named
@RequestScoped
public class ProdutoService extends ApplicationServiceImpl<Produto> {
	
	public ProdutoService() {
	}

	@Inject
	public ProdutoService(ProdutoDAO dao) {
		this.dao = dao;
	}
	
}
