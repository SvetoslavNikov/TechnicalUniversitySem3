

const inventory = {
    sunglasses: 1900,
    pants: 1088,
    bags: 1344
};

// // Write your code below:
function myExecutor(resolve,reject) {
    if(inventory.sunglasses > 0){
        resolve("Sunglasses order processed.")
    } else{
        reject("That item is sold out")
    }
}

const orderSunglasses = () => {
    return new Promise(myExecutor)
}

const orderPromise = orderSunglasses()
console.log(orderPromise)








// const executorFunction = (resolve, reject) => {
//  if (someCondition) {
//      resolve('I resolved!');
//  } else {
//      reject('I rejected!');
//  }
// }
// const myFirstPromise = new Promise(executorFunction);