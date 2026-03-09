package com.sena.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.app.Entity.RoleModule;
import com.sena.app.IRepository.IRoleModuleRepository;

@Service
public class RoleModuleService {
    @Autowired
    private IRoleModuleRepository repository;

    public RoleModule save(RoleModule roleModule) {
        return repository.save(roleModule);
    }

    public List<RoleModule> All() {
        return repository.findAll();
    }
}