package org.java;


import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EnvioCorreos{   
    
    
    
             public static void main(String[] args) throws MessagingException {
        
                //  EnvioCorreos EnviarAdjunto = new EnvioCorreos("cvaros15@gmail.com","ucyxqsrpeupffowe","c.varos@hotmail.com", "Prueba","hola", {"C:\\Users\\Usuario\\Desktop\\1.txt","C:\\Users\\Usuario\\Desktop\\2.txt" );
               EnvioCorreos EnviarAdjunto = new EnvioCorreos();
                EnviarAdjunto.Enviar();
        
    }
    
    String miCorreo = "proyectosoftware3@gmail.com";
    String miPassword = "adminadmin123";
    String servidorSMTP="smtp.gmail.com";
    String puertoEnvio="587";
    String[] destinatarios = {"luxofox93@gmail.com" , "proyectosoftware3@gmail.com"};
    String asunto ="Asunto del mensaje";
    String cuerpo = "Cuerpo del mensaje";
    String[] archivoAdjunto = {"C:\\Users\\Usuario\\Desktop\\CorreoJava\\1.txt","C:\\Users\\Usuario\\Desktop\\CorreoJava\\2.txt"};
    String[] destinatarioOculto = {"proyectosoftware3@gmail.com"};
    String[] destinatarioExtra = {"proyectosoftware3@gmail.com"};
    
    public EnvioCorreos(){};
    
  public EnvioCorreos(String usuario,String pass,String[] dest,String asun,String mens,String[] archivo){
        miPassword=pass;  
        destinatarios=dest;
        asunto=asun;
        cuerpo=mens;
        archivoAdjunto=archivo;  
        
     }
    
    public EnvioCorreos(String usuario,String pass,String[] dest,String asun,String mens,String[] archivo,String[] BCC, String[] CC){
        miPassword=pass;  
        destinatarios=dest;
        asunto=asun;
        cuerpo=mens;
        archivoAdjunto=archivo;  
        destinatarioOculto=BCC;
        destinatarioExtra=CC;
        
        
     }
  
    public void Enviar() throws MessagingException
    {
            Properties props=null;
            props = new Properties();
            props.put("mail.smtp.host", servidorSMTP);
            props.setProperty("mail.smtp.starttls.enable", "true");//si usa Yahoo comentar esta linea         
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", miCorreo);
            props.setProperty("mail.smtp.auth", "true");
            SecurityManager security = System.getSecurityManager();
     
            Authenticator auth = new EnvioCorreos.autentificadorSMTP();
            Session session = Session.getInstance(props, auth);
           // session.setDebug(true); //Descomentar para ver el proceso de envio detalladamente
            
            // Se compone la parte del texto
            BodyPart texto = new MimeBodyPart();
            texto.setText(cuerpo);
            
            // Se compone el adjunto 
            BodyPart[] adjunto=new BodyPart[archivoAdjunto.length];
            for(int j=0;j<archivoAdjunto.length;j++){
            adjunto[j]=new MimeBodyPart();
            adjunto[j].setDataHandler(
                new DataHandler(new FileDataSource(archivoAdjunto[j])));
            
            String[] rutaArchivo = archivoAdjunto[j].split("/");//separamos las palabras que forman la url y las                 ponemos en arreglo  de cadenas
            int nombre=rutaArchivo.length-1;//del array buscamos la ultima posicion
            adjunto[j].setFileName(rutaArchivo[nombre]);//la ultima posicion debe tener el nombre del archivo
            }
            

            // Una MultiParte para agrupar texto e imagen.
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            for(BodyPart aux:adjunto){
                multiParte.addBodyPart(aux);
            }
            

            // Se compone el correo, dando to, from, subject y el
            // contenido.
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(miCorreo));
            Address []destinos = new Address[destinatarios.length];//Aqui usamos el arreglo de destinatarios
            for(int i=0;i<destinos.length;i++){
                destinos[i]=new InternetAddress(destinatarios[i]);
            }
            
             Address []destinosOcultos = new Address[destinatarioOculto.length];//Aqui usamos el arreglo de destinatarios
            for(int i=0;i<destinosOcultos.length;i++){
                destinosOcultos[i]=new InternetAddress(destinatarioOculto[i]);
            }
            
            Address []destinosExtra = new Address[destinatarioExtra.length];//Aqui usamos el arreglo de destinatarios
            for(int i=0;i<destinosExtra.length;i++){
                destinosExtra[i]=new InternetAddress(destinatarioExtra[i]);
            }
            
            message.addRecipients(Message.RecipientType.TO, destinos);//agregamos los destinatarios
            message.addRecipients(Message.RecipientType.BCC,destinosOcultos); //agregamos los destinatarios ocultos
            message.addRecipients(Message.RecipientType.CC,destinosExtra); //agregamos los destinatarios extras
            message.setSubject(asunto);
            message.setContent(multiParte);

            // Se envia el correo.
            Transport t = session.getTransport("smtp");
            t.connect(miCorreo, miPassword);
            t.sendMessage(message, message.getAllRecipients());
            System.out.println("Correo Enviado exitosamente!"); 
            t.close();    
        }
     private class autentificadorSMTP extends javax.mail.Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(miCorreo, miPassword);
        }
    }
        
     

     
    }


    
    
    


