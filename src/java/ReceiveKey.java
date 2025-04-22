import java.awt.image.BufferedImage;
   import java.io.*;
   import java.sql.*;
import javax.imageio.ImageIO;
   import javax.servlet.*;
   import javax.servlet.http.*;
   public class ReceiveKey extends HttpServlet {
    String username;
    String password;
    String type1="",key2="";
    Connection con=null;
    Statement st=null,st1=null,st2=null;
    ResultSet rs=null,rs1=null,rs2=null;
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
        username = req.getParameter("username");
       String id = req.getParameter("id");
	HttpSession sn = req.getSession(true);
     sn.setAttribute("username",username);
    //  sn.setAttribute("group",type1);
    //  System.out.println(username+","+password+","+key2+","+type1);
		RequestDispatcher rd = null;
                
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clouddatasecurity","root","password");
           
           String key="";
            
             String query = "select * from message where receiver='"+username+"' && id='"+id+"'"; 
                                            st = con.createStatement();
                                            rs = st.executeQuery(query);

                                            if (rs.next()) {
                                                 key = rs.getString(7);
                                            }
            
                sn.setAttribute("key",key);
               rd=req.getRequestDispatcher("extractkey.jsp");
	        
	     rd.forward(req,res);
        }
        catch(Exception e2)
         {
            System.out.println("Exception : "+e2.toString());
        }
    }
}