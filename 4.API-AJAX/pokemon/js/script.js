$(document).ready(Main);

function Main() {
  addImgjq();
  /*
  for (let i = 1; i <= 150; i++) {
    //addImg("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/"+i+".png");
    addImgtxt("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/"+i+".png");
  }*/
}

function addImgjq() {
  var a =jQuery(Array(151).join("<img>"));
  console.log(a[0].attr("src","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/1.png"));
  //$(".container").append();
  
}
function addImg(i) {
  var img=document.createElement("img");
  img.setAttribute("src",i);
  $(".container").append(img);
}
function addImgtxt(i) {
  var txt=$("<img>").attr("src",i);
  $(".container").append(txt);
}