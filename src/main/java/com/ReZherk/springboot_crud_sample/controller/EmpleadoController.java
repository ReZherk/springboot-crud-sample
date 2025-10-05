package com.ReZherk.springboot_crud_sample.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ReZherk.springboot_crud_sample.entity.Empleado;
import com.ReZherk.springboot_crud_sample.service.EmpleadoService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/empleados")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class EmpleadoController {

 private final EmpleadoService empleadoService;

 @GetMapping
 public List<Empleado> listar() {
  return empleadoService.listarTodos();
 }

 @GetMapping("/{id}")
 public ResponseEntity<Empleado> obtener(@PathVariable Integer id) {
  Empleado emp = empleadoService.buscarPorId(id);
  return (emp != null) ? ResponseEntity.ok(emp) : ResponseEntity.notFound().build();
 }

 @PostMapping
 public Empleado crear(@RequestBody Empleado empleado) {
  return empleadoService.guardar(empleado);
 }

 @PutMapping("/{id}")
 public ResponseEntity<Empleado> actualizar(@PathVariable Integer id, @RequestBody Empleado empleado) {
  Empleado actualizado = empleadoService.actualizar(id, empleado);
  return (actualizado != null) ? ResponseEntity.ok(actualizado) : ResponseEntity.notFound().build();
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
  empleadoService.eliminar(id);
  return ResponseEntity.noContent().build();
 }
}
