package com.iemr.helpline104.repository.hihl;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.helpline104.data.hihl.M_104hygieneselfcare;

@Repository
public interface M_104hygieneselfcareRepo extends CrudRepository<M_104hygieneselfcare, Integer> {
	List<M_104hygieneselfcare> findByDeleted(Boolean deleted);
}
