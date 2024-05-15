package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AgentLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Agent Log-in</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"login.css\">\n");
      out.write("    <link href=\"https://allfont.net/allfont.css?fonts=montserrat-bold\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"title\"><span>Agent Login</span></div>\n");
      out.write("            <form action=\"AgentLogger\" method=\"post\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <i class=\"fas fa-user\"></i>\n");
      out.write("                    <input type=\"text\" placeholder=\"Email or Phone\" name=\"username\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <i class=\"fas fa-lock\"></i>\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" name=\"password\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row button\">\n");
      out.write("                    <a href=\"home.html\">\n");
      out.write("                        <input type=\"submit\" value=\"Login\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"signup-link\"><a href=\"AdminLogin.jsp\">Admin Log-in</a></div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<!-- Code injected by live-server -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t// <![CDATA[  <-- For SVG support\n");
      out.write("\tif ('WebSocket' in window) {\n");
      out.write("\t\t(function () {\n");
      out.write("\t\t\tfunction refreshCSS() {\n");
      out.write("\t\t\t\tvar sheets = [].slice.call(document.getElementsByTagName(\"link\"));\n");
      out.write("\t\t\t\tvar head = document.getElementsByTagName(\"head\")[0];\n");
      out.write("\t\t\t\tfor (var i = 0; i < sheets.length; ++i) {\n");
      out.write("\t\t\t\t\tvar elem = sheets[i];\n");
      out.write("\t\t\t\t\tvar parent = elem.parentElement || head;\n");
      out.write("\t\t\t\t\tparent.removeChild(elem);\n");
      out.write("\t\t\t\t\tvar rel = elem.rel;\n");
      out.write("\t\t\t\t\tif (elem.href && typeof rel != \"string\" || rel.length == 0 || rel.toLowerCase() == \"stylesheet\") {\n");
      out.write("\t\t\t\t\t\tvar url = elem.href.replace(/(&|\\?)_cacheOverride=\\d+/, '');\n");
      out.write("\t\t\t\t\t\telem.href = url + (url.indexOf('?') >= 0 ? '&' : '?') + '_cacheOverride=' + (new Date().valueOf());\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tparent.appendChild(elem);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tvar protocol = window.location.protocol === 'http:' ? 'ws://' : 'wss://';\n");
      out.write("\t\t\tvar address = protocol + window.location.host + window.location.pathname + '/ws';\n");
      out.write("\t\t\tvar socket = new WebSocket(address);\n");
      out.write("\t\t\tsocket.onmessage = function (msg) {\n");
      out.write("\t\t\t\tif (msg.data == 'reload') window.location.reload();\n");
      out.write("\t\t\t\telse if (msg.data == 'refreshcss') refreshCSS();\n");
      out.write("\t\t\t};\n");
      out.write("\t\t\tif (sessionStorage && !sessionStorage.getItem('IsThisFirstTime_Log_From_LiveServer')) {\n");
      out.write("\t\t\t\tconsole.log('Live reload enabled.');\n");
      out.write("\t\t\t\tsessionStorage.setItem('IsThisFirstTime_Log_From_LiveServer', true);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t})();\n");
      out.write("\t}\n");
      out.write("\telse {\n");
      out.write("\t\tconsole.error('Upgrade your browser. This Browser is NOT supported WebSocket for Live-Reloading.');\n");
      out.write("\t}\n");
      out.write("\t// ]]>\n");
      out.write("</script></body>\n");
      out.write("\n");
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
