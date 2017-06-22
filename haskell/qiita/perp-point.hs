

perpPoint point line = 
	((a * c + b * d) / (a ** 2 + b ** 2), (b * c - a * d) / (a ** 2 + b ** 2))
	 where
		(a, b, c) = line
		(p, q) = point
		d = b * p - a * q

main = do
	print $ perpPoint point line
	 where
		point = (1, 2)
		line = (1, 2, 3)




	


