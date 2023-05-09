/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicounoecuatro;


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


/**
 *
 * @author Marcelo
 */
public class Empleado {
    private String nombre,antiguedad;
    private long salario;
    private LocalDate fechaContratacion;
    private LocalDate fechaActual = LocalDate.now();
    
    public Empleado(String nombre, long salario,int dia,int mes,int año) {
        this.nombre = nombre;
        this.salario = salario;
        fechaContratacion= LocalDate.of(año, Month.of(mes), dia);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public void setFechaContratacion(int año,int mes,int dia) {
        this.fechaContratacion = LocalDate.of(año, Month.of(mes), dia);
    }

    public String getNombre() {
        return nombre;
    }

    public long getSalario() {
        return salario;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }
   
    public String getAntiguedad(){
        Period periodo=Period.between(fechaContratacion, fechaActual);
        antiguedad=""+periodo.getYears()+ " anos con "+periodo.getMonths()+" meses";  
        return antiguedad;   
    }
    
    
}
