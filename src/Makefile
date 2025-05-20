SRC_DIR = src
PACKAGE = asciiart
JC = javac
JVM = java
JAR = jar
JAR_FILE = App.jar

all:
	$(JC) $(PACKAGE)/*.java App.java

run:
	$(JVM) App

jar: all
	@echo "Main-Class: App" >> manifest.txt
	@echo "" >> manifest.txt
	$(JAR) cfm $(JAR_FILE) manifest.txt App.class $(PACKAGE)/*.class
	@rm manifest.txt
	@echo "Created JAR file: $(JAR_FILE)"

runjar: jar
	$(JVM) -jar $(JAR_FILE)

clean:
	rm -f *.class
	rm -f $(PACKAGE)/*.class

list:
	@echo "Source files:"
	@echo "Main application:"
	@ls -la App.java
	@echo "Package files:"
	@ls -la $(PACKAGE)/*.java