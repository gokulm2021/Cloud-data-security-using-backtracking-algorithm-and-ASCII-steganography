   import java.io.*;
   import java.sql.*;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
   import javax.servlet.*;
   import javax.servlet.http.*;
   import java.util.Base64;
   public class SendData extends HttpServlet {
    String username;
    String password;
    String type1="",key2="";
    Connection con=null;
    Statement st=null,st1=null,st2=null;
    ResultSet rs=null,rs1=null,rs2=null;
   
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
        String receiver = req.getParameter("receiver");
        String message = req.getParameter("message");
        
        
     
	HttpSession sn = req.getSession(true);
    // sn.setAttribute("username",username);
    //  sn.setAttribute("group",type1);
    //  System.out.println(username+","+password+","+key2+","+type1);
        
        username = sn.getAttribute("username").toString();
        sn.setAttribute("username",username);
		RequestDispatcher rd = null;
                
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clouddatasecurity","root","password");
           
           
              
          
          
       
         //    st1 = con.createStatement();
          //  int add=st1.executeUpdate("insert into message(username,receiver,aesinput,desinput,aesencryption,desencryption,key1) values('"+username+"','"+receiver+"','"+aesinput+"','"+desinput+"','"+aesencryptedString+"','"+desencryptedString+"','"+key+"')");
           
            int id=1;
             st = con.createStatement();
            
            rs = st.executeQuery("select max(id) from message");
            
            
            if(rs.next()) {
                id=rs.getInt(1)+1;
            
            }
            sn.setAttribute("receiver",receiver);
            sn.setAttribute("message",message);
           
            sn.setAttribute("id",id);
            
               rd=req.getRequestDispatcher("resultpage.jsp");
	        
	     rd.forward(req,res);
        }
        catch(Exception e2)
         {
            System.out.println("Exception : "+e2.toString());
        }
    }
    
    
}