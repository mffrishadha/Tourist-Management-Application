<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Read Employees</h1>
    <table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Employee Type</th>
            <th>User Name</th>
            <th>Password</th>
            <th>License Number</th>
            <th>Phone Number</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.firstname}</td>
                <td>${employee.lastname}</td>
                <td>${employee.employeeType}</td>
                <td>${employee.username}</td>
                <td>${employee.password}</td>
                <td>${employee.licenseNo}</td>
                <td>${employee.phoneNumber}</td>
                <td><a href="/update-employee/${employee.id}">Update</a></td>
                <td><a href="/delete-employee/${employee.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
<br/>
<a href="/create-employee">Create Employee</a>