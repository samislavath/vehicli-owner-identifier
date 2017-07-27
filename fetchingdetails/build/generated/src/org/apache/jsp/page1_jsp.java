package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javafx.util.Pair;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.URL;
import org.jsoup.select.Elements;
import org.jsoup.Connection.Method;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.Connection;

public final class page1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>;\n");
      out.write("    <body>\n");
      out.write("        <h1>Welcome to car plate owner details</h1>\n");
      out.write("        ");

            
            System.setProperty("http.proxyHost", "172.30.0.13");
            System.setProperty("http.proxyPort", "3128");
            String host="https://parivahan.gov.in/rcdlstatus/?pur_cd=102";
            host=host.trim();
            Connection.Response loginForm = Jsoup
        .connect(host).userAgent("curl/7.47.0")
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
        /*Elements div1=doc.select("row col-md-6");
        out.println("hello sam");
        for (Element movie:div1.select("vahan-captcha"))
        {
            out.println("SAM IS A VERY GOOD BOY" +movie.attr("name"));
        }*/
        //Element div2=;
    Element div=doc.getElementById("j_id1:javax.faces.ViewState:0");
    Elements div1=doc.select("div.row div.col-md-6");
    
    
       String str=div.attr("value");
       System.out.println(str);
       String s="",str4="";
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
	for (Element movie:div1.select("table.vahan-captcha input"))
        {
            str4=movie.attr("name");
        }
        div1=doc.select("div.row");
        String s5="";
        for (Element movie:div1.select("div.col-md-1 button"))
        {
            s5=movie.attr("name");
        }
	    
      out.write("\n");
      out.write("        <form name=\"form1\" action=\"page2.jsp\" method=\"POST\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <input type=\"text\" name=\"buttonname\" value=\"");
out.println(s5);
      out.write("\" />\n");
      out.write("                    <input type=\"text\" name=\"captchaname\" value=\"");
out.println(str4);
      out.write("\" />\n");
      out.write("            <input type=\"text\" name=\"javax\" value=\"");
out.println(str);
      out.write("\" />\n");
      out.write("            <input type=\"text\" name=\"loginFORM\" value=\"");
out.println(loginForm.cookies());
      out.write("\" />\n");
      out.write("            <input type=\"text\" name=\"FORM\" value=\"");
out.println(loginForm.contentType());
      out.write("\" />\n");
      out.write("            \n");
      out.write("\n");
      out.write("                    <th></th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("                          ");

                              
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

      out.write("\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Plate Number </td>\n");
      out.write("                    <td><input type=\"text\" name=\"plateno\" value=\"\" size=\"10\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>PHONE NUMBER </td>\n");
      out.write("                    <td><input type=\"text\" name=\"phno\" value=\"+91\" size=\"10\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><img src=\"http://localhost:8080/files/downloaded2.png\" alt=\"\" width=\"150\" height=\"50\" ></td>\n");
      out.write("                    <td><input type=\"text\" name=\"cpt\" value=\"\" size=\"10\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("                    </table>\n");
      out.write("            <input type=\"submit\" value=\"Generate OTP\" name=\"submit\" />\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
