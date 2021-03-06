package com.rasmoo.cliente.escola.gradecurricular.service.impl  ;

import java.util.ArrayList;
import java.util.List;

import com.rasmoo.cliente.escola.gradecurricular.entity.AddressEntity;
import com.rasmoo.cliente.escola.gradecurricular.entity.UserEntity;
import com.rasmoo.cliente.escola.gradecurricular.repository.AddressRepository;
import com.rasmoo.cliente.escola.gradecurricular.repository.UserRepository;
import com.rasmoo.cliente.escola.gradecurricular.service.AddressService;
import com.rasmoo.cliente.escola.gradecurricular.shared.dto.AddressDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
    UserRepository userRepository;
	
	@Autowired
    AddressRepository addressRepository;
	
	@Override
	public List<AddressDTO> getAddresses(String userId) {
        List<AddressDTO> returnValue = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();
        
        UserEntity userEntity = userRepository.findByUserId(userId);
        if(userEntity==null) return returnValue;
 
        Iterable<AddressEntity> addresses = addressRepository.findAllByUserDetails(userEntity);
        for(AddressEntity addressEntity:addresses)
        {
            returnValue.add( modelMapper.map(addressEntity, AddressDTO.class) );
        }
        
        return returnValue;
	}

	@Override
	public AddressDTO getAddress(String addressId) {
        AddressDTO returnValue = null;

        AddressEntity addressEntity = addressRepository.findByAddressId(addressId);
        
        if(addressEntity!=null)
        {
            returnValue = new ModelMapper().map(addressEntity, AddressDTO.class);
        }
 
        return returnValue;
	}

}
