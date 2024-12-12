

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


const bubblesort = (arr) => {
    let swapped = false
    do {
        swapped = false
        for(let i = 0; i < arr.length; i++){
            if(arr[i] > arr[i+1]){
                let temp = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = temp
                swapped = true
            }
        }
    } while(swapped)
    return arr
}

const quicksort = (arr) => {
    if(arr.length <= 1){
        return arr
    }
    const pivot = arr[arr.length - 1]
    const left = []
    const right = []
    for(let i = 0; i < arr.length - 1; i++){
        if(arr[i] < pivot){
            left.push(arr[i])
        } else {
            right.push(arr[i])
        }
    }
    return [...quicksort(left),pivot,...quicksort(right)]
}

const insertionsort = (arr) => {
    for(let i = 1; i < arr.length; i++){
        let j = i
        while(j > 0 && arr[j-1] > arr[j]){
            let temp = arr[j]
            arr[j] = arr[j-1]
            arr[j-1] = temp
            j--
        }
    }
    return arr
}

const selectionsort = (arr) => {
    for(let i = 0; i < arr.length; i++){
        let min = i
        for(let j = i + 1; j < arr.length; j++){
            if(arr[j] < arr[min]){
                min = j
            }
        }
        if(i !== min){
            let temp = arr[i]
            arr[i] = arr[min]
            arr[min] = temp
        }
    }
    return arr
}

const graph = {
    0: [1,2],
    1: [2],
    2: [0,3],
    3: [3]
}

console.log(bfs(graph,2))
console.log(dfs(graph,2))


console.log(bubblesort([5,4,3,2,1]))
console.log(quicksort([5,4,3,2,1]))
console.log(insertionsort([5,4,3,2,1]))
console.log(selectionsort([5,4,3,2,1]))


const binarySearch = (arr, target) => {
    let left = 0
    let right = arr.length - 1
    while(left <= right){
        let mid = Math.floor((left + right) / 2)
        if(arr[mid] === target){
            return mid
        }
        if(arr[mid] < target){
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    return -1
}


console.log(binarySearch([1,2,3,4,5],3))
console.log(binarySearch([1,2,3,4,5],6))
console.log(binarySearch([1,2,3,4,5],0))
console.log(binarySearch([1,2,3,4,5],1))


const binarySearchRecursive = (arr, target, left = 0, right = arr.length - 1) => {
    if(left > right){
        return -1
    }
    let mid = Math.floor((left + right) / 2)
    if(arr[mid] === target){
        return mid
    }
    if(arr[mid] < target){
        return binarySearchRecursive(arr, target, mid + 1, right)
    } else {
        return binarySearchRecursive(arr, target, left, mid - 1)
    }
}

console.log(binarySearchRecursive([1,2,3,4,5],3))
console.log(binarySearchRecursive([1,2,3,4,5],6))
console.log(binarySearchRecursive([1,2,3,4,5],0))

const reverseLinkedList = (head) => {
    let prev = null
    let current = head
    while(current !== null){
        let next = current.next
        current.next = prev
        prev = current
        current = next
    }
    return prev
}

// first assign prev to null, then current to head
// while current is not null, assign next to current.next
// then assign current.next to prev
// then assign prev to current
// then assign current to next
// return prev

const reverseLinkedListRecursive = (head, prev = null) => {
    if(head === null){
        return prev
    }
    let next = head.next
    head.next = prev
    return reverseLinkedListRecursive(next, head)
}

// if head is null, return prev
// assign next to head.next
// assign head.next to prev
// return reverseLinkedListRecursive(next, head)



const mergeSortLinkedList = (head) => {
    if(head === null || head.next === null){
        return head
    }
    let mid = getMiddle(head)
    let left = mergeSortLinkedList(head)
    let right = mergeSortLinkedList(mid)
    return merge(left,right)
}

const getMiddle = (head) => {
    let slow = head
    let fast = head
    while(fast.next !== null && fast.next.next !== null){
        slow = slow.next
        fast = fast.next.next
    }
    let mid = slow.next
    slow.next = null
    return mid
}


const merge = (left,right) => {
    let dummy = new ListNode(0)
    let current = dummy
    while(left !== null && right !== null){
        if(left.val < right.val){
            current.next = left
            left = left.next
        } else {
            current.next = right
            right = right.next
        }
        current = current.next
    }
    if(left !== null){
        current.next = left
    }
    if(right !== null){
        current.next = right
    }
    return dummy.next
}

// if head is null or head.next is null, return head
// assign mid to getMiddle(head)
// assign left to mergeSortLinkedList(head)
// assign right to mergeSortLinkedList(mid)
// return merge(left,right)

// assign slow to head, fast to head
// while fast.next is not null and fast.next.next is not null
// assign slow to slow.next, fast to fast.next.next

// assign mid to slow.next
// assign slow.next to null
// return mid

// assign dummy to new ListNode(0)
// assign current to dummy
// while left is not null and right is not null
// if left.val is less than right.val
// assign current.next to left, left to left.next
// else assign current.next to right, right to right.next
// assign current to current.next
// if left is not null, assign current.next to left
// if right is not null, assign current.next to right

// return dummy.next


const quickSortLinkedList = (head) => {
    if(head === null || head.next === null){
        return head
    }
    let pivot = head
    let current = head.next
    let less = null
    let greater = null
    while(current !== null){
        let next = current.next
        if(current.val < pivot.val){
            current.next = less
            less = current
        } else {
            current.next = greater
            greater = current
        }
        current = next
    }
    let left = quickSortLinkedList(less)
    let right = quickSortLinkedList(greater)
    pivot.next = right
    if(left === null){
        return pivot
    }
    let tail = left
    while(tail.next !== null){
        tail = tail.next
    }
    tail.next = pivot
    return left
}

// if head is null or head.next is null, return head
