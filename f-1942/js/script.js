var score=0;
var hero={
  x:300,
  y:500
};
var enemies=[
  {x:50,y:50},
  {x:250,y:50},
  {x:350,y:50}
];
var bullets=[];
function displayHero() {
  document.getElementById("hero").style['top']=hero.x+"px";
  document.getElementById("hero").style['left']=hero.y+"px";
}
function displayEnemies() {
  var output="";
  for (let i = 0; i < enemies.length; i++) {
    output += "<div class='enemy1' style='top:"+enemies[i].y+"px; left:"+enemies[i].x+"px;'></div>";
  }
  document.getElementById("enemies").innerHTML = output;
}

function moveEnemies() {
  for (let i = 0; i < enemies.length; i++){
    enemies[i].y+=5;
    if (enemies[i].y>540) {
      enemies[i].x=Math.floor(Math.random()*500);
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
  document.getElementById("socre").innerHTML = score;
}

function gameLoop() {
  displayHero();
  moveEnemies();
  moveBullets();
  displayEnemies();
  displayBullets();  
  detecteCollision();
  displayScore();
}
function detecteCollision() {
  for (let i = 0; i < bullets.length; i++) {
    for (let j = 0; j < enemies.length; j++) {
      if (Math.abs(bullets[i].x - enemies[j].x)<10 && Math.abs(bullets[i].y - enemies[j].y)<10) {
        console.log("buller",i,"and enemy",j,"collided");
        score += 10;
      }
    }
  }  
}
setInterval(gameLoop,20);
document.onkeydown=function(a) {
  if (a.keyCode == 37) {
    hero.y -= 10;
  }else if (a.keyCode == 39) {
    hero.y += 10;
  }else if (a.keyCode==32) {
    bullets.push({x:hero.y+6,y:hero.x-14});
    displayBullets();
  }
}

