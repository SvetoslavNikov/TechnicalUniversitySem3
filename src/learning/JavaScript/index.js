const PI = Math.PI;

function circleArea(a){
    return a*a*PI
}
function squareArea(a){
    return a*a
}

// module.exports.circleArea = circleArea
// module.exports.squareArea = squareArea
// export {circleArea , squareArea};
const resources = {
    valueA: 10,
    valueB: 20,
    circleArea,
    squareArea
};

export default resources;
