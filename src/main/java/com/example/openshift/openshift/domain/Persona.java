/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.openshift.openshift.domain;

import lombok.Data;

/**
 *
 * @author 15-cd006
 */
@Data
public class Persona {
    
    private String id;
    private String nombres;
    private String apellidos;
    private String email;
    private String direccion;
    private int telefono;

}
