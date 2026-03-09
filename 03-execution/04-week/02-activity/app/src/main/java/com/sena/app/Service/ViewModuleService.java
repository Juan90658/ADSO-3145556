package com.sena.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.app.Entity.ViewModule;
import com.sena.app.IRepository.IViewModuleRepository;

@Service
public class ViewModuleService {
    @Autowired
    private IViewModuleRepository repository;

    public ViewModule save(ViewModule viewModule) {
        return repository.save(viewModule);
    }

    public List<ViewModule> All() {
        return repository.findAll();
    }
}