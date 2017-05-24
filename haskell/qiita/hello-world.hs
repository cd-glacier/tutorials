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
	-- variable
	 where 
		a = 1
		b = -1
		c = a + b

