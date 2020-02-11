function obten_1_255(p) {
  var a=[];
  for (var i = 1; i <= 255; i++) {
    a.push(i)
  }
  return a;
}
function s_pares_1000(p) {
  var suma=0;
  for (var i = 1; i <= 1000; i++) {
    if(i%2==0){
      suma+=i;
    }
  }
  return suma;
}
function s_impares_1000(p) {
  var suma=0;
  for (var i = 1; i <= 5000; i++) {
    if(i%2!=0){
      suma+=i;
    }
  }
  return suma;
}
function itera_array(p) {
  var suma=0;
  for (var i = 0; i < p.length; i++) {
    suma+=p[i];
  }
  return suma;
}
function find_mayor(p) {
  var mayor=p[0];
  for (var i = 0; i < p.length; i++) {
    if(mayor<p[i]){
      mayor=p[i];
    }
  }
  return mayor;
}
function find_promedio(p) {
  var suma=0;
  for (var i = 0; i < p.length; i++) {
    suma+=p[i];
  }
  return suma/p.length;
}
function impares_50() {
  var a=[];
  for (var i = 1; i <= 50; i++) {
    if(i%2!=0){
      a.push(i);
    }
  }
  return a;
}
function find_mayor_Y(p,y) {
  var mayor=y;
  var cc=0;
  var a=[];
  for (var i = 0; i < p.length; i++) {
    if(mayor<p[i]){
      cc+=1;
      a.push(p[i])
    }
  }
  return a;
}
function cuadrado(p) {
  for (var i = 0; i < p.length; i++) {
    p[i]=p[i]**2;
  }
  return p;
}
function negativo(p) {
  for (var i = 0; i < p.length; i++) {
    if (p[i]<0) {
      p[i]=0;
    }
  }
  return p;
}
function max_min_avg(p) {
  mayor=find_mayor(p);
  avg=find_promedio(p);
  var menor=p[0];
  for (var i = 0; i < p.length; i++) {
    if (menor>p[i]) {
      menor=p[i];
    }
  }
  var a= new Array(3);
  a[0]=mayor;
  a[1]=menor;
  a[2]=avg;
  return a;
}
function intercambia_valor(p) {
  var t=p[0];
  p[0]=p[p.length-1];
  p[p.length-1]=t;
  return p;
}
function n_to_string(p) {
  for (var i = 0; i < p.length; i++) {
    if (p[i]<0) {
      p[i]="Dojo";
    }
  }
  return p;
}
console.log("FUNCION 1: obten_1_255(p)");
console.log(obten_1_255());

console.log("\nFUNCION 2: s_pares_1000(p)");
console.log(s_pares_1000());

console.log("\nFUNCION 3: s_impares_1000(p)");
console.log(s_impares_1000());

console.log("\nFUNCION 4: itera_array(p)");
console.log(itera_array([1,2,5]));

console.log("\nFUNCION 5: find_mayor(p)");
console.log(find_mayor([10,2,5]));

console.log("\nFUNCION 6: find_promedio(p)");
console.log(find_promedio([1,3,5,7,20]));

console.log("\nFUNCION 7: impares_50(p)");
console.log(impares_50());

console.log("\nFUNCION 8: find_mayor_Y(p)");
var a=find_mayor_Y([1,3,5,7],3);
console.log(a.length,a);

console.log("\nFUNCION 9: cuadrado(p)");
console.log(cuadrado([1,5,10,-2]));

console.log("\nFUNCION 10: negativo(p)");
console.log(negativo([1,5,10,-2]));

console.log("\nFUNCION 11: max_min_avg(p)");
console.log(max_min_avg([1,5,10,-2]));

console.log("\nFUNCION 12: intercambia_valor(p)");
console.log(intercambia_valor([1,5,10,-2]));

console.log("\nFUNCION 13: n_to_string(p)");
console.log(n_to_string([1,5,10,-2]));
