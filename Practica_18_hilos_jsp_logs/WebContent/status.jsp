<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="task" scope="session" class="com.ricardo.hilos.TaskBean"/>

<html>

<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <title>JSP Progress Bar</title>
    <% if (task.isRunning()) { %>
        <SCRIPT LANGUAGE="JavaScript">
            setTimeout("location='status.jsp'", 1000);
        </SCRIPT>
    <% } %>
</head>

<h1 align="center">JSP Progress Bar</h1>

<h2 align="center">
    Result: <%= task.getResult() %><br />
    <% int percent = task.getPercent(); %>
    <%= percent %>%
</h2>
<div class="container">
<div class=" progress">
  <div class="progress-bar" role="progressbar" style="width:<%= percent %>%" aria-valuenow="<%= percent %>" aria-valuemin="0" aria-valuemax="100"></div>
</div>
</div>

<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td align="center">
            <% if (task.isRunning()) { %>
                Running
            <% } else { %>
                <% if (task.isCompleted()) { %>
                    Completed
                <% } else if (!task.isStarted()) { %>
                    Not Started
                <% } else { %>
                    Stopped
                <% } %>
            <% } %>
        </td>
    </tr>
</table>
    

<body>