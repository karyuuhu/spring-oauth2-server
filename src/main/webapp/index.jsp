<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Home</title>
    <c:set var="contextPath" value="${pageContext.request.contextPath}" scope="application"/>

</head>
<body>
<h2>Spring Security&OAuth2 Test
</h2>

<p>
    <a href="${contextPath}/login.jsp">Login</a>
    &nbsp;|&nbsp;
    <a href="${contextPath}/logout.do">Logout</a>
</p>

<div>
    Learning material:
    <ol>
        <li>
            <p>
                <a href="resources/material/spring_security.html" target="_blank">spring security</a>
            </p>
        </li>
        <li>
            <p>
                <a href="resources/material/oauth2_flow.html" target="_blank">OAuth2</a>
            </p>
        </li>
        <li>
            <p>
                <a href="resources/material/oauth2_spring.html" target="_blank">Spring OAuth2</a>
            </p>
        </li>
    </ol>
</div>
<br/>
Function:
<ul>
    <li>
        <p>
            <a href="client_details">client_details</a> <span class="text-muted">- Manage ClientDetails</span>
        </p>
    </li>
    <li>
        <p>
            <a href="${contextPath}/user/overview">User</a> <span class="text-muted">- Manage User</span>
        </p>
    </li>
    <li>
        <p>
            <a href="${contextPath}/unity/dashboard">Unity</a> <span class="text-muted">- Unity 资源(resource), 需要具有 [ROLE_UNITY] 权限(resourceId:
                <mark>unity-resource</mark>才能访问</span>
        </p>
    </li>
    <li>
        <p>
            <a href="${contextPath}/m/dashboard">Mobile</a> <span class="text-muted">- Mobile资源(resource), 需要具有 [ROLE_MOBILE] 权限(resourceId:
                <mark>mobile-resource</mark>才能访问</span>
        </p>
    </li>
</ul>
<br/>

<div class="well well-sm">
    <p>
        <strong>说明</strong>: Unity与Mobile菜单需要先获取到<code>access_token</code>后才能正常访问; 可以尝试在URL后面任意添加access_token参数值试试效果,
        <br/>
        如: <a href="${contextPath}/m/dashboard?access_token=i_am_testing_access_token">${contextPath}/m/dashboard?access_token=i_am_testing_access_token</a>
    </p>

    <p>
        请求受保护的资源时传递
        <mark>Access Token</mark>
        有两种方式, 方式一在URL参数中添加<code>access_token</code>, 方式二在请求的Header中添加 <em>Authorization</em>, 其值为 <em>bearer
        your_access_token</em>
    </p>
</div>
</body>
</html>