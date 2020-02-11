$(document).ready(Main);
var _img="";
function Main() {
  createPokemons();
  $(".pokemon-list img").click(getPokeData); 
}
function getPokeData(event) {
  _img=this.src;
  $.get("https://pokeapi.co/api/v2/pokemon/"+this.id+"/", setPokeDex, "json");
}
function setPokeDex(res) {
  $(".pokemon-view h1").html(res.name);
  $(".pokemon-view img").attr("src",_img);
  var ul=document.createElement('ul');
  for(i=0;i<res.types.length;i++){
    var li=document.createElement('li');
    li.innerHTML=res.types[i].type.name;
    ul.appendChild(li);
  }
  $(".pokemon-view #tipo div").html(ul);
  $(".pokemon-view #height label:last-child").html(res.height);
  $(".pokemon-view #weight label:last-child").html(res.weight);
}
// CON ESTE ES MAS RAPIDO :3
function addImg(x,i) {
  var img=document.createElement("img");
  img.setAttribute("id",i);
  img.setAttribute("src",x);
  $(".container .pokemon-list").append(img);
}
function createPokemons() {
  for (let i = 1; i <= 150; i++) {
    addImg("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/"+i+".png",i);
    //addImgtxt("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/"+i+".png");
  }
}
//eSTE ES MAS LENTO
/*
function addImgtxt(i) {
  var txt=$("<img>").attr("src",i);
  $(".container").append(txt);
}
*/