$(document).ready(Main());

function Main() {
  $(".container div img").click(Desaparecer);
  //$(".container div").children().click(Desaparecer);
  $("button").click(Aparecer);
}
function Desaparecer() {
  $(this).hide(); //event.target
}
function Aparecer() {
  $(".container div img").show();
}