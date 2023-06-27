package com.iemr.helpline104.repository.users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.iemr.helpline104.data.users.M_UserSecurityQMapping;

@Repository
@RestResource(exported = false)
public interface IEMRUserSecurityQuesAnsRepository extends CrudRepository<M_UserSecurityQMapping, Long> {

}
