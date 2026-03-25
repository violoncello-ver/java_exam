'use strict';

// 1
console.log("坂井美碩維");

// 2
$(function () {
  $("#change-btn-tored").on("click", function () {
    $("#my-name").css("color", "red")
  });
});

// 3
$(function () {
  $("#age-btn").click(function () {
    var age = $("#age-input").val();
    alert(age);
  });
});

// 4
$(function () {
  $("#once-btn").click(function () {
    $("#once-btn").prop("disabled", true);
  });
});

// 5
$(function () {
  // 初期値で最初何も書かない
  $("#code-text").text("");
  $("#lang-select").change(function () {
    var lang = $(this).val();

    if(lang === "java") {
      $("#code-text").text('System.out.println("Hello World");');
    } else if (lang === "js"){
      $("#code-text").text('console.log("Hello World");');
    } else {
      $("#code-text").text("");
    }
  });
});
