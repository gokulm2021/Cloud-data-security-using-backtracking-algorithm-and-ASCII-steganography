   import java.io.*;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
   import java.sql.*;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
   import javax.servlet.*;
   import javax.servlet.http.*;
   import java.util.Base64;
   public class ASCIIcodeGeneration extends HttpServlet {
    String username;
    String password;
    String type1="",key2="";
    Connection con=null;
    Statement st=null,st1=null,st2=null;
    ResultSet rs=null,rs1=null,rs2=null;
   
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
        String receiver = req.getParameter("receiver");
        String message = req.getParameter("message");
        String cmessage = req.getParameter("cmessage");
        String sk = req.getParameter("sk");
        String username = req.getParameter("username");
        String id = req.getParameter("id");
     
	HttpSession sn = req.getSession(true);
    // sn.setAttribute("username",username);
    //  sn.setAttribute("group",type1);
    //  System.out.println(username+","+password+","+key2+","+type1);
        
       
        sn.setAttribute("username",username);
		RequestDispatcher rd = null;
                
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clouddatasecurity","root","password");
           
            String mascii = "";
            
           char[] stringToCharArray = message.toCharArray();
 
		for (char output : stringToCharArray) {
			//System.out.println(output);
		
                char ch = output;
                int ascii = ch;
                mascii = mascii + ascii;
            }
                
                 String cascii = "";
            
           char[] stringToCharArray1 = cmessage.toCharArray();
 
		for (char output1 : stringToCharArray1) {
			//System.out.println(output);
		
                char ch = output1;
                int ascii = ch;
                cascii = cascii + ascii;
            }
          String smessage = mascii + cascii + sk;
           
                st1 = con.createStatement();
            int add=st1.executeUpdate("insert into message(username,receiver,message,covermessage,stegomessage,key1) values('"+username+"','"+receiver+"','"+message+"','"+cmessage+"','"+smessage+"','"+sk+"')");
        
          
            sn.setAttribute("receiver",receiver);
            sn.setAttribute("message",message);
           sn.setAttribute("cmessage",cmessage);
           sn.setAttribute("mascii",mascii);
           sn.setAttribute("cascii",cascii);
           sn.setAttribute("smessage",smessage);
           sn.setAttribute("sk",sk);
            sn.setAttribute("id",id);
            
               rd=req.getRequestDispatcher("resultpage3.jsp");
	        
	     rd.forward(req,res);
        }
        catch(Exception e2)
         {
            System.out.println("Exception : "+e2.toString());
        }
    }
    
    
}