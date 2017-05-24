
{-
fib 0 = 0
fib 1 = 1
fib x = fib (x - 1) + fib (x - 2)
-}

fib x
  | x == 0 = 0
  | x == 1 = 1
	| otherwise = fib (x - 1) + fib (x - 2)

main = do
	print $ fib 5

