package com.adarshcodes.project.ai_driven_app_builder.repository;

import com.adarshcodes.project.ai_driven_app_builder.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
