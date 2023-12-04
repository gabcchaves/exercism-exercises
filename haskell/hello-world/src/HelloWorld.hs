module HelloWorld (hello) where

hello :: String
hello = "Hello, World!"

main :: IO()
main = do
	print hello
