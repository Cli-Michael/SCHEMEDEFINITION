package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditScheme_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Coding by CodingLab | www.codinglabweb.com -->\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link\n");
      out.write("      href=\"https://allfont.net/allfont.css?fonts=montserrat-bold\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      type=\"text/css\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      href=\"https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <!----======== CSS ======== -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\" />\n");
      out.write("\n");
      out.write("    <!----===== Boxicons CSS ===== -->\n");
      out.write("    <link\n");
      out.write("      href=\"https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <title>Form</title>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <nav class=\"sidebar close\">\n");
      out.write("      <header>\n");
      out.write("        <div class=\"image-text\">\n");
      out.write("          <span class=\"image\">\n");
      out.write("            <img src=\"images/AP-logo.png\" alt=\"\" />\n");
      out.write("          </span>\n");
      out.write("\n");
      out.write("          <div class=\"text logo-text\">\n");
      out.write("            <span class=\"name\">Asian Paints</span>\n");
      out.write("            <span class=\"profession\">Scheme Definition</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <i class=\"bx bx-chevron-right toggle\"></i>\n");
      out.write("      </header>\n");
      out.write("\n");
      out.write("      <div class=\"menu-bar\">\n");
      out.write("        <div class=\"menu\">\n");
      out.write("          <li class=\"search-box\">\n");
      out.write("            <i class=\"bx bx-search icon\"></i>\n");
      out.write("            <input type=\"text\" placeholder=\"Search...\" />\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <ul class=\"menu-links\">\n");
      out.write("            <li class=\"nav-link\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <i class=\"bx bx-home-alt icon\"></i>\n");
      out.write("                <span class=\"text nav-text\">Home</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-link\">\n");
      out.write("              <a href=\"View.jsp\">\n");
      out.write("                <i class=\"bx bx-file-blank icon\"></i>\n");
      out.write("                <span class=\"text nav-text\">View</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-link\">\n");
      out.write("              <a href=\"Users.jsp\">\n");
      out.write("                <i class=\"bx bx-group icon\"></i>\n");
      out.write("                <span class=\"text nav-text\">Users</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"bottom-content\">\n");
      out.write("          <li class=\"\">\n");
      out.write("            <a href=\"Adminlogin.html\">\n");
      out.write("              <i class=\"bx bx-log-out icon\"></i>\n");
      out.write("              <span class=\"text nav-text\">Logout</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"mode\">\n");
      out.write("            <div class=\"sun-moon\">\n");
      out.write("              <i class=\"bx bx-moon icon moon\"></i>\n");
      out.write("              <i class=\"bx bx-sun icon sun\"></i>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"mode-text text\">Dark mode</span>\n");
      out.write("\n");
      out.write("            <div class=\"toggle-switch\">\n");
      out.write("              <span class=\"switch\"></span>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <section class=\"home\">\n");
      out.write("      <div id=\"header\" class=\"tophead\">\n");
      out.write("        <ul>\n");
      out.write("          <li>Asian Paints - Process Name</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"mainbg\" style=\"overflow-x: auto; overflow-y: auto\">\n");
      out.write("        <!-- save button start -->\n");
      out.write("        <form action=\"AddScheme\" method=\"post\">\n");
      out.write("          <button\n");
      out.write("            id=\"input_scl_2\"\n");
      out.write("            type=\"submit\"\n");
      out.write("            class=\"savebutton\"\n");
      out.write("            data-component=\"button\"\n");
      out.write("          >\n");
      out.write("            Save\n");
      out.write("          </button>\n");
      out.write("        </form>\n");
      out.write("        <a href=\"View.jsp\">\n");
      out.write("          <button\n");
      out.write("            id=\"input_scl_1\"\n");
      out.write("            type=\"button\"\n");
      out.write("            class=\"backbutton\"\n");
      out.write("            data-component=\"button\"\n");
      out.write("          >\n");
      out.write("            Cancel\n");
      out.write("          </button>\n");
      out.write("        </a>\n");
      out.write("        <!-- save button end -->\n");
      out.write("        <div class=\"elementsbg\">\n");
      out.write("          <!-- input data start -->\n");
      out.write("          <div class=\"elementsleft\">\n");
      out.write("            <form id=\"survey-form\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"region-label\" for=\"region\"\n");
      out.write("                  ><p><span class=\"clue\">Region</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"region\"\n");
      out.write("                  id=\"region\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Region\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"division-label\" for=\"division\"\n");
      out.write("                  ><p><span class=\"clue\">Division</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"division\"\n");
      out.write("                  id=\"division\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Division\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"schemedate-label\" for=\"schemedate\"\n");
      out.write("                  ><p>\n");
      out.write("                    <span class=\"clue\">Scheme Letter Received Date</span>\n");
      out.write("                  </p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"date\"\n");
      out.write("                  name=\"schemedate\"\n");
      out.write("                  id=\"schemedate\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"schemetime-label\" for=\"schemetime\"\n");
      out.write("                  ><p>\n");
      out.write("                    <span class=\"clue\">Scheme Letter Received Time</span>\n");
      out.write("                  </p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"time\"\n");
      out.write("                  name=\"schemetime\"\n");
      out.write("                  id=\"schemetime\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"schemename-label\" for=\"schemename\"\n");
      out.write("                  ><p><span class=\"clue\">Scheme Letter Name</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"schemename\"\n");
      out.write("                  id=\"schemename\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Scheme Letter Name\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"schemetype-label\" for=\"schemetype\"\n");
      out.write("                  ><p><span class=\"clue\">Scheme Type</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"number\"\n");
      out.write("                  name=\"schemetype\"\n");
      out.write("                  id=\"schemetype\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Scheme Type\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"component-label\" for=\"component\"\n");
      out.write("                  ><p><span class=\"clue\">Component</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"component\"\n");
      out.write("                  id=\"component\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Component\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"schemeid-label\" for=\"schemeid\"\n");
      out.write("                  ><p><span class=\"clue\">Scheme ID</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"schemeid\"\n");
      out.write("                  id=\"schemeid\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Scheme ID\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"requirementdetails-label\" for=\"requirementdetails\"\n");
      out.write("                  ><p>\n");
      out.write("                    <span class=\"clue\">Additional Requirement Details</span>\n");
      out.write("                  </p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"requirementdetails\"\n");
      out.write("                  id=\"requirementdetails\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Additional Requirement Details\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"requestdate-label\" for=\"requestdate\"\n");
      out.write("                  ><p><span class=\"clue\">Request Date</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"date\"\n");
      out.write("                  name=\"requestdate\"\n");
      out.write("                  id=\"requestdate\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"changesdate-label\" for=\"changesdate\"\n");
      out.write("                  ><p><span class=\"clue\">Changes Date</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"date\"\n");
      out.write("                  name=\"changesdate\"\n");
      out.write("                  id=\"changesdate\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label\n");
      out.write("                  id=\"differentrequirement-label\"\n");
      out.write("                  for=\"differentrequirement\"\n");
      out.write("                  ><p>\n");
      out.write("                    <span class=\"clue\"\n");
      out.write("                      >Different Requirement From Unit<br />&nbsp(Not As per\n");
      out.write("                      Scheme Letter)</span\n");
      out.write("                    >\n");
      out.write("                  </p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"differentrequirement\"\n");
      out.write("                  id=\"differentrequirement\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Different Requirement From Unit\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"defineby-label\" for=\"defineby\">\n");
      out.write("                  <p><span class=\"clue\">Define By</span></p></label\n");
      out.write("                >\n");
      out.write("                <select\n");
      out.write("                  id=\"defineby\"\n");
      out.write("                  name=\"defineby\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  required\n");
      out.write("                >\n");
      out.write("                  <option disabled selected value>Select Here</option>\n");
      out.write("                  <option value=\"Yes\">Yes</option>\n");
      out.write("                  <option value=\"No\">No</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"reason-label\" for=\"reason\">\n");
      out.write("                  <p><span class=\"clue\">Reason For Not Define</span></p></label\n");
      out.write("                >\n");
      out.write("                <select id=\"reason\" name=\"reason\" class=\"form-control\" required>\n");
      out.write("                  <option disabled selected value>Select Here</option>\n");
      out.write("                  <option value=\"Yes\">Yes</option>\n");
      out.write("                  <option value=\"No\">No</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"status-label\" for=\"status\">\n");
      out.write("                  <p><span class=\"clue\">Status</span></p></label\n");
      out.write("                >\n");
      out.write("                <select id=\"status\" name=\"status\" class=\"form-control\" required>\n");
      out.write("                  <option disabled selected value>Select Here</option>\n");
      out.write("                  <option value=\"Yes\">Yes</option>\n");
      out.write("                  <option value=\"No\">No</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"definetime-label\" for=\"definetime\"\n");
      out.write("                  ><p><span class=\"clue\">Define Time</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"time\"\n");
      out.write("                  name=\"definetime\"\n");
      out.write("                  id=\"definetime\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"starttime-label\" for=\"starttime\"\n");
      out.write("                  ><p><span class=\"clue\">Start Time</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"time\"\n");
      out.write("                  name=\"starttime\"\n");
      out.write("                  id=\"starttime\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"endtime-label\" for=\"endtime\"\n");
      out.write("                  ><p><span class=\"clue\">End Time</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"time\"\n");
      out.write("                  name=\"endtime\"\n");
      out.write("                  id=\"endtime\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"ageing-label\" for=\"ageing\"\n");
      out.write("                  ><p><span class=\"clue\">Ageing</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"ageing\"\n");
      out.write("                  id=\"ageing\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Ageing\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("          <!-- elementsright div  -->\n");
      out.write("          <div class=\"elementsright\">\n");
      out.write("            <form id=\"survey-form\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"day-label\" for=\"day\">\n");
      out.write("                  <p><span class=\"clue\">Day</span></p></label\n");
      out.write("                >\n");
      out.write("                <select id=\"day\" name=\"day\" class=\"form-control\" required>\n");
      out.write("                  <option disabled selected value>Select Here</option>\n");
      out.write("                  <option value=\"Yes\">Yes</option>\n");
      out.write("                  <option value=\"No\">No</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"schemedate-label\" for=\"schemedate\"\n");
      out.write("                  ><p><span class=\"clue\">Scheme Date</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"date\"\n");
      out.write("                  name=\"schemedate\"\n");
      out.write("                  id=\"schemedate\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"days-label\" for=\"days\"\n");
      out.write("                  ><p><span class=\"clue\">Days</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"Number\"\n");
      out.write("                  name=\"days\"\n");
      out.write("                  id=\"days\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Days\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"tat-label\" for=\"tat\"\n");
      out.write("                  ><p><span class=\"clue\">TAT</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"Number\"\n");
      out.write("                  name=\"tat\"\n");
      out.write("                  id=\"tat\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"TAT\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"schemedeployed-label\" for=\"schemedeployed\">\n");
      out.write("                  <p><span class=\"clue\">Scheme Deployed</span></p></label\n");
      out.write("                >\n");
      out.write("                <select\n");
      out.write("                  id=\"schemedeployed\"\n");
      out.write("                  name=\"schemedeployed\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  required\n");
      out.write("                >\n");
      out.write("                  <option disabled selected value>Select Here</option>\n");
      out.write("                  <option value=\"Yes\">Yes</option>\n");
      out.write("                  <option value=\"No\">No</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"checkerdate-label\" for=\"checkerdate\"\n");
      out.write("                  ><p><span class=\"clue\">Checker 1 Date</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"date\"\n");
      out.write("                  name=\"checkerdate\"\n");
      out.write("                  id=\"checkerdate\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"checkername-label\" for=\"checkername\"\n");
      out.write("                  ><p><span class=\"clue\">Checker 1 Name</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"checkername\"\n");
      out.write("                  id=\"checkername\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Checker 1 Name\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"error-label\" for=\"error\">\n");
      out.write("                  <p><span class=\"clue\">Error</span></p></label\n");
      out.write("                >\n");
      out.write("                <select id=\"error\" name=\"error\" class=\"form-control\" required>\n");
      out.write("                  <option disabled selected value>Select Here</option>\n");
      out.write("                  <option value=\"Yes\">Yes</option>\n");
      out.write("                  <option value=\"No\">No</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"errors-label\" for=\"errors\"\n");
      out.write("                  ><p><span class=\"clue\">Error</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"errors\"\n");
      out.write("                  id=\"errors\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Error\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"solved-label\" for=\"solved\">\n");
      out.write("                  <p><span class=\"clue\">Solved</span></p></label\n");
      out.write("                >\n");
      out.write("                <select id=\"solved\" name=\"solved\" class=\"form-control\" required>\n");
      out.write("                  <option disabled selected value>Select Here</option>\n");
      out.write("                  <option value=\"Yes\">Yes</option>\n");
      out.write("                  <option value=\"No\">No</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"errorhighlighted-label\" for=\"errorhighlighted\">\n");
      out.write("                  <p>\n");
      out.write("                    <span class=\"clue\">Error Highlighted By Region</span>\n");
      out.write("                  </p></label\n");
      out.write("                >\n");
      out.write("                <select\n");
      out.write("                  id=\"errorhighlighted\"\n");
      out.write("                  name=\"errorhighlighted\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  required\n");
      out.write("                >\n");
      out.write("                  <option disabled selected value>Select Here</option>\n");
      out.write("                  <option value=\"Yes\">Yes</option>\n");
      out.write("                  <option value=\"No\">No</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"regionname-label\" for=\"regionname\"\n");
      out.write("                  ><p><span class=\"clue\">Region Name</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"regionname\"\n");
      out.write("                  id=\"regionname\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Region Name\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"erroraccepted-label\" for=\"erroraccepted\">\n");
      out.write("                  <p><span class=\"clue\">Error Accepted</span></p></label\n");
      out.write("                >\n");
      out.write("                <select\n");
      out.write("                  id=\"erroraccepted\"\n");
      out.write("                  name=\"erroraccepted\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  required\n");
      out.write("                >\n");
      out.write("                  <option disabled selected value>Select Here</option>\n");
      out.write("                  <option value=\"Yes\">Yes</option>\n");
      out.write("                  <option value=\"No\">No</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"errordescription-label\" for=\"errordescription\"\n");
      out.write("                  ><p><span class=\"clue\">Error Description</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"errordescription\"\n");
      out.write("                  id=\"errordescription\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Error Description\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"officername-label\" for=\"officername\"\n");
      out.write("                  ><p>\n");
      out.write("                    <span class=\"clue\">Highlighted By Officer Name</span>\n");
      out.write("                  </p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"officername\"\n");
      out.write("                  id=\"officername\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Highlighted By Officer Name\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"highlighteddate-label\" for=\"highlighteddate\"\n");
      out.write("                  ><p><span class=\"clue\">Highlighted Date</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"date\"\n");
      out.write("                  name=\"highlighteddate\"\n");
      out.write("                  id=\"highlighteddate\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"rectified-label\" for=\"rectified\">\n");
      out.write("                  <p><span class=\"clue\">Rectified</span></p></label\n");
      out.write("                >\n");
      out.write("                <select\n");
      out.write("                  id=\"rectified\"\n");
      out.write("                  name=\"rectified\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  required\n");
      out.write("                >\n");
      out.write("                  <option disabled selected value>Select Here</option>\n");
      out.write("                  <option value=\"Yes\">Yes</option>\n");
      out.write("                  <option value=\"No\">No</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"rectificationdate-label\" for=\"rectificationdate\"\n");
      out.write("                  ><p><span class=\"clue\">Rectification Date</span></p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"date\"\n");
      out.write("                  name=\"rectificationdate\"\n");
      out.write("                  id=\"rectificationdate\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label id=\"resolvingtime-label\" for=\"resolvingtime\"\n");
      out.write("                  ><p>\n");
      out.write("                    <span class=\"clue\"\n");
      out.write("                      >Resolving Time<br />&nbsp(Highlighted Date - Resolving\n");
      out.write("                      Date)</span\n");
      out.write("                    >\n");
      out.write("                  </p></label\n");
      out.write("                >\n");
      out.write("                <input\n");
      out.write("                  type=\"text\"\n");
      out.write("                  name=\"resolvingtime\"\n");
      out.write("                  id=\"resolvingtime\"\n");
      out.write("                  class=\"form-control\"\n");
      out.write("                  placeholder=\"Resolving Time\"\n");
      out.write("                />\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("      const body = document.querySelector(\"body\"),\n");
      out.write("        sidebar = body.querySelector(\"nav\"),\n");
      out.write("        toggle = body.querySelector(\".toggle\"),\n");
      out.write("        searchBtn = body.querySelector(\".search-box\"),\n");
      out.write("        modeSwitch = body.querySelector(\".toggle-switch\"),\n");
      out.write("        modeText = body.querySelector(\".mode-text\");\n");
      out.write("      toggle.addEventListener(\"click\", () => {\n");
      out.write("        sidebar.classList.toggle(\"close\");\n");
      out.write("      });\n");
      out.write("      searchBtn.addEventListener(\"click\", () => {\n");
      out.write("        sidebar.classList.remove(\"close\");\n");
      out.write("      });\n");
      out.write("      modeSwitch.addEventListener(\"click\", () => {\n");
      out.write("        body.classList.toggle(\"dark\");\n");
      out.write("        if (body.classList.contains(\"dark\")) {\n");
      out.write("          modeText.innerText = \"Light mode\";\n");
      out.write("        } else {\n");
      out.write("          modeText.innerText = \"Dark mode\";\n");
      out.write("        }\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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