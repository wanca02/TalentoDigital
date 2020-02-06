var world=[];
var fil=20;
var col=10;
var flag=1;
for (var i = 0; i < fil; i++) {
  var a = new Array(col);
  a[0]=2;
  a[a.length-1]=2;
  for (var j = 1; j < a.length-1; j++) {
    if (i==0 || i==fil-1) {
      a[j]=2;
    }else{
      for (var k = 1; k < a.length-1; k+=2) {
        a[k]=Math.floor(Math.random()*3);
        if (Math.random()<0.02) {
          a[k]=3;
        }
      }
    }
  }
  world.push(a);
}
world[1][1]=0;
world[world.length-2][world[0].length-2]=0;
console.log(world);
function displayWorld() {
  var output='';
  for (var i = 0; i < world.length; i++) {
    output+="\n<div class='row'>";
    for (var j = 0; j < world[i].length; j++) {
      if (world[i][j]==2) {
        output+="<div class='brick'></div>";
      }else{
        if (world[i][j]==1) {
          output+="<div class='coin'></div>";
        }else{
          if (world[i][j]==3) {
            output+="<div class='cherry'></div>";
          }else{
            output+="<div class='empty'></div>";
          }
        }
      }
    }
    output+="\n</div>"
  }
  document.getElementById("world").innerHTML=output;
}
var _x=22;
var _y=26;
var giro=360;
var score=[0,0];
var life=[5,5];
var pacman=[
  {x:32, y:35},
  {x:22*col-35, y:35}
];
var ghost={
  x:22*col-34,
  y:26*fil-43
};


function displayPacman() {
  document.getElementById("pacman1").style.top=pacman[0].y+"px";
  document.getElementById("pacman1").style.left=pacman[0].x+"px";
  document.getElementById("pacman2").style.top=pacman[1].y+"px";
  document.getElementById("pacman2").style.left=pacman[1].x+"px";
}
function displayGhost() {
  document.getElementById("ghost").style.top=ghost.y+"px";
  document.getElementById("ghost").style.left=ghost.x+"px";
}
function displayScore() {
  var sc=document.getElementsByClassName("score")[0];
  sc.childNodes[1].innerHTML="Pacman 1: "+score[0];
  sc.childNodes[3].innerHTML="Pacman 2: "+score[1];
}
function displayLife() {
  var sc=document.getElementsByClassName("life")[0];
  sc.childNodes[1].innerHTML="Life 1: "+life[0];
  sc.childNodes[3].innerHTML="Life 2: "+life[1];
}
function scoreCount() {
  if (world[((pacman[0].y-35)/_y)+1][((pacman[0].x-32)/_x)+1]==1) {
    world[((pacman[0].y-35)/_y)+1][((pacman[0].x-32)/_x)+1]=0;
    score[0]+=10;
  }
  else if (world[((pacman[0].y-35)/_y)+1][((pacman[0].x-32)/_x)+1]==3) {
    world[((pacman[0].y-35)/_y)+1][((pacman[0].x-32)/_x)+1]=0;
    score[0]+=50;
  }
  if (world[(((pacman[1].y-35)/_y))+1][parseInt(((pacman[1].x)/_x))]==1) {
    world[(((pacman[1].y-35)/_y))+1][parseInt(((pacman[1].x)/_x))]=0;
    score[1]+=10;
  }
  else if (world[(((pacman[1].y-35)/_y))+1][parseInt(((pacman[1].x)/_x))]==3) {
    world[(((pacman[1].y-35)/_y))+1][parseInt(((pacman[1].x)/_x))]=0;
    score[1]+=50;
  }
}
function lifeCount() {
  for (let i = 0; i < 2; i++) {
    if (pacman[i].x==ghost.x && pacman[i].y == ghost.y && flag) {
      life[i]-=1;
      flag=0;
    } else if (pacman[i].x<ghost.x || pacman[i].y < ghost.y && flag==0) {
      flag=1; 
    }
    if (life[i]==0 || life[i]==0) {
      life[i]=0;
      flag=0;
      alert("Game Over");
    }
  }
}
function moveGhost() {
  var move=Math.floor(Math.random()*5);
  if (move==1 && world[parseInt((ghost.y/_y))-1][parseInt((ghost.x/_x))] !=2) {
    ghost.y-=_y;//arriba
  }else if (move==2 && world[parseInt((ghost.y/_y))+1][parseInt((ghost.x/_x))] !=2) {
    ghost.y+=_y;//abajo
  }else if (move==3 && world[parseInt((ghost.y/_y))][parseInt((ghost.x/_x))+1] !=2) {
    ghost.x+=_x;//left
  }else if (move==4 && world[parseInt((ghost.y/_y))][parseInt((ghost.x/_x))-1] !=2) {
    ghost.x-=_x;//right
  }else if (move==0) {
    ghost.x+=0;
    ghost.y+=0;
  }
}

function gamePlay() {
  scoreCount();
  lifeCount();
  displayLife();
  displayScore();
  displayWorld();
  displayPacman();
  displayGhost();
  moveGhost();
}
setInterval(gamePlay,150);

document.onkeydown=function(e) {
  var img = document.getElementById('pacman1');
  if (e.keyCode==37 && world[(((pacman[0].y-35)/_y)+1)][(((pacman[0].x-32)/_x)+1)-1]!=2) {
    pacman[0].x-=_x;
    img.setAttribute('style','transform: rotate(180deg);')
  }
  else if (e.keyCode==39 && world[(((pacman[0].y-35)/_y)+1)][(((pacman[0].x-32)/_x)+1)+1]!=2) {
    pacman[0].x+=_x;
    img.setAttribute('style','transform: rotate(0deg);')
  }
  else if (e.keyCode==38 && world[(((pacman[0].y-35)/_y)+1)-1][(((pacman[0].x-32)/_x)+1)]!=2) {
    pacman[0].y-=_y;
    img.setAttribute('style','transform: rotate(270deg);')
  }
  else if (e.keyCode==40 && world[(((pacman[0].y-35)/_y)+1)+1][(((pacman[0].x-32)/_x)+1)]!=2) {
    pacman[0].y+=_y;
    img.setAttribute('style','transform: rotate(90deg);')
  }
  //-------EL OTRO PACMAN----------

  var img = document.getElementById('pacman2');
  if (e.keyCode==65 && world[(((pacman[1].y-35)/_y))+1][parseInt(((pacman[1].x)/_x))-1]!=2) {
    pacman[1].x-=_x;//Right
    img.setAttribute('style','transform: rotate(180deg);')
  }
  else if (e.keyCode==68 && world[((pacman[1].y-35)/_y)+1][parseInt(((pacman[1].x)/_x)+1)]!=2) {
    pacman[1].x+=_x;
    img.setAttribute('style','transform: rotate(0deg);')
  }
  else if (e.keyCode==87 && world[((pacman[1].y-35)/_y)][parseInt(((pacman[1].x)/_x))]!=2) {
    pacman[1].y-=_y;
    img.setAttribute('style','transform: rotate(270deg);')
  }
  else if (e.keyCode==83 && world[(((pacman[1].y-35)/_y)+2)][parseInt(((pacman[1].x)/_x))]!=2) {
    pacman[1].y+=_y;
    img.setAttribute('style','transform: rotate(90deg);')
  }
  //console.log(pacman[1]);
  //console.log(((pacman[1].y-35)/_y)+1,parseInt((pacman[1].x)/_x)+1)
}

