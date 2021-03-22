$('document').ready(function(){
    $('.table .btn-primary').on('click',function(event){
      event.preventDefault();
      var href=$(this).attr('href');
        $.get(href, function(country,status){
           $('#idEdit').val(country.id);
             $('#descriptionEdit').val(country.description);
               $('#capitalEdit').val(country.capital);
                 $('#nationalityEdit').val(country.nationality);
                   $('#txtCodeEdit').val(country.code);
                     $('#continentEdit').val(country.continent);
        });
        $('#editModal').modal();
    });
// delete button
$('.table #deleteButton').on('click',function(event){
    event.preventDefault();
    var href= $(this).attr('href');
    $('#deleteModal #delRef').attr('href', href);
    $('#deleteModal').modal();
});
}); // first line function