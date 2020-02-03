function tam_grande(p) {
  for (var i = 0; i < p.length; i++) {
    if (p[i]>0) {
      p[i]="big";
    }
  }
  return p;
}
function imprime_retorna(p) {
  var mayor=p[0];
  var menor=0;
  for (var i = 0; i < p.length; i++) {
    if(mayor<p[i]){
      mayor=p[i];
    }else{
      if(menor>p[i]){
        menor=p[i];
      }
    }
  }
  console.log(menor);
  return mayor;
}
function uno_otro(p) {
  console.log(p[p.length-2]);
  var i=0;
  while(i<p.length && p[i]%2==0){
    i++;
  }
  return p[i];
}
function doble_vision(p) {
  a=p;
  for (var i = 0; i < p.length; i++) {
    a[i]*=2;
  }
  return a;
}
function contar_pos(p) {
  var cc=0;
  for (var i = 0; i < p.length; i++) {
    if (p[i]>0) {
      cc+=1;
    }
  }
  p[p.length-1]=cc;
  return p;
}
function pares_impares(p) {
  var par=0;
  var impar=0;
  var flag=0;
  for (var i = 0; i < p.length; i++) {
    if(p[i]%2!=0){
      flag=1; //ES IMPAR
    }else{
      flag=0; //ES PAR
    }
    if(flag){
      impar+=1;
      if (impar==3) {
        return "¡Qué imparcial!";
      }
    }else{
      par+=1;
      if (par==3) {
        return "¡Es para bien!";
      }
    }
    if (impar<3 && flag==0) {
      impar=0;
    }else{
      if (par<3 && flag==1) {
        par=0;
      }
    }
  }
  if (par<3 && impar<3) {
    return "no se";
  }
}

function incre_segundo(p) {
  for (var i = 0; i < p.length; i++) {
    if (i%2!=0) {
      p[i]=p[i]+1
    }
  }
  return p;
}
function long_previas(p) {
  var a = [];
  for (var i = p.length-1; i >=1; i--) {
    p[i]=p[i-1].length;
  }
  return p;
}
function add_siete(p) {
  var a = new Array(p.length);
  for (var i = 0; i < p.length; i++) {
    a[i] = p[i]+7;
  }
  return a;
}
function array_inverso(x) {
  for (var i = 0; i < x.length/2; i++) {
    var a=x[i];
    x[i]=x[x.length-(i+1)];
    x[x.length-(i+1)] = a;
  }
  return x;
}
function pers_negativa(p) {
  var a = new Array(p.length);
  for (var i = 0; i < p.length; i++) {
    if (p[i]>0) {
      a[i]=p[i]*-1;
    }else{
      a[i]=p[i];
    }
  }
  return a;
}
function pers_negativa(p) {
  var a = new Array(p.length);
  for (var i = 0; i < p.length; i++) {
    if (p[i]>0) {
      a[i]=p[i]*-1;
    }else{
      a[i]=p[i];
    }
  }
  return a;
}
function hambriento(p) {
  var cc=0;
  for (var i = 0; i < p.length; i++) {
    if (p[i]=="comida") {
      console.log("yummy");
      cc++;
    }    
  }
  if (cc==0) {
    console.log("tengo hambre :(");
  }
}
function cambiar_centro(x) {
  for (var i = 0; i < x.length/2; i+=2) {
    var a=x[i];
    x[i]=x[x.length-(i+1)];
    x[x.length-(i+1)] = a;
  }
  return x
}
function escala_array(p,n) {
  for (var i = 0; i < p.length; i++) {
    p[i]=p[i]*n;
  }
  return p;
}
console.log("FUNCION 1: tam_grande(p)");
console.log(tam_grande([-1,3,5,-5]));

console.log("\nFUNCION 2: imprime_retorna(p)");
console.log(imprime_retorna([-1,3,5,-5]));

console.log("\nFUNCION 3: uno_otro(p)");
console.log(uno_otro([1,3,5,-5]));

console.log("\nFUNCION 4: doble_vision(p)");
console.log(doble_vision([1,3,5,-5]));

console.log("\nFUNCION 5: contar_pos(p)");
console.log(contar_pos([1,3,5,-5]));

console.log("\nFUNCION 6: pares_impares(p)");
console.log(pares_impares([2,3,2,3,1,3,6]));

console.log("\nFUNCION 7: incre_segundo(p)");
console.log(incre_segundo([1,2,3,6]))

console.log("\nFUNCION 8: long_previas(p)");
console.log(long_previas(["hola","hola5","Dojito","dos"]));

console.log("\nFUNCION 9: add_siete(p)");
console.log(add_siete([1,2,3]));

console.log("\nFUNCION 10: array_inverso(p)");
console.log(array_inverso([1,2,3,6]));

console.log("\nFUNCION 11: pers_negativa(p)");
console.log(pers_negativa([1,-2,-3,6]));

console.log("\nFUNCION 12: hambriento(p)");
hambriento([1,"comida",3,4,"comida"]);
hambriento([1,3,4,5]);

console.log("\nFUNCION 13: cambiar_centro(p)");
console.log(cambiar_centro([1,2,3,4,5,6]));
console.log(cambiar_centro([true, 42, "Ada", 2, "pizza"]));

console.log("\nFUNCION 14: escala_array(p)");
console.log(escala_array([1,2,3,4,5,3,1,6],3));