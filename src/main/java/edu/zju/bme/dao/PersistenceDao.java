package edu.zju.bme.dao;

import java.util.List;
import edu.zju.bme.model.ModelEntity;

public interface PersistenceDao {

	int insert(ModelEntity me);

	int delete(String hql);
	
	List<ModelEntity> select(String hql);

}
