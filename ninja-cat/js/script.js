$(document).ready(Main());
function Main() {
  $(".container img").click(rompeHead);
}
function rompeHead() {
  var aName=["cat","ninja"];
  var _r=Math.floor(Math.random()*5);
  var _n=Math.floor(Math.random()*2);
  $(event.target).attr("src","./img/"+aName[_n]+_r+".png");
}