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

// details of country
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(country, status){
			$('#idDetails').val(country.id);
			$('#descriptionDetails').val(country.description);
			$('#codeDetails').val(country.code);
			$('#lastModifiedByDetails').val(country.lastModifiedBy);
			$('#lastModifiedDateDetails').val(country.lastModifiedDate.substr(0,19).replace("T", " "));
		});
		$('#detailsModal').modal();
	});


// delete button
$('.table #deleteButton').on('click',function(event){
    event.preventDefault();
    var href= $(this).attr('href');
    $('#deleteModal #delRef').attr('href', href);
    $('#deleteModal').modal();
});
}); // first line function