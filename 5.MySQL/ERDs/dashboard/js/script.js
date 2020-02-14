$(document).ready(Main);

function Main(){
  $("#btn-sign").click(changeDiv);
  $("#_home").click(goBack);
  $("#regi-link").click(goRegister);
  $("#cancelRegis").click(goSign);
}
function goSign() {
  $("#page-3").fadeOut("fast");
  $("#page-2").show("slow");
}
function goRegister() {
  $("#page-2").fadeOut("fast");
  $("#page-3").show("slow");
}
function goBack() {
  $("#page-2,#page-3").fadeOut("fast");
  $("#btn-sign").fadeIn("slow");
  $("#page-1").show("slow");
}
function changeDiv(){
  $("#page-1,#btn-sign").fadeOut("fast");
  $("#page-2").show("slow");
}