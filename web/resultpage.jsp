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
            <form id="form1" name="form1" method="post" action="CoverMessageGeneration">
              <table width="327" height="259" border="0">
                <tr>
                  <td><div align="center">Message ID </div></td>
                  <td><input name="id" type="text" id="id" readonly="true" value="<%=session.getAttribute("id")%>" /></td>
                </tr>
                <tr>
                  <td width="129"><div align="center">Receiver Name </div></td>
                  <td width="188"><label>
                    <input name="receiver" type="text" readonly="true" id="receiver" value="<%=session.getAttribute("receiver")%>" />
                  </label></td>
                </tr>
                <tr>
                  <td><div align="center">
                      <label></label>
                    Message</div></td>
                  <td><textarea name="message" readonly="true" id="message"><%=session.getAttribute("message")%></textarea></td>
                </tr>
                <tr>
                  <td colspan="2"><div align="center">
                      <label>
                      <input type="submit" name="Submit" value="Cover Message Generation" />
                      </label>
                      <p>
                        <input name="username" type="text" id="username" style="visibility:hidden" readonly="true" value="<%=session.getAttribute("username")%>" />
                      </p>
                  </div></td>
                </tr>
              </table>
            </form>
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
