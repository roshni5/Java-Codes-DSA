const { rejects } = require("assert/strict");
let fs = require("fs");

let p = new Promise(function executor(resolve, reject){
    fs.readFile("f.txt", function(err, data){
        if(err) reject(err);
        else resolve(data);
    });
});

p.then(function (data){
    console.log("data is received");
    console.log(data+" ");
});
p.catch(function (err){

})
console.log("Instructions to make sandwich");
let p = new Promise(function (resolve, reject) {
  resolve("1: Obtain Necessary Ingredients");
})

.then(function (step) {
  console.log(step);
})

.then(function () {
  console.log("3: Prepare the Tomatoes");
})

.then(function () {
  console.log("2: Lay Out Your Ingredients");
})

.then(function () {
  console.log("6: Construct the Sandwich");
})

.then(function () {
  console.log("7: Turn on the Cooking Surface");
})

.then(function () {
  console.log("4: Prepare Bread");
})

.then(function () {
  console.log("5: Put Cheese on the Bread");
})

.then(function () {
  console.log("10: Remove and Enjoy");
})

.then(function () {
  console.log("8: Add Butter and Place Frying Pan on the Stove");
})

.then(function () {
  console.log("9: Cook the Sandwich");
});

