package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import src.CartItem;
import java.util.List;
import src.Cart;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    <center>\n");
      out.write("        <h1>~~~Add Product To Cart~~~</h1>\n");
      out.write("        <form action=\"abc\" method=\"POST\">\n");
      out.write("            <table border=\"1 \">\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"background-color: chartreuse;\">Product ID</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pid\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"background-color:chartreuse;\">Product Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pname\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"background-color: chartreuse;\">Quantity</td>\n");
      out.write("                    <td><input type=\"text\" name=\"qty\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"background-color: chartreuse;\">Unit Price</td>\n");
      out.write("                    <td><input type=\"text\" name=\"up\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr >\n");
      out.write("                    <td colspan=\"2\" style=\"background-color: chartreuse; text-align: center;\"><input type=\"submit\" name=\"\" value=\"Add to cart\"/></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <h1>~~~ View Shopping Cart~~~</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <table border=\"1\" style=\"margin-top: 20px;\">\n");
      out.write("            <tr >\n");
      out.write("                <th style=\"padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;\">Product ID</th>\n");
      out.write("                <th style=\"padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;\">Product Name</th>\n");
      out.write("                <th style=\"padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;\">Quantity</th>\n");
      out.write("                <th style=\"padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;\">Unit Price</th>\n");
      out.write("                <th style=\"padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;\">Total</th>\n");
      out.write("                <th style=\"padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;\">Action</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                double tot=0;
            HttpSession ss=request.getSession();
            if(ss.getAttribute("mycart")!=null){
                Cart cr=(Cart)ss.getAttribute("mycart");
                List<CartItem> ci=cr.getCrt_itm();
                
                for(CartItem crt:ci){
                    
                tot+=(crt.getQty()*crt.getUnit_price());
            
      out.write("\n");
      out.write("            <form action=\"RemoveProduct\" method=\"GET\">\n");
      out.write("            <tr>\n");
      out.write("            <input type=\"hidden\" name=\"pid\" value=\"");
      out.print(crt.getPro_id());
      out.write("\"/>\n");
      out.write("                <td style=\"padding-left: 10px;padding-right: 10px;\">");
      out.print(crt.getPro_id());
      out.write("</td>\n");
      out.write("                <td style=\"padding-left: 10px;padding-right: 10px;\">");
      out.print(crt.getPro_name());
      out.write("</td>\n");
      out.write("                <td style=\"padding-left: 10px;padding-right: 10px;\">");
      out.print(crt.getQty());
      out.write("</td>\n");
      out.write("                <td style=\"padding-left: 10px;padding-right: 10px;\">");
      out.print(crt.getUnit_price());
      out.write("</td>\n");
      out.write("                <td style=\"padding-left: 10px;padding-right: 10px;\">");
      out.print(crt.getQty()*crt.getUnit_price());
      out.write("</td>\n");
      out.write("                <td style=\"padding-left: 10px;padding-right: 10px;\"><input type=\"submit\" name=\"action\" value=\"Remove\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            </form>\n");
      out.write("           ");
}}
      out.write(" \n");
      out.write("        </table>\n");
      out.write("        <h1 style=\" color: red;\">Cart Net Amount is:RS.");
      out.print(tot);
      out.write("</h1>\n");
      out.write("    </center>\n");
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
