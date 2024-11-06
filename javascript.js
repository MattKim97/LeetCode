

const calcAverage = (score1,score2,score3) => (score1 + score2 + score3)/3 // implicit return

// implicit vs explicit returns <- this is what its going to return
// explicit mean u see the return keyword

const scoreDolphins = calcAverage(44,23,71)
const scoreKoalas = calcAverage(65,54,49)

const scoreDolphins2 = calcAverage(85,52,41)
const scoreKoalas2 = calcAverage(23,24,37)

const scoreDolphins3 = calcAverage(2,3,4)
const scoreKoalas3 = calcAverage(2,3,4)

console.log(scoreDolphins)
console.log(scoreKoalas)
console.log(scoreDolphins2)
console.log(scoreKoalas2)


const checkWinner = function(avgDolphins,avgKoalas){
    if(avgDolphins > avgKoalas){
        console.log(`Dolphins win (${avgDolphins} vs. ${avgKoalas})`)
    }
    else if(avgKoalas > avgDolphins){
        console.log(`Koalas win (${avgKoalas} vs. ${avgDolphins})`)
    } 
    else {
        console.log("No team wins...")
    }
}

// function name, parameters, and then function(code block) within the {}
// parameters ( ) <- within your function are what is needed for your function to work!

checkWinner(scoreDolphins,scoreKoalas)
checkWinner(scoreDolphins2,scoreKoalas2)
checkWinner(scoreDolphins3,scoreDolphins3)

const arrayCreater = () => {
    const arr = []
    for(let i = 0; i < 10; i++){
        arr.push(i)
    }
    return arr
}

console.log(arrayCreater())
