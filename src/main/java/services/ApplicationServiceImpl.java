package services;

import java.util.List;

import javax.enterprise.context.Dependent;

import dao.BaseDAO;
import domain.EntityBase;

@Dependent
public class ApplicationServiceImpl<T extends EntityBase> implements ApplicationServiceBase<T> {

	protected BaseDAO<T, Integer> dao;
	
	
	public T getById(Integer id){
		return dao.getById(id);
	}


	public List<T> listAll() {
		return dao.listAll();
	}

	@Override
	public String create(T t) {
		validateBeforeCreate();
		dao.create(t);
		return "sucesso";
	}

	public void validateBeforeCreate() {
		
	}


	@Override
	public String update(T t) {
		dao.update(t);
		return "sucesso";
	}

	@Override
	public void remove(T t) {
		dao.delete(t);
		
	}
	
}
