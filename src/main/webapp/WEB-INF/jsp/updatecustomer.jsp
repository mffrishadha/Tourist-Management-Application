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
              <td>Phone: </td>
              <td><form:input path="phoneNo"/></td>
        </tr>
        <tr>
            <td>Email: </td>
            <td><form:input path="email"/></td>
        </tr>
          <tr>
              <td>NIC: </td>
              <td><form:input path="nic"/></td>
          </tr>
        <tr>
            <td>PASS PORT NO: </td>
            <td><form:input path="passportNo"/></td>
         </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update" /></td>
        </tr>
    </table>
</form:form>
