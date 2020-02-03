function sigma(n) {
  var suma=0;
  for (var i = 1; i < n+1; i++) {
    suma+=i;    
  }
  return suma;
}
function factorial(n) {
  var fac=1;
  for (var i = 2; i < n+1; i++) {
    fac*=i;    
  }
  return fac;
}
function fibonacci_itera(n){
  var a=0, b=1,aux=0;
  for (var i = 0; i < n; i++) {
    aux=a;
    a=aux+b;
    b=aux;
  }
  return a;
}
function fibonacci_rec(n) {
  //n<=1
  if (n==0 || n==1) {
    return n;
  }
  return fibonacci_rec(n-2) + fibonacci_rec(n-1);
}
function array_penultimo(p) {
  if (p.length<3) {
    return null;
  }else{
    return p[p.length-2];
  }
}
function array_n_ultimo(p,n) {
  if (p.length<3 || p.length<=n) {
    return null;
  }else{
    return p[p.length-(n)];
  }
}
function array_segundo_my(p) {
  if (p.length<2) {
    return null;
  }else{
    var mayor=p[0];
    for (var i = 0; i < p.length; i++) {
      if(mayor<p[i]){
        mayor=p[i];
      }
    }
    var mayor2=p[0];
    for (var i = 0; i < p.length; i++) {
      if(mayor2<p[i] && p[i]!= mayor){
        mayor2=p[i];
      }
    }
    return mayor2;
  }
}
function doble_problema(x) {
  var a=[];
  for (var i = 0; i < x.length; i++) {
    a.push(x[i]);
    a.push(x[i]);
  }
  return a;
}
console.log("FUNCIÓN 1: sigma(n)");
console.log(sigma(3));

console.log("\nFUNCIÓN 2: factorial(n)");
console.log(factorial(5));

console.log("\nFUNCIÓN 3: fibonacci_itera(n)");
console.log(fibonacci_itera(1));

console.log("\nFUNCIÓN 4: array_penultimo(n)");
console.log(array_penultimo([1,2,3]));

console.log("\nFUNCIÓN 5: array_n_ultimo(n)");
console.log(array_n_ultimo([5,2,3,6,4,9,7],3));

console.log("\nFUNCIÓN 6: array_segundo_my(n)");
console.log(array_segundo_my([5,2,3,6,4,9,7]));

console.log("\nFUNCIÓN 7: doble_problema(x)");
console.log(doble_problema([4,"Ulysses", 42, false]));

console.log("\nFUNCIÓN 8: fibonacci_rec(n)");
console.log(fibonacci_rec(1));