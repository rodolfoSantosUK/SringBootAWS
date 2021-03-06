package com.rasmoo.cliente.escola.gradecurricular.repository  ;

import java.util.List;

import com.rasmoo.cliente.escola.gradecurricular.entity.AddressEntity;
import com.rasmoo.cliente.escola.gradecurricular.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
	List<AddressEntity> findAllByUserDetails(UserEntity userEntity);
	AddressEntity findByAddressId(String addressId);
}
