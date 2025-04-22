   import java.io.*;
   import java.sql.*;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
   import javax.servlet.*;
   import javax.servlet.http.*;
   import java.util.Base64;
   public class CoverMessageGeneration extends HttpServlet {
    String username;
    String password;
    String type1="",key2="";
    Connection con=null;
    Statement st=null,st1=null,st2=null;
    ResultSet rs=null,rs1=null,rs2=null;
   
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
        String receiver = req.getParameter("receiver");
        String message = req.getParameter("message");
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
           
           
              
          
           String dCase = "abcdefghijklmnopqrstuvwxyz";
            String uCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          
           String intChar = "0123456789";
            Random r = new Random();
            System.out.println("Cover Message Generation...");
            String pass = "";
		    while (pass.length () != 16){
            int rPick = r.nextInt(4);
            if (rPick == 0){
                int spot = r.nextInt(26);
                pass += dCase.charAt(spot);
            } else if (rPick == 1) {
                int spot = r.nextInt (26);
                pass += uCase.charAt(spot);
            }  else if (rPick == 3){
                int spot = r.nextInt (10);
                pass += intChar.charAt (spot);
            }
                    }
           
        
          
       
         //    st1 = con.createStatement();
          //  int add=st1.executeUpdate("insert into message(username,receiver,aesinput,desinput,aesencryption,desencryption,key1) values('"+username+"','"+receiver+"','"+aesinput+"','"+desinput+"','"+aesencryptedString+"','"+desencryptedString+"','"+key+"')");
           
           
            sn.setAttribute("receiver",receiver);
            sn.setAttribute("message",message);
           sn.setAttribute("cmessage",pass);
            sn.setAttribute("id",id);
            
               rd=req.getRequestDispatcher("resultpage1.jsp");
	        
	     rd.forward(req,res);
        }
        catch(Exception e2)
         {
            System.out.println("Exception : "+e2.toString());
        }
    }
    
    
}