def plainOldSum(x: Int, y: Int) = x + y

def curriedSum(x: Int)(y: Int) = x + y

println(plainOldSum(1, 2))
println(curriedSum(1)(2))
//curriedSumは以下の手続きと同じ
def first(x: Int) = (y: Int) => x + y
val second = first(1)
println(second(2))


//place holder
val onePlus = curriedSum(1)_
val twoPlus = curriedSum(2)_
println(onePlus(2))
println(twoPlus(2))



