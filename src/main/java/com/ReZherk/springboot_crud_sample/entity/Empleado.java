package com.ReZherk.springboot_crud_sample.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empleado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Empleado {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;

 @Column(nullable = false, length = 100)
 private String nombre;

 @Column(nullable = false, length = 100)
 private String correo;

 @Column(length = 100)
 private String puesto;

 /**
  * Salario del empleado.
  * Precisión: 10 dígitos en total, 2 decimales (ej: 99999999.99)
  * Nota: La validación de valores positivos debe hacerse en la capa de servicio
  */
 @Column(precision = 10, scale = 2)
 private BigDecimal salario;

}
