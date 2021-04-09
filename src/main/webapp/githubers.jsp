<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="fr.wildcodeschool.githubtracker.model.Githuber" %>

<jsp:include page="header.jsp"></jsp:include>
    <h1>Githubers</h1>
<%--    <table>--%>
<%--        <tr>--%>
<%--            <th>ID</th>--%>
<%--            <th>Name</th>--%>
<%--            <th>Email</th>--%>
<%--            <th>Login</th>--%>
<%--            <th>Avatar</th>--%>
<%--        </tr>--%>

<%--        <c:forEach items="${githubers}" var="githuber">--%>
<%--            <tr>--%>
<%--                <td><c:out value="${githuber.getId}" /></td>--%>
<%--                <td><c:out value="${githuber.getName}" /></td>--%>
<%--                <td><c:out value="${githuber.getEmail}" /></td>--%>
<%--                <td><c:out value="${githuber.getLogin}" /></td>--%>
<%--                <td><c:out value="${githuber.getAvatarUrl}" /></td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>

    <pre>
        <% List<Githuber> githuberList = (ArrayList<Githuber>)request.getAttribute("data");
            for(Githuber githuber : githuberList) {
                out.print("Id: " + githuber.getName());
            }
        %>
    </pre>
</body>
</html>