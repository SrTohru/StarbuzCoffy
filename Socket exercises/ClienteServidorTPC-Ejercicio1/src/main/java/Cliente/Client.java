/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP 240 G8
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Own pc's IP
        final String HOST = "127.0.0.1";
        final int PORT = 5000;
        DataInputStream input;
        DataOutputStream output;

        try {
        
            Socket sc = new Socket(HOST, PORT);
        
            input = new DataInputStream(sc.getInputStream());
            output = new DataOutputStream(sc.getOutputStream());
            
            output.writeUTF("Hello World from Client :D");
            String msg = input.readUTF();
                
            System.out.println(msg);
            
            sc.close();
        
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
