<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Update Customer</h1>
<form:form method="post" action="/update-customer/${id}">
    <table>

        <tr>
            <td>First Name: </td>
          <td><form:input path="firstname"/></td>
        </tr>

        <tr>
            <td>Last Name: </td>
            <td><form:input path="lastname"/></td>
        </tr>

        <tr>
            <td>Username: </td>
            <td><form:input path="username"/></td>
        </tr>

          <tr>
              <td>Password: </td>
              <td><form:input path="password"/></td>
          </tr>

        <tr>
            <td>EmployeeType: </td>
            <td><form:input path="employeetype"/></td>
         </tr>

        <tr>
            <td>LicenseNo: </td>
            <td> <from:input path="licenseno"/></td>
        </tr>

        <tr>
              <td>Phone: </td>
              <td><form:input path="phoneNo"/></td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Update" /></td>
        </tr>


    </table>
</form:form>
