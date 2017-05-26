{-
a = 1
b = 2
c = a + b
-}

-- function
f x = x + 1
add x y = x + y
-- pattern matching
g 5 = "5"
g x = "6"
-- function with pattern matching
fact 0 = 1
fact x = x * fact (x - 1)
-- split aarray
first (x:xs) = x
second (_:x:_) = x
-- length func
length' [] = 0
length' (_:xs) = 1 + length' xs
-- tapple
addsub x y = (x+y, x-y)

main = do
	print "Hello World!"
	print c
	print $ f 0
	print $ 2 `add` 0
	print $ (+) 2 1
	if a == 1
		then print "4"
		else print "tyauzo"
	print $ g 5
	print $ g 1
	print $ fact 3 + 1
	print $ d !! 8
	print $ first e
	print $ second e
	print $ length' d 
	print $ addsub 1 11
	-- variable
	 where 
		a = 1
		b = -1
		c = a + b
		d = [0..10]
		e = [9, 10]

