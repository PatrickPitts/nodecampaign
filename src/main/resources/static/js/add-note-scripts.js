// var quill = new Quill('#editor', {
//     theme: 'snow'
// });

var noteList = [];
// function compound_notes(){
//     //TODO: Update right div to show all submitted notes at once, then clear current notes pane
//
//     document.getElementById("display-text").innerHTML = document.getElementById("display-text").innerHTML +
//         quill.root.innerHTML;
//
//     noteList.push(quill.root.innerHTML);
//
//     quill.setContents([{ insert: '\n' }]);
//
//     alert(noteList);
// }

function all_notes(){
    return noteList;
}

// function read(){
//
//     document.getElementById("submit-text").value = document.getElementById("display-text").innerHTML;
//     document.getElementById("text-form").submit();
// }