<%--
    Document   : page1
    Created on : Jun 29, 2017, 4:32:19 PM
    Author     : samislavath
--%>

<%@page import="javafx.util.Pair"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.net.URL"%>
<%@page import="org.jsoup.select.Elements"%>
<%@page import="org.jsoup.Connection.Method"%>
<%@page import="org.jsoup.nodes.Element"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@page import="org.jsoup.Jsoup"%>
<%@page import="org.jsoup.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>;
    <body>
        <h1>Welcome to car plate owner details</h1>
        <%
            Connection.Response loginForm = Jsoup
        .connect("https://parivahan.gov.in/rcdlstatus/?pur_cd=102").userAgent(" curl/7.47.0")
        .method(Connection.Method.GET).execute();

            String sessionID = loginForm.cookie("Cookie");
            System.out.println("THIS IS HOW ");
        Document doc=loginForm.parse();
        
        System.out.println(doc);
        /*Map<String, String> cookies=loginForm.cookies();
        Map<String,String>::iterator itr;
        for(itr=cookies.begin();itr!=cookies.end();itr++)
        {
            
        }*/
        
    Element div=doc.getElementById("j_id1:javax.faces.ViewState:0");
    
       String str=div.attr("value");
       System.out.println(str);
       String s="";
       char[] a={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       for(int i=0;i<str.length();i++)
       {
           if((str.charAt(i)>='0' && str.charAt(i)<='9' )||(str.charAt(i)>='a' && str.charAt(i)<='z' )||
                   (str.charAt(i)>='A' && str.charAt(i)<='Z'))
           s+=str.charAt(i);
           else
           {
               char ch2='%';
               int x=str.charAt(i);
               //System.out.println("this is x"+x);
               char ch=a[x%16];
               x=x/16;
                char ch1=a[x%16];
                //System.out.println("this is output"+ch1+ch);
                s+=ch2;
                s+=ch1;
                s+=ch;
           }
                //System.out.println("this is s"+s);
       }
	
	    %>
        <form name="form1" action="page2.jsp" method="POST">
            <table border="0">
            <thead>
                <tr>
            <input type="text" name="javax" value="<%out.println(str);%>" />
            <input type="text" name="loginFORM" value="<%out.println(loginForm.cookies());%>" />
            <input type="text" name="FORM" value="<%out.println(loginForm.contentType());%>" />
            

                    <th></th>
                    <th></th>
                </tr>
                          <%
                Elements image=doc.getElementsByTag("img");
       // doc.getElementsByClass(ui-panel);
     String captchaURL = null;
      for (Element e : image.subList(1, 2)) {
   captchaURL=e.attr("abs:src");
   System.out.println("this "+captchaURL);
}
                URL url2 = new URL(captchaURL);
                BufferedImage img = ImageIO.read(url2);
        File file = new File("C:\\A\\downloaded2.png");
         ImageIO.write(img, "jpg", file);

         System.out.println("print1: "+request.getSession().getId());
         System.out.println("print2: "+request.getSession(false));
%>
            </thead>
            <tbody>
                <tr>
                    <td>Plate Number </td>
                    <td><input type="text" name="plateno" value="" size="10" /></td>
                </tr>
                <tr>
                    <td>PHONE NUMBER </td>
                    <td><input type="text" name="phno" value="+91" size="10" /></td>
                </tr>
                <tr>
                    <td><img src="http://localhost:8080/files/downloaded2.png" alt="" width="150" height="50" ></td>
                    <td><input type="text" name="cpt" value="" size="10" /></td>
                </tr>
            </tbody>
                    </table>
            <input type="submit" value="Generate OTP" name="submit" />
        </form>

    </body>
</html>
