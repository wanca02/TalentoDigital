function random_color()
{
    var rgb = ['a','b','c','d','e','f','0','1','2','3','4','5','6','7','8','9'];
    color = '#'  //this is what we'll return!
    for(var i = 0; i < 6; i++) 
    {
      x = Math.floor((Math.random()*16))
      color += rgb[x]; 
    }
    return color;
}
function changeColor($this) {
  $this.css( "background-color", random_color );
}
$(document).ready(function(){
    $('#large_box').click(function(event){
      //alert('you clicked the big box!');  event.target
      changeColor($(this).children());
      changeColor($(this));
//comenta esto cuando hayas averiguado para qué se utiliza event.stopPropagation 
    })
    $('.side_box').click(function(event){
      event.stopPropagation();
      changeColor($(event.target).siblings());
    })
    $('.middle_box').click(function(event){
      event.stopPropagation();
      changeColor($(this).parent());
    })
});