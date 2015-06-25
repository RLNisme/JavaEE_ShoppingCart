<%-- 
    Document   : index
    Created on : Jul 30, 2014, 8:32:50 AM
    Author     : Lakmal
--%>

<%@page import="src.CartItem"%>
<%@page import="java.util.List"%>
<%@page import="src.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
    <center>
        <h1>~~~Add Product To Cart~~~</h1>
        <form action="abc" method="POST">
            <table border="1 ">
                <tr>
                    <td style="background-color: chartreuse;">Product ID</td>
                    <td><input type="text" name="pid"/></td>
                </tr>
                <tr>
                    <td style="background-color:chartreuse;">Product Name</td>
                    <td><input type="text" name="pname"/></td>
                </tr>
                <tr>
                    <td style="background-color: chartreuse;">Quantity</td>
                    <td><input type="text" name="qty"/></td>
                </tr>
                <tr>
                    <td style="background-color: chartreuse;">Unit Price</td>
                    <td><input type="text" name="up"/></td>
                </tr>
                <tr >
                    <td colspan="2" style="background-color: chartreuse; text-align: center;"><input type="submit" name="" value="Add to cart"/></td>
                    
                </tr>
            </table>
        </form>
        <h1>~~~ View Shopping Cart~~~</h1>
        
        
        <table border="1" style="margin-top: 20px;">
            <tr >
                <th style="padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;">Product ID</th>
                <th style="padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;">Product Name</th>
                <th style="padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;">Quantity</th>
                <th style="padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;">Unit Price</th>
                <th style="padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;">Total</th>
                <th style="padding-left: 10px;padding-right: 10px;background: darkorange;text-align: center;font-weight: 800px;">Action</th>
            </tr>
            <%
                double tot=0;
            HttpSession ss=request.getSession();
            if(ss.getAttribute("mycart")!=null){
                Cart cr=(Cart)ss.getAttribute("mycart");
                List<CartItem> ci=cr.getCrt_itm();
                
                for(CartItem crt:ci){
                    
                tot+=(crt.getQty()*crt.getUnit_price());
            %>
            <form action="RemoveProduct" method="GET">
            <tr>
            <input type="hidden" name="pid" value="<%=crt.getPro_id()%>"/>
                <td style="padding-left: 10px;padding-right: 10px;"><%=crt.getPro_id()%></td>
                <td style="padding-left: 10px;padding-right: 10px;"><%=crt.getPro_name()%></td>
                <td style="padding-left: 10px;padding-right: 10px;"><%=crt.getQty()%></td>
                <td style="padding-left: 10px;padding-right: 10px;"><%=crt.getUnit_price()%></td>
                <td style="padding-left: 10px;padding-right: 10px;"><%=crt.getQty()*crt.getUnit_price()%></td>
                <td style="padding-left: 10px;padding-right: 10px;"><input type="submit" name="action" value="Remove"/></td>
            </tr>
            </form>
           <%}}%> 
        </table>
        <h1 style=" color: red;">Cart Net Amount is:RS.<%=tot%></h1>
    </center>
    </body>
</html>
