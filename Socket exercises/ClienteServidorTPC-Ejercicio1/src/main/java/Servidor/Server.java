/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP 240 G8
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Port can't be in use
        final int PORT = 5000;
        DataInputStream input;
        DataOutputStream output;
        ServerSocket servidor = null;
        Socket sc = null;
        
        try {
            servidor = new ServerSocket(PORT);
            System.out.println("Server Open");
            
            while (true){
                //Connected user socket
                sc = servidor.accept();                
                input = new DataInputStream(sc.getInputStream());
                output = new DataOutputStream(sc.getOutputStream());
                System.out.println("Client connected");

                String msg = input.readUTF();
                System.out.println(msg);
            
                output.writeUTF("Hello World from Server :D");
                
                sc.close();
                
                System.out.println("Client disconnected");
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
