package com.rasmoo.cliente.escola.gradecurricular.service;

import com.rasmoo.cliente.escola.gradecurricular.shared.dto.AddressDTO;

import java.util.List;


public interface AddressService {
	List<AddressDTO> getAddresses(String userId);
    AddressDTO getAddress(String addressId);
}
