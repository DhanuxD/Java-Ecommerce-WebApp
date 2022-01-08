package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"Js/Userregister.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/signup.css\">\n");
      out.write("        <link rel= \"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--        <h1>User Register</h1>\n");
      out.write("        \n");
      out.write("                <span>Username :-</span>&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input id=\"username\" type=\"text\" /></br>\n");
      out.write("                </br>\n");
      out.write("                </br>\n");
      out.write("        \n");
      out.write("                <span>Email :-</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input id=\"useremail\" type=\"email\" /></br>\n");
      out.write("                </br>\n");
      out.write("                </br>\n");
      out.write("        \n");
      out.write("                <span>Password :-</span>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input id=\"userpassword\" type=\"password\" /></br>\n");
      out.write("                </br>\n");
      out.write("                </br>\n");
      out.write("        \n");
      out.write("                <span>Mobile :-</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                <input id=\"usermobile\" type=\"text\" /></br>\n");
      out.write("                </br>\n");
      out.write("                </br>\n");
      out.write("        \n");
      out.write("                <button onclick=\"userRegister()\">Sign up</button>-->\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"blueBg\">\n");
      out.write("                <div class=\"box signin\">\n");
      out.write("                    <h2>Already have an account?</h2>\n");
      out.write("                    <button class=\"signinBtn\">Sign in</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box signup\">\n");
      out.write("                    <h2>Don't have an account?</h2>\n");
      out.write("                    <button class=\"signupBtn\">Sign up</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"formBx\">\n");
      out.write("                <!--Signin-->\n");
      out.write("                <div class=\"form signinForm\">\n");
      out.write("                    <form>\n");
      out.write("                        <h3>Sign In</h3>\n");
      out.write("\n");
      out.write("                        <input id=\"loginusername\" type=\"text\" placeholder=\"Username\">\n");
      out.write("                        <input  id=\"pwin\"  type=\"password\" placeholder=\"Password\">\n");
      out.write("                        <span onclick=\"toggle()\"><i class=\"fa fa-eye logeye\" aria-hidden=\"true\"></span></i>\n");
      out.write("                        <input  onclick=\"signin()\" type=\"submit\" value=\"Sign in\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <a href=\"#\" class=\"forgot\">Forgot Password</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--Signup-->\n");
      out.write("                <div class=\"form signupForm\">\n");
      out.write("                    <form>\n");
      out.write("                        <h3>Sign Up</h3>\n");
      out.write("                        <input id=\"username\" type=\"text\" placeholder=\"Username\">\n");
      out.write("                        <input id=\"useremail\" type=\"email\" placeholder=\"Email\">\n");
      out.write("                        <input  type=\"password\" id=\"pwup\" placeholder=\"Password\">\n");
      out.write("                        <span onclick=\"toggler()\"><i class=\"fa fa-eye regieye\" aria-hidden=\"true\"></i></span>\n");
      out.write("                        <input onkeyup=\"validatePass()\" id=\"comfirmpwup\" type=\"password\" placeholder=\"Confirm Password\">\n");
      out.write("                        <input onclick=\"userRegister()\" type=\"submit\" value=\"Sign up\">\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            const signinBtn = document.querySelector('.signinBtn');\n");
      out.write("            const signupBtn = document.querySelector('.signupBtn');\n");
      out.write("            const formBx = document.querySelector('.formBx');\n");
      out.write("            const body = document.querySelector('body');\n");
      out.write("\n");
      out.write("            signupBtn.onclick = function () {\n");
      out.write("                formBx.classList.add('active');\n");
      out.write("                body.classList.add('active');\n");
      out.write("            };\n");
      out.write("            signinBtn.onclick = function () {\n");
      out.write("                formBx.classList.remove('active');\n");
      out.write("                body.classList.remove('active');\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Js/Signup.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Js/Signin.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Js/Userregister.js\"></script>\n");
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
