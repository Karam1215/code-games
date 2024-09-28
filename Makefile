install:
	mvn clean install

run:
	mvn exec:java -Dexec.mainClass="com.misis.codegames.App" -Dexec.args=""

lcm-game:
	mvn exec:java -Dexec.mainClass="com.misis.codegames.App" -Dexec.args="lcm"

progression-game:
	mvn exec:java -Dexec.mainClass="com.misis.codegames.App" -Dexec.args="progression"
