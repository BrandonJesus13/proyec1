/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UAM.proyecto.vacunacion;


import java.io.*;
public class LeerExpedientes {
     public static void main (String [] args) throws IOException, NotSerializableException, ClassNotFoundException {
        FileInputStream entArch = new FileInputStream ("expedientes.dat");
        ObjectInputStream entStream = new ObjectInputStream (entArch);
        
        ExpedienteVacunacion e1 = (ExpedienteVacunacion) entStream.readObject ();
        ExpedienteVacunacion e2 = (ExpedienteVacunacion) entStream.readObject ();
        ExpedienteVacunacion e3 = (ExpedienteVacunacion) entStream.readObject ();
        
        System.out.println ("Exito");
        
        entStream.close ();
    }
}
    
