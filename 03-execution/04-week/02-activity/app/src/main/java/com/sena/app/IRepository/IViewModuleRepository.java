package com.sena.app.IRepository;

import com.sena.app.Entity.ViewModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IViewModuleRepository extends JpaRepository<ViewModule, Long> {
}