import Data.Char

rot13 "" = ""
rot13 (code:codes)
	| code <= 'M' = chr (ord code + 13) : rot13 codes
  | code >= 'N' = chr (ord code - 13) : rot13 codes


main = do
	print $ rot13 "ABCDEFGHIJKLMNOPQRSTUXWZ"

