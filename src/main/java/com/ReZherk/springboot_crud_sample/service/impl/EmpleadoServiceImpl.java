package com.ReZherk.springboot_crud_sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ReZherk.springboot_crud_sample.entity.Empleado;
import com.ReZherk.springboot_crud_sample.repository.EmpleadoRepository;
import com.ReZherk.springboot_crud_sample.service.EmpleadoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

 private final EmpleadoRepository empleadoRepository;

 @Override
 public List<Empleado> listarTodos() {
  return empleadoRepository.findAll();
 }

 @Override
 public Empleado buscarPorId(Integer id) {
  return empleadoRepository.findById(id).orElse(null);
 }

 @Override
 public Empleado guardar(Empleado empleado) {
  return empleadoRepository.save(empleado);
 }

 @Override
 public Empleado actualizar(Integer id, Empleado empleado) {

  Empleado existente = empleadoRepository.findById(id).orElse(null);
  if (existente != null) {
   existente.setNombre(empleado.getNombre());
   existente.setCorreo(empleado.getCorreo());
   existente.setPuesto(empleado.getPuesto());
   existente.setSalario(empleado.getSalario());

   return empleadoRepository.save(existente);

  }

  return null;
 }

 @Override
 public void eliminar(Integer id) {
  empleadoRepository.deleteById(id);
 }

}
