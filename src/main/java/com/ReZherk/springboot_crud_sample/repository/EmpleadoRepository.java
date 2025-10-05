package com.ReZherk.springboot_crud_sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ReZherk.springboot_crud_sample.entity.Empleado;;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

}
