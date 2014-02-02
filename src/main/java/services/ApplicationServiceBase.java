package services;

import java.util.List;

import javax.enterprise.context.Dependent;

import domain.EntityBase;

@Dependent
public interface ApplicationServiceBase<T extends EntityBase> {

	public String create(T t);
	
	public List<T> listAll();
	
	public String update(T t);
	
	public void remove(T t);
	
	public T getById(Integer id);
	
}
