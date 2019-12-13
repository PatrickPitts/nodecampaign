<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org">
<head>
    <title>Node Campaign</title>
</head>
<body>
<h2>[[${node.nodeName}]]</h2>

<span th:each="note:${notes}">
    <p th:utext="${note.note}">Txt</p>
</span>

<a th:href="@{/}">Add More notes</a>

</body>
</html>