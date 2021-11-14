<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Update Packages</h1>
<form:form method="post" action="/update-packages/${id}">
    <table>

        <tr>
            <td>Package Name: </td>
            <td><form:input path="packageName"/></td>
        </tr>

        <tr>
            <td>Price: </td>
            <td><form:input path="price"/></td>
        </tr>

        <tr>
            <td>Description: </td>
            <td><form:input path="description"/></td>
        </tr>

        <tr>
            <td>Duration: </td>
            <td><form:input path="duration"/></td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Update" /></td>
         </tr>

    </table>
</form:form>
