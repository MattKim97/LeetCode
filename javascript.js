

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


const mergeSort = (arr1,arr2) => {
    return arr1.concat(arr2).sort((a,b) => a - b)
}

console.log(mergeSort([1,2,3],[4,5,6]))
console.log(mergeSort([1,3,5],[2,4,6]))
console.log(mergeSort([1,3,5],[2,4,6,8,9,10,11,12,13,14,15,16,17,18,19,20]))


const bfs = (graph, start) => {
    const visited = []
    const queue = []
    queue.push(start)
    while(queue.length > 0){
        const node = queue.shift()
        if(!visited.includes(node)){
            visited.push(node)
            const neighbors = graph[node]
            for(let neighbor of neighbors){
                queue.push(neighbor)
            }
        }
    }
    return visited
}

const dfs = (graph, start) => {
    const visited = []
    const stack = []
    stack.push(start)
    while(stack.length > 0){
        const node = stack.pop()
        if(!visited.includes(node)){
            visited.push(node)
            const neighbors = graph[node]
            for(let neighbor of neighbors){
                stack.push(neighbor)
            }
        }
    }
    return visited
}


