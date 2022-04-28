$(document).ready(function (){
    showPupils();
})

function showPupils(){
    $.get('/api/all',function (data) {
        let table = "<tr>";
        for (i = 0; i < data.length; i++){
            table = table + "<td>" + data[i].name + "</td><td>"+ data[i].surname+
                "</td><td>" + data[i].age + "</td><td>"+data[i].sex+"</td><td>" +
                data[i].address+"</td><td>" +
                '<button class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#delete" onclick="deletePupils('+data[i].id+')">delete</button>' +
                "</td></tr>";
        }
        table = table + "</tr>";
        $('#tbody').html(table)
    })

}
function deletePupils(id){
    $.ajax({
            url:'/api/delete/' + id,
            type:'DELETE',
            success: function (){
                showPupils();
            }
        }
    )
}
function addPupils(){
    console.log("sdadsaddsafas")
    $.ajax({
        url:'/api/save',
        dataType:'json',
        type: "POST",
        cache: false,
        contentType:"application/json",
        data: JSON.stringify({
            name: $("#name").val(),
            surname: $("#surname").val(),
            age: $("#age").val(),
            sex: $("#sex").val(),
            address: $("#address").val()
        }),
        success: function (){
            showPupils();
        }
    })
}