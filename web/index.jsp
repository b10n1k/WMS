<%-- 
    Document   : index
    Created on : Aug 26, 2011, 12:12:23 PM
    Author     : j0ni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>System Monitor</title>
    </head>
    <body>
        <h1>System Information</h1>
        <jsp:useBean  id="newBean" class="sysmonitor.NewBean" />
        <p>The memory usage is <%= newBean.getMemoryUsed() %></p>
        <p>The HDD used space is <%= newBean.getDiskSpace() %></p>
        <p>The CPU Load is <%= newBean.getCPULoad() %></p>
    </body>
</html>
