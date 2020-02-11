$(document).ready(Main);
var aIMG=["catandninja.png","cherry.jpg","coder2.jpg","daftpunk.gif","domo-cat.png","mario.png","stormtroopocat.png","visionary.jpg"];
function Main() {
  var _name="";
  $("img").hover(cambiarIN,cambiarOUT);
}
function cambiarIN() {
  _name=$(event.target).attr("src");
  var _r=Math.floor(Math.random()*7);
  $(event.target).attr("src","./img/"+aIMG[_r]);
}
function cambiarOUT() {
  $(event.target).attr("src",_name);
}