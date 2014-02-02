package dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import domain.Produto;


@Named
@RequestScoped
public class ProdutoDAO extends BaseDAO<Produto, Integer> {

	
	
}
