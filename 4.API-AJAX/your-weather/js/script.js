$(document).ready(Main);
var api_key="885d9780ebf418fc40407ae49d5a3546";
function Main() {
  $('form').submit(getData);
  $("#btn").click(getNewData);
}
function getNewData() {
  var url="http://api.openweathermap.org/data/2.5/box/city?bbox=-70,-54,-70,-18,10&units=metric&appid="+api_key
  $.get(url, function(res){
    console.log(res)
  }, 'json');
  return false;
}
function getData() {
  var city_name=$( "#select1 option:selected" ).text();
  var url="http://api.openweathermap.org/data/2.5/weather?q="+city_name+"&appid="+api_key+"&units=metric";
  $.get(url, setData, 'json');
  return false;
}
function getlistData(){
  var url="./js/city.list.json";
  $.get(url, function(res){
    console.log(res);
  },"json");
}
function setData(res) {
  console.log(res);
  $(".container div label:last-child").text(res.main.temp);
}
