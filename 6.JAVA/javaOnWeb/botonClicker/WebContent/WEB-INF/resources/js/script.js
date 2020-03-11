/**
 * 
 */
$(document).ready(function() {
		$('button').click(function(event) {
			//alert("hola");
	        $.get('Counter', {
	           btn : "ok"
	        }, function(responseText) {
	                //$('#ajaxGetUserServletResponse').text(responseText);
	        	$("#result").text(responseText);
	        	console.log(responseText)
	        });
		});
	});