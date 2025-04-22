<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Cloud Data Security</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/radius.js"></script>
<style type="text/css">
<!--
.style2 {font-size: 36px}
.style4 {font-size: 18px}
.style5 {font-size: 14px}
.style6 {font-size: 16px}
.style7 {font-size: 16}
.style10 {color: #0099CC}
.style18 {font-size: 16px; color: #339900; }
.style19 {font-size: large; font-weight: bold; }
.style20 {color: #996600}
.style21 {color: #687A66}
.style22 {font-size: medium;
	font-weight: bold;
}
.style22 {font-size: medium; font-weight: bold; color: #687A66; }
.style23 {color: #E1EAF1;
	font-size: 24px;
}
-->
</style>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="index.jsp">Home</a></li>
          <li><a href="send.jsp">Send </a></li>
          <li><a href="receive.jsp">Receive</a></li>
        </ul>
      </div>
      <div class="logo">
        <h1><a href="#"><span class="style2">DataSecurity </span>  <small>Cloud Data Security </small></a></h1>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
          <h2>Welcome to Cloud Data Security </h2>
          <div class="clr"></div>
          <p align="center" class="infopost style19 style20">User Page </p>
          <div align="center">
            <table width="619" height="224" border="0" >
              <tr>
                <td height="52" colspan="9" bgcolor="#666666"><div align="center"><span class="style23">Message</span></div></td>
              </tr>
              <tr>
                <td width="232" bordercolor="#FFFFFF"><div align="center"><span class="style22">Sender</span></div></td>
                <td width="377" bordercolor="#FFFFFF"><div align="center" class="style21"><span class="style22">Message</span></div></td>
              </tr>
              <%
                                        try {
                                          
										  String fileid = session.getAttribute("fileid").toString();
										   String status = "requested";
							//String username, user;
        PreparedStatement ps;
        ResultSet rs;
		//Connection con = null;
		Statement st,st1,st2,st3,st4;
                                            
                                            Class.forName("com.mysql.jdbc.Driver");
                                      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clouddatasecurity","root","password");
                                            String query = "select * from message where id='"+fileid+"'"; 
                                            st = con.createStatement();
                                            rs = st.executeQuery(query);

                                            while (rs.next()) {
                                                 String id = rs.getString(1);
                                               
                                                String s2 = rs.getString(2);
												
												String s3 = rs.getString(4);
                                                String s4 = rs.getString(5);
												
												
                                               
                                    %>
              <tr>
                <form id="form1" method="post" name="form1" action="ViewMessage">
                  <td><div align="center"><%=s2%></div></td>
                  <td><div align="center"><%=s3%></div></td>
                </form>
              </tr>
              <tr>
                <td colspan="9"><div align="center"></div></td>
              </tr>
              <%

                                            }
                                            con.close();
                                        } catch (Exception e) {
                                            out.println(e);
                                        }

                                    %>
            </table>
          </div>
          <p align="center" class="style10"><a href="userregister.jsp" class="style18"></a></p>
          <p class="spec"><a href="#" class="rm"></a></p>
        </div>
      </div>
      <div class="sidebar">
        <div class="searchform">
          
        </div>
        <div class="gadget">
          <h2 class="star"><span>Sidebar</span> Menu</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
            <li class="style10"><span class="style5"><span class="style6"><span class="style7"><span class="style4"><a href="login.jsp">Logout</a></span></span></span></span></li>
            <li class="style4"><a href="send.jsp">Send  </a></li>
            <li class="style4"><a href="receive.jsp">Receive  </a><span class="style4"><a href="userlogin.jsp"></a></span></li>
            <li class="style10"><span class="style4"><a href="donatorlogin.jsp"></a></span></li>
            <li></li>
          </ul>
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
    <div class="fbg_resize">
      <div class="clr"></div>
    </div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <div class="clr"></div>
    </div>
  </div>
</div>
<div align=center></div>
</body>
</html>
