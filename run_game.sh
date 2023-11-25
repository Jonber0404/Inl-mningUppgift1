#!/bin/bash
echo "Jonathan Bergenstein"
mkdir Jonathan_Bergenstein_labb
cp Guesser.java Jonathan_Bergenstein_labb 
cp GuessingGame.java Jonathan_Bergenstein_labb 
cd Jonathan_Bergenstein_labb
pwd
echo "compiling..."
javac "Guesser.java"
javac "GuessingGame.java"
echo "running..."
java "GuessingGame"
echo "Done!"
echo "Removing class files..."
rm *.class
ls

