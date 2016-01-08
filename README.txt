# Zwischenstadium_FinalProj

## Idea: Hangman
"____ "
"|  | "
"|  O "
"| /|\"
"|  | "
"| / \"
Each strike has it's own string to show the Hanged Man.
1 - only the post
2 - noose
3 - head
4 - body
5,6 - arms
7,8 - legs

Variables:
	- player's answer
	- player's tries left
	- hangman display
	- actual answer
	- topics
		- possible phrases to be chosen as answer
	- wrong letters used
	- strike counter

Functionality:
	Methods:
	- check guess if valid
	- check if player's answer is complete
	- check if out of tries
	- print relevant info (e.g. guesses, answers, wrong letters used)
	- update player info (guess, answer, wrong letters, etc.)
	- random topic/phrase chooser
	------- Error Handling

Extra Bits:
	- set difficulty settings
