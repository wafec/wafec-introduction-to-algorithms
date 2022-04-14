all: java.class
	java -cp . InsertionSortImpl $(argument)

worstcase: java.class
	java -cp . InsertionSortImpl 4 3 2 1

bestcase: java.class
	java -cp . InsertionSortImpl 1 2 3 4

java.class:
	javac *.java

clean:
	rm -rf *.class