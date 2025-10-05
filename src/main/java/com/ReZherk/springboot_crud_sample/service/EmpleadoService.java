package com.ReZherk.springboot_crud_sample.service;

import java.util.List;

import com.ReZherk.springboot_crud_sample.entity.Empleado;

public interface EmpleadoService {

 List<Empleado> listarTodos();

 Empleado buscarPorId(Integer id);

 Empleado guardar(Empleado empleado);

 Empleado actualizar(Integer id, Empleado empleado);

 void eliminar(Integer id);

}
