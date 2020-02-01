var bod=document.body
var users = [{name: "Michael", age:37}, {name: "John", age:30}, {name: "David", age:27}];

var div=document.createElement("DIV");
div.setAttribute("class","container");
bod.appendChild(div);

var div1=document.createElement("DIV");
div1.setAttribute("id","div-1");
document.getElementsByClassName("container")[0].appendChild(div1);

function add_parraf(text,f) {
  var p=document.createElement('p');
  p.innerHTML= text;
  if (f=="div-1") {
    document.getElementById("div-1").appendChild(p);
  }else{
    if (f=="container") {
      document.getElementsByClassName("container")[0].appendChild(p);
    }
  }
  
}
add_parraf("La edad de "+users[1].name+" es "+users[1].age,"div-1");
add_parraf("El nombre del primer objeto es: "+users[1].name,"div-1");

for (var i = 0; i < users.length; i ++){
  add_parraf(users[i].name+" - "+users[i].age,"container");
}