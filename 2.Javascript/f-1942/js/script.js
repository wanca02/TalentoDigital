var score=0,
    nEnemies=7,
    nVelo=7,
    flag=1;
var hero={
  x:300,
  y:500
};
var enemies=[],
    bullets=[];

for (let i = 0; i < nEnemies; i++) {
  enemies.push({x:Math.floor(Math.random()*700)+100,y:350});  
}

function displayHero() {
  document.getElementById("hero").style['top']=hero.y+"px";
  document.getElementById("hero").style['left']=hero.x+"px";
}
function displayEnemies() {
  var output="";
  var ene=Math.floor(Math.random()*2);
  for (let i = 0; i < enemies.length-3; i++) {
    output += "<div class='enemy1' style='top:"+enemies[i].y+"px; left:"+enemies[i].x+"px;'></div>";
  }
  for (let i = enemies.length-3; i < enemies.length; i++) {
    output += "<div class='enemy2' style='top:"+enemies[i].y+"px; left:"+enemies[i].x+"px;'></div>";    
  }
  document.getElementById("enemies").innerHTML = output;
}

function moveEnemies() {
  for (let i = 0; i < enemies.length; i++){
    enemies[i].y+=Math.floor(Math.random()*nVelo)+1;
    //enemies[i].x+=Math.floor(Math.random()*7)+4;
    if (enemies[i].y>540) {
      enemies[i].x=Math.floor(Math.random()*660)+100;
      enemies[i].y=0;
    }
  }
}
function moveBullets() {
  for (let i = 0; i < bullets.length; i++){
    bullets[i].y-=5;
    if (bullets[i].y<0) {
      bullets[i]=bullets[bullets.length-1];
      bullets.pop();
    }
  }
}
function displayBullets() {
  for (let i = 0; i < bullets.length; i++){
    var output="";
    output += "<div class='bullet' style='top:"+bullets[i].y+"px; left:"+bullets[i].x+"px;'></div>";
  }
  document.getElementById("bullets").innerHTML = output;
}

function displayScore() {
  document.getElementById("score").innerHTML = score;
}
function detecteCollision() {
  for (let i = 0; i < bullets.length; i++) {
    for (let j = 0; j < enemies.length; j++) {
      if (Math.abs(bullets[i].x - enemies[j].x)<10 && Math.abs(bullets[i].y - enemies[j].y)<10) {
        console.log("buller",i,"and enemy",j,"collided");
        score += 10;
        enemies.slice(i,1);
        console.log(enemies.length);
      }
    }
  }
}
function detCollisionHero() {
  for (let i = 0; i < enemies.length; i++) {
    if (Math.abs(hero.y - enemies[i].y)<15 && Math.abs(hero.x - enemies[i].x)<20 && flag) {
      console.log("hero and enemy",i,"collided");
      flag=0;
      score -= 500;
    }else if (Math.abs(hero.y - enemies[i].y)>150 && Math.abs(hero.x - enemies[i].x)<150 && flag==0) {
      flag=1;
    }
  }
}

function gameLoop() {
  displayHero();
  moveEnemies();
  moveBullets();
  displayEnemies();
  displayBullets();  
  detecteCollision();
  detCollisionHero();
  displayScore();
}
setInterval(gameLoop,20);


document.onkeydown=function(a) {
  if (a.keyCode == 37) {
    hero.x -= 10;
  }else if (a.keyCode == 39) {
    hero.x += 10;
  }else if (a.keyCode == 38) {
    hero.y -= 10;
  }else if (a.keyCode == 40) {
    hero.y += 10;
  }else if (a.keyCode==32) {
    bullets.push({x:hero.x+6,y:hero.y-14});
    displayBullets();
  }
}

