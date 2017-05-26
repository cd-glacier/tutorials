
sum' [] = 0
sum' (x:xs) = x + sum' xs

product' [] = 1
product' (x:xs) = x * product' xs

take' _ [] = []
take' n _ | n < 1  = []
take' n (x:xs) = [x] ++ take' (n - 1) xs

drop' _ [] = []
drop' n x | n < 1 = x
drop' n (_:xs) = drop (n - 1) xs

reverse' [] = []
reverse' (x:xs) = reverse' xs ++ [x]

fact' n  = product [1..n]

main = do
	print $ sum' a 
	print $ sum' a
	print $ take' 2 a
	print $ drop' 2 a
	print $ reverse' a
	print $ fact' 3
	 where a = [1, 2, 3]

