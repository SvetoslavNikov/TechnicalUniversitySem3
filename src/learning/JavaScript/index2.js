

//
// const {circleArea, squareArea} = require("./index.js");
// import {circleArea as circleA, squareArea as squareA} from "./index.js"
// console.log("circle area: " + circleA(process.argv[2]))
// console.log("square area: " + squareA(process.argv[3]))
import importedResources from 'index.js';
const { valueA, valueB } = importedResources; // Destructuring the object
console.log(valueA, valueB); // Outputs: 10 20