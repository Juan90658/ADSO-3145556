package com.sena.app.IRepository;

import com.sena.app.Entity.ViewAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IViewActionRepository extends JpaRepository<ViewAction, Long> {
}