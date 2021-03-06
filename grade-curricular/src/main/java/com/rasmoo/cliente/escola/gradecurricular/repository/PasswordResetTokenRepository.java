package com.rasmoo.cliente.escola.gradecurricular.repository ;

import com.rasmoo.cliente.escola.gradecurricular.entity.PasswordResetTokenEntity;
import org.springframework.data.repository.CrudRepository;


public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long>{
	PasswordResetTokenEntity findByToken(String token);
}
