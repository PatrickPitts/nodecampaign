<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org">
<head>
    <title>All Nodes</title>
</head>
<body>
<h2>View All Nodes in Campaign</h2>

<table>
    <tr th:each="node : ${nodeList}">
        <td><a th:href="@{/display-node(id=${node.nodeID})}">[[${node.nodeName}]]</a></td>
        <td th:text="${node.nodeType}"></td>
    </tr>
</table>
</body>
</html>