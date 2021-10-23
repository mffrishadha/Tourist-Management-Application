<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Create Customer</h1>
<form:form method="post" action="/create-customer">
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
             <td>Phone number: </td>
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
            <td>Passport no: </td>
            <td><form:input path="passportNo"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create"/></td>
        </tr>
    </table>
</form:form>