'use strict';


// 1
console.log("坂井美碩維");


// 2
var firstName = "Hasema";
var lastName = "Sakai";
console.log(firstName + " " + lastName);


// 3
let total = 200 * 3 + 250 * 4;
let tax = total * 0.1;
let totalAddTax = total + tax;
console.log("小計");
console.log(total + "円");
console.log("消費税");
console.log(tax + "円");
console.log("合計金額");
console.log(totalAddTax + "円");


// 4
let testScore = 101;
if (0 <= testScore && testScore <= 79) {
  console.log("追試です");
} else if (80 <= testScore && testScore <= 100) {
  console.log("合格です");
} else {
  console.log("存在しない点数です。")
}


// 5
let sum = 0;
for (let i = 1; i <= 100; i++) {
  sum += i;
}
console.log(sum);


// 6
function add(a, b) {
  return a + b;
}
function sub(a, b) {
  return a - b;
}
function multi(a, b) {
  return a * b;
}
function div(a, b) {
  return a / b;
}
let num1 = 5;
let num2 = 3;
console.log(num1 + " + " + num2 + " = " + add(num1, num2));
console.log(num1 + " - " + num2 + " = " + sub(num1, num2));
console.log(num1 + " * " + num2 + " = " + multi(num1, num2));
console.log(num1 + " / " + num2 + " = " + div(num1, num2));
