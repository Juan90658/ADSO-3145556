package com.sena.app.IRepository;

import com.sena.app.Entity.RoleModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleModuleRepository extends JpaRepository<RoleModule, Long> {
}