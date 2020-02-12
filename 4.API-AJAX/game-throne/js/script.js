$(document).ready(Main);

function Main() {
  //$(".row:nth-child(2)").hide();
  $("img").click(getData);
}
function getData() {
  $(".row:nth-child(2)").show();
  var house=$(this).attr("alt");
  var url="https://www.anapioficeandfire.com/api/houses?name="+house;
  $.get(url,setData,"json");
}
function setData(res) {
  $("table tbody tr:nth-child(1) td:last-child").text(res[0].name);
  $("table tbody tr:nth-child(2) td:last-child").text(res[0].words);
  $("table tbody tr:nth-child(3) td:last-child").text(res[0].titles);
}