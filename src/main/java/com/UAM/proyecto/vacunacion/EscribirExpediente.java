/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UAM.proyecto.vacunacion;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class EscribirExpediente {
    public static void main(String[]args)throws IOException, NotSerializableException{
        ExpedienteVacunacion e1 = new ExpedienteVacunacion (206, new Persona("Aaron", "Alcocer", "Rodriguez", "ROAA260895HMCRJR0", " 5598467200", "na", new Vacuna("Sputnik V", TipoDosis.Unica), "aaron.alcocer@gmail.com", Padecimientos.Sin_Padecimiento, 25), 
                new Domicilio("Anzures", "NA", "25", "Pedregal", "Obregon", Estado.Morelos, "53680"));
        
        ExpedienteVacunacion e2 = new ExpedienteVacunacion (207, new Persona("Brandon", "bonilla", "Reyes", "REBB131196HMCGH9", " 5670815694", "5562158476", new Vacuna("Astrazeneca", TipoDosis.Doble), "brandonbreyrs@gmail.com", Padecimientos.Desconocido, 23), 
                new Domicilio("Paralela 4", "3", "15", "Santa Maria la Rivera", "Miguel Hidalgo", Estado.CiudadDeMexico, "160200" ) );
        
        ExpedienteVacunacion e3 = new ExpedienteVacunacion (208, new Persona("Eduardo", "Cortez", "Montaño", "COME960831HMCRND03", " 5581568086", "NA", new Vacuna("Sputnik V", TipoDosis.Unica), "eduardo.cortez@gmail.com", Padecimientos.Hitpertensión, 25), 
                new Domicilio("Carrillo Puerto", "NA", "8", "La Soledad", "Naucalpan", Estado.EstadoDeMexico, "53730"  ));
        
        FileOutputStream salArch= new FileOutputStream("expedientes.dat");
        ObjectOutputStream salStream = new ObjectOutputStream(salArch);
        salStream.writeObject(e1);
        salStream.writeObject(e2);
        salStream.writeObject(e3);
        
        
        System.out.println("Se añadio a los expedientes");
        salStream.close();
    } 
    
}
