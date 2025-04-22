   import java.io.*;
   import java.sql.*;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
   import javax.servlet.*;
   import javax.servlet.http.*;
   public class ViewMessage extends HttpServlet {
    String username;
    String password;
    String type1="",key2="";
    Connection con=null;
    Statement st=null,st1=null,st2=null;
    ResultSet rs=null,rs1=null,rs2=null;
    
     private static final String initVector = "encryptionIntVec";
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
        String fileid = req.getParameter("filSelect");
        String key = req.getParameter("key");
        
        String s3="";
        String s4="";
        
     //   key2 = req.getParameter("key");
	//type1 = req.getParameter("type1");
     //   int count =0;
	HttpSession sn = req.getSession(true);
     sn.setAttribute("fileid",fileid);
    //  sn.setAttribute("group",type1);
      System.out.println(fileid+","+key);
		RequestDispatcher rd = null;
                
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clouddatasecurity","root","password");
          
             st = con.createStatement();
            
            rs = st.executeQuery("select * from message where id='"+fileid+"' && key1='"+key+"'");
            
            
            if(rs.next()) {
                
                String s1 = rs.getString(6);
                String s2 = rs.getString(7);
                
               
                
               
 
                  
                
               rd=req.getRequestDispatcher("viewmessage.jsp");
	        
	    
            }
            else
            {
                rd=req.getRequestDispatcher("failure2.jsp");

            }
            
             rd.forward(req,res);
        }
        catch(Exception e2)
         {
            System.out.println("Exception : "+e2.toString());
        }
    }
}