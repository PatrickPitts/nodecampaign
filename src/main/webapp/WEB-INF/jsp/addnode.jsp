<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org">
<head>
    <title>New Node</title>
    <link href="https://cdn.quilljs.com/1.3.6/quill.snow.css" rel="stylesheet">
    <script src="js/add-note-scripts.js"></script>
    <script src="https://cdn.quilljs.com/1.3.6/quill.js"></script>
</head>
<body>
<h2>Add a Node to your Campaign</h2>

<form th:action="@{/add-node}" id="node-form" th:object="${newNode}" method="post">
    <label for="gameNode-name">Node Name</label><input id="gameNode-name" type="text"
                                                       th:field="${newNode.nodeName}"/>
    <label for="gameNode-type">Node Type</label><input id="gameNode-type" type="text"
                                                       th:field="${newNode.nodeType}"/>
    <div id="editor"></div>
    <input type="hidden" id = "note-input" th:field="${newNode.notes}">

</form>



<button onclick="read()">Submit</button>
</body>
<script>
    var note_list = [];

    var quill = new Quill('#editor', {
        theme: 'snow'
    });

    function compound_notes() {
        note_list.push(quill.root.innerHTML);
        document.getElementById("display-text").innerHTML = "";
        for (var i = 0; i < note_list.length; i++) {
            document.getElementById("display-text").innerHTML += note_list[i];
        }

        quill.setContents([{insert: '\n'}]);
        document.getElementById("editor").focus();
    }

    function read() {
        document.getElementById("note-input").value = document.getElementById("editor").innerText;
        document.getElementById("node-form").submit();

    }
</script>

</html>
