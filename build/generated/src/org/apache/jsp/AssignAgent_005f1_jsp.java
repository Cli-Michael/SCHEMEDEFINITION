package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Users;
import java.util.List;
import Model.Scheme;

public final class AssignAgent_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Coding by CodingLab | www.codinglabweb.com -->\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!----======== CSS ======== -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/all user.css\">\n");
      out.write("\n");
      out.write("        <!----===== Boxicons CSS ===== -->\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("\n");
      out.write("        <title>View</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"sidebar close\">\n");
      out.write("            <header>\n");
      out.write("                <div class=\"image-text\">\n");
      out.write("                    <span class=\"image\">\n");
      out.write("                        <img src=\"images/AP-logo.png\" alt=\"\">\n");
      out.write("                    </span>\n");
      out.write("\n");
      out.write("                    <div class=\"text logo-text\">\n");
      out.write("                        <span class=\"name\">Asian Paints</span>\n");
      out.write("                        <span class=\"profession\">Scheme Definition</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <i class='bx bx-chevron-right toggle'></i>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div class=\"menu-bar\">\n");
      out.write("                <div class=\"menu\">\n");
      out.write("\n");
      out.write("                    <li class=\"search-box\">\n");
      out.write("                        <i class='bx bx-search icon'></i>\n");
      out.write("                        <input type=\"text\" placeholder=\"Search...\">\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <ul class=\"menu-links\">\n");
      out.write("                        <li class=\"nav-link\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"bx bx-home-alt icon\"></i>\n");
      out.write("                                <span class=\"text nav-text\">Home</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-link\">\n");
      out.write("                            <a href=\"View.jsp\">\n");
      out.write("                                <i class=\"bx bx-file-blank icon\"></i>\n");
      out.write("                                <span class=\"text nav-text\">View</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-link\">\n");
      out.write("                            <a href=\"Users.jsp\">\n");
      out.write("                                <i class=\"bx bx-group icon\"></i>\n");
      out.write("                                <span class=\"text nav-text\">Users</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-link\">\n");
      out.write("                            <a href=\"AssignAgent.jsp\">\n");
      out.write("                                <i class=\"bx bx-group icon\"></i>\n");
      out.write("                                <span class=\"text nav-text\">Assign Agent</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-link\">\n");
      out.write("                            <a href=\"Export\">\n");
      out.write("                                <i class=\"bx bx-export icon\"></i>\n");
      out.write("                                <span class=\"text nav-text\">Export</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"bottom-content\">\n");
      out.write("                    <li class=\"\">\n");
      out.write("                        <a href=\"javascript:confirmation()\">\n");
      out.write("                            <i class='bx bx-log-out icon'></i>\n");
      out.write("                            <span class=\"text nav-text\">Logout</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"mode\">\n");
      out.write("                        <div class=\"sun-moon\">\n");
      out.write("                            <i class='bx bx-moon icon moon'></i>\n");
      out.write("                            <i class='bx bx-sun icon sun'></i>\n");
      out.write("                        </div>\n");
      out.write("                        <span class=\"mode-text text\">Dark mode</span>\n");
      out.write("\n");
      out.write("                        <div class=\"toggle-switch\">\n");
      out.write("                            <span class=\"switch\"></span>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <section class=\"home\">\n");
      out.write("            <div id=\"header\" class=\"tophead\">\n");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                    <li>List</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mainbg\">\n");
      out.write("                <form id=\"myForm\" method=\"post\" action=\"AgentAssigner\">\n");
      out.write("                    <label style=\"margin-left: 20px; margin-top: 20px;\">Total</label>\n");
      out.write("                    <input type=\"text\" value=\"");
      out.print( Resource.MyFunctions.countTotal());
      out.write("\" readonly/>\n");
      out.write("                    <label style=\"margin-left: 20px;\">Pending to Assign</label>\n");
      out.write("                    <input type=\"text\" placeholder=\"");
      out.print( Resource.MyFunctions.countUnAssigned());
      out.write("\" name=\"count\"/>\n");
      out.write("                    <a href=\"#\" onclick=\"submitForm()\" style=\"margin-left: 20px;\">\n");
      out.write("                        Assign\n");
      out.write("                    </a>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <div style=\"overflow-x:auto; overflow-y:auto;\"\n");
      out.write("                     class=\"appointment-table\">\n");
      out.write("                    <table>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"col\">Region</th>\n");
      out.write("                                <th scope=\"col\">Division</th>\n");
      out.write("                                <th scope=\"col\">Assigned Status</th>\n");
      out.write("                                <!--                                <th scope=\"col\">Edit</th>\n");
      out.write("                                                                <th scope=\"col\">Delete</th>-->\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
 List<Scheme> list = Resource.MyFunctions.getRegionDivisionUnassigned(); 
      out.write("\n");
      out.write("\n");
      out.write("                            ");
 for (Scheme s : list) {
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td data-label=\"region\">");
      out.print( s.getRegion());
      out.write("</td>\n");
      out.write("                                <td data-label=\"division\">");
      out.print( s.getDivision());
      out.write("</td>\n");
      out.write("                                <td data-label=\"division\">");
      out.print( s.getAssigned());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"head\">\n");
      out.write("                    <!-- <div class=\"searchbar\">\n");
      out.write("                        <form action=\"#\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("                            <button type=\"submit\"><i class='bx bx-search-alt icon'></i></button>\n");
      out.write("                        </form>\n");
      out.write("                    </div> -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- <div class=\"text\">Data Will Apaire Here</div> -->\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function submitForm() {\n");
      out.write("            document.getElementById(\"myForm\").submit();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        const body = document.querySelector('body'),\n");
      out.write("                sidebar = body.querySelector('nav'),\n");
      out.write("                toggle = body.querySelector(\".toggle\"),\n");
      out.write("                searchBtn = body.querySelector(\".search-box\"),\n");
      out.write("                modeSwitch = body.querySelector(\".toggle-switch\"),\n");
      out.write("                modeText = body.querySelector(\".mode-text\");\n");
      out.write("        toggle.addEventListener(\"click\", () => {\n");
      out.write("            sidebar.classList.toggle(\"close\");\n");
      out.write("        })\n");
      out.write("        searchBtn.addEventListener(\"click\", () => {\n");
      out.write("            sidebar.classList.remove(\"close\");\n");
      out.write("        })\n");
      out.write("        modeSwitch.addEventListener(\"click\", () => {\n");
      out.write("            body.classList.toggle(\"dark\");\n");
      out.write("            if (body.classList.contains(\"dark\")) {\n");
      out.write("                modeText.innerText = \"Light mode\";\n");
      out.write("            } else {\n");
      out.write("                modeText.innerText = \"Dark mode\";\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("        function confirmation() {\n");
      out.write("            var txt;\n");
      out.write("            var r = confirm(\"Are you sure you want to Logout ?\");\n");
      out.write("            if (r == true) {\n");
      out.write("                window.location.href = 'Logouter';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    </script>  \n");
      out.write("</body>\n");
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