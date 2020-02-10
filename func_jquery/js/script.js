$(document).ready(Main());

function Main() {
  Init();
}
function Init() {
  $("#addclass").click(function() {
    $("#row-1 p").css("color","red");
  });
  //
  var f=1;
  $("#hideclass").click(function() {
    if (f) {
      $("#row-2 p").hide("slow");
      f=0;
    }else{
      $("#row-2 p").show("slow");
      f=1;
    }
  });
  //
  $("#togclass").click(function() {
    $("#row-3 p").toggle();
  });
  //
  $("#row-4 td:first-child div").click(function() {
    $("#panel1").toggle("fast");
  });
  $("#flip").click(function(){
    $("#panel").slideDown("slow");
  });
  $("#panel").click(function() {
    $("#panel").slideUp("slow");
  });
  //
  var f1=1;
  $("#row-5 td button").click(function() {
    if(f){
      $("#row-5 td:last-child p").fadeOut("fast");
      f=0;
    }else{
      $("#row-5 td:last-child p").fadeIn("fast");
      f=1;
    }
  });
  //
  var row6="tr:nth-child(6) ";
  $(row6+"button:first-child").click(function() {
    $(row6+"p").addClass("yellow");
  });
  $(row6+"button:nth-child(2)").click(function() {
    $(row6+"span").addClass("blue");
  });
  $(row6+"button:last-child").click(function() {
    $(row6+"p,span").addClass("normal");
  });
  //------
  var row7="tr:nth-child(7) ";
  $(row7+"button:first-child").click(function() {
    $(row7+"p").before("<h3>Holaaaa!!</h3>");
  });
  $(row7+"button:nth-child(2)").click(function() {
    $(row7+"p").after("<h3>Adiooooos!!</h3>");
  });
  $(row7+"button:nth-child(3)").click(function() {
    $(row7+"span").append("<strong>aquí!!</strong>");
  });
  //----------------
  var row8="tr:nth-child(8) ";
  var r=$(row8+"h1").text();
  var t=$(row8+"p").text();
  $(row8+"button:first-child").click(function() {
    $(row8+"p").html("<h3 value='1'>"+r+"</h3>");
    $(row8+"textarea").val(t+"\n"+$(row8+"textarea").attr("cols"));
  });
}
