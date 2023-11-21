package com.lot.service;

import com.lot.model.Owner;
import com.lot.model.Vehicle;
import com.lot.repository.OwnerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class OwnerServiceImpl implements OwnerService{
    OwnerRepository ownerRepository;
    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElseGet(null);
    }
}
