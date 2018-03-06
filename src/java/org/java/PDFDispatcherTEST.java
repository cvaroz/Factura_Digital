package org.java;

public class PDFDispatcherTEST {

	// SMTP info
    String host = "smtp.gmail.com";
    String port = "587";
    String mailFrom = "your-email-address";
    String password = "your-email-password";

    // message info
    String mailTo = "your-friend-email";
    String subject = "New email with attachments";
    String message = "I have some attachments for you.";

    // attachments
    String[] attachFiles = new String[3];{
	    attachFiles[0] = "e:/Test/Picture.png";
	    attachFiles[1] = "e:/Test/Music.mp3";
	    attachFiles[2] = "e:/Test/Video.mp4";
    
	    try {
	        InvoicePDFDispatcher.sendEmailWithAttachments(host, port, mailFrom, password, mailTo,
	            subject, message, attachFiles);
	        System.out.println("Email sent.");
	    } catch (Exception ex) {
	        System.out.println("Could not send email.");
	        ex.printStackTrace();
	    }
    }
}
