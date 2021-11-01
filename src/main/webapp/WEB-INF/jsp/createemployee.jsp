<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Create Employee</h1>
<form:form method="post" action="/create-employee">
    <table>
        <tr>
           <td>User Name: </td>
           <td><form:input path="username"/></td>
       </tr>
       <tr>
            <td>Password: </td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
             <td>Employee Type: </td>
             <td><form:input path="employeeType"/></td>
        </tr>
        <tr>
             <td>First Name: </td>
              <td><form:input path="firstname"/></td>
        </tr>
        <tr>
            <td>Last Name: </td>
            <td><form:input path="lastname"/></td>
        </tr>
       <tr>
            <td>Lisence Num: </td>
            <td><form:input path="lisenceNo"/></td>
        </tr>
        <tr>
             <td>Phone Num: </td>
             <td><form:input path="phoneNumber"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create"/></td>
        </tr>
    </table>
</form:form>