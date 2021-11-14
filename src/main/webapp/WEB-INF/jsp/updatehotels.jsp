<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Update Hotels</h1>
<form:form method="post" action="/update-hotels/${id}">
    <table>

        <tr>
            <td>Name: </td>
            <td><form:input path="name"/></td>
        </tr>

          <tr>
              <td>Location: </td>
              <td><form:input path="location"/></td>
          </tr>
        <tr>
            <td>Phone Number: </td>
            <td><form:input path="phoneNumber"/></td>
         </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Update" /></td>
         </tr>

    </table>
</form:form>
