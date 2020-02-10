$(document).ready(Main());

function Main() {
  $(".container div img").click(Desaparecer);
  //$(".container div").children().click(Desaparecer);
  $("button").click(Aparecer);
}
function Desaparecer() {
  $(event.target).hide()
}
function Aparecer() {
  $(".container div img").show();
}