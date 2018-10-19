<%@ page  isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
哈哈哈
    <table>
        <tr>
            <td>
                总数:
            </td>
            <td>
                ${requestScope.count}
            </td>
        </tr>
        <c:forEach items="${requestScope.list}" var="list">
            <tr>
                <td>
                    姓名:
                </td>
                <td>
                    ${list.name}
                </td>
            </tr>
            <tr>
                <td>
                    年龄:
                </td>
                <td>
                    ${list.age}
                </td>
            </tr>
            <tr>
                <td>
                    性别:
                </td>
                <td>
                    ${list.sex}
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
