javac src/main/org/example/*.java -d out .
jar cfv calculator.jar out .
java -cp calculator org.example.Main add 1 2
