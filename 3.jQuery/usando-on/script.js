$(document).ready(function(){
  $('button').click(function(){
    $('div').append('<h3>I am a dynamically generated h3 </h3>');
  });
  $(document).on('click', 'h3', function(){
    alert('You clicked me!');
  });
});
