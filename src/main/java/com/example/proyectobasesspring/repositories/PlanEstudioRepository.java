package com.example.proyectobasesspring.repositories;

import com.example.proyectobasesspring.model.PlanEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanEstudioRepository extends JpaRepository<PlanEstudio, Long> {
}