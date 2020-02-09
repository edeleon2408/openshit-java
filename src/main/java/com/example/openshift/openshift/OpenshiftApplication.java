package com.example.openshift.openshift;

import com.example.openshift.openshift.domain.Persona;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}
        
        @RequestMapping("/")
        public String hello(){
            return "Hola desde openshift";
        }
        
        @RequestMapping("/listar-personas")
        public ResponseEntity<ArrayList<Persona>> listarPersonas(){
            Persona p1 = new Persona();
            Persona p2 = new Persona();
            Persona p3 = new Persona();
            
            p1.setId("1");
            p1.setNombres("Erwin");
            p1.setApellidos("De León Martínez");
            p1.setDireccion("Bogota");
            p1.setEmail("edeleon2408@gmail.com");
            p1.setTelefono(1);
            
            p1.setId("2");
            p1.setNombres("Manuel");
            p1.setApellidos("De León Martínez");
            p1.setDireccion("Barranquilla");
            p1.setEmail("manuel@gmail.com");
            p1.setTelefono(2);
            
            p1.setId("3");
            p1.setNombres("Gladis");
            p1.setApellidos("Martínez Portela");
            p1.setDireccion("Cali");
            p1.setEmail("gladis@gmail.com");
            p1.setTelefono(3);
            
            ArrayList<Persona> lstPersona = new ArrayList<>();
            lstPersona.add(p1);
            lstPersona.add(p2);
            lstPersona.add(p3);
            
            return ResponseEntity.ok(lstPersona);
        }

}
