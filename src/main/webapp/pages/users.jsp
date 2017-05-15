<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User management</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1>User Management</h1>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Age</th>
							<th>Address</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<logic:iterate id="user" name="users">
						<tr>
							<td><bean:write name="user" property="id"/></td>
							<td><bean:write name="user" property="name"/></td>
							<td><bean:write name="user" property="age"/></td>
							<td><bean:write name="user" property="address"/></td>
							<td><a href="">Edit</a> | <a href="">Delete</a></td>
						</tr>
						</logic:iterate>
					</tbody>
				</table>
			</div>
		</div>
	</div>

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>