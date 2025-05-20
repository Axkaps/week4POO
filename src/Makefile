SRC_DIR = src
PACKAGE = asciiart
JC = javac
JVM = java

all:
	$(JC) $(PACKAGE)/*.java App.java

run:
	$(JVM) App

clean:
	rm -f *.class
	rm -f $(PACKAGE)/*.class

list:
	@echo "Source files:"
	@echo "Main application:"
	@ls -la App.java
	@echo "Package files:"
	@ls -la $(PACKAGE)/*.java